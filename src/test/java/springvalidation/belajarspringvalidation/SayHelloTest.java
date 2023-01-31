package springvalidation.belajarspringvalidation;

import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import springvalidation.belajarspringvalidation.helper.SayHello;

@SpringBootTest
public class SayHelloTest {

    @Autowired
    private SayHello sayHello;

    @Test
    void testSuccess(){
        String message = sayHello.sayHello("Farhan");
        Assertions.assertEquals("HelloFarhan", message);
    }

    @Test
    void testError(){
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
            sayHello.sayHello("");
        });
    }
}
