package arief.mahendra.test.service;

import arief.mahendra.test.data.Person;
import arief.mahendra.test.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    public void setUp(){
        personService = new PersonService(personRepository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        // menambah behavior mocking object
        Mockito.when(personRepository.selectById("EKO"))
                .thenReturn(new Person("eko", "eko"));

        var person = personService.get("EKO");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("eko", person.getName());
        Assertions.assertEquals("eko", person.getId());
    }

    @Test
    void testRegisterSuccess() {
        var person = personService.register("Arief");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Arief", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), person.getName()));
    }
}
