package arief.mahendra.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Integration-Test")
public class TagTest {

    @Test
    public void testIntegrationSuccess(){
        System.out.println("test integration 1 success");
    }

    @Test
    public void testIntegration1Success(){
        System.out.println("test integration 2 success");
    }

}
