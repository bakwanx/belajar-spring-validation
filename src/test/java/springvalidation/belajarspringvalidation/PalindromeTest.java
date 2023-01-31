package springvalidation.belajarspringvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springvalidation.belajarspringvalidation.data.Foo;

import java.util.Set;

@SpringBootTest
public class PalindromeTest {

    @Autowired
    private Validator validator;

    @Test
    void palindromeValid() {
        Set<ConstraintViolation<Foo>> constraintViolation = validator.validate(new Foo("kodok"));
        Assertions.assertTrue(constraintViolation.isEmpty());
    }

    @Test
    void palindromeInvalid() {
        Set<ConstraintViolation<Foo>> constraintViolation = validator.validate(new Foo("hehe"));
        Assertions.assertFalse(constraintViolation.isEmpty());
        Assertions.assertEquals(1, constraintViolation.size());
    }

    @Test
    void palindromeInvalidMessage() {
        Set<ConstraintViolation<Foo>> constraintViolation = validator.validate(new Foo("hehe"));
        Assertions.assertFalse(constraintViolation.isEmpty());
        Assertions.assertEquals(1, constraintViolation.size());

        String message = constraintViolation.stream().findFirst().get().getMessage();
        Assertions.assertEquals("Data bukan palindrome", message);
    }
}
