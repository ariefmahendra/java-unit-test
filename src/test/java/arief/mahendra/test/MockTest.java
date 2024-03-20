package arief.mahendra.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockTest {

    @Test
    void testMock() {

        // membuat mock object
        List<String> list = Mockito.mock(List.class);

        // menambah behaviour ke mock object
        Mockito.when(list.get(0)).thenReturn("Eko");

        // memanggil method get
        System.out.println(list.get(0));

        // Test Mock + disini juga kita memanggil method list.get
        assertEquals("Eko", list.get(0));

        // Verify mock
        // contoh disini kita memanggil method get(0) sekali di sout
        Mockito.verify(list, Mockito.times(2)).get(0);

    }
}
