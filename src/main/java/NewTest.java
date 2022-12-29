import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewTest {

    @Test
    void newTest() {
        int i = 42;
        System.out.println("My code is the best test");
        Assertions.assertTrue(i > 2);
    }
}