package arief.mahendra.test.repository;

import arief.mahendra.test.data.Person;

public interface PersonRepository {
    Person selectById(String id);

    void insert(Person person);
}
