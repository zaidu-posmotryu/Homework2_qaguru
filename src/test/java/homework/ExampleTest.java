package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {

    @Test
    void exampleTest0() {
        Assertions.assertTrue(new Random().nextInt() > 2);
    }

    @Test
    void exampleTest1() {
        Assertions.assertTrue(new Random().nextInt() > 3);
    }
}
