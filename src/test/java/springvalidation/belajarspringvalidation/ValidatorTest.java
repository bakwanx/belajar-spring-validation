package springvalidation.belajarspringvalidation;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springvalidation.belajarspringvalidation.data.Person;

import java.util.Set;

@SpringBootTest
public class ValidatorTest {

    @Autowired
    private Validator validator;

    @Test
    void personNotValid() {
        var person = new Person("","");

        Set<ConstraintViolation<Person>> constraintViolationSet = validator.validate(person);
        Assertions.assertFalse(constraintViolationSet.isEmpty());
        Assertions.assertEquals(2, constraintViolationSet.size());
    }

    @Test
    void personValid() {
        var person = new Person("1","Farhan");

        Set<ConstraintViolation<Person>> constraintViolationSet = validator.validate(person);
        Assertions.assertTrue(constraintViolationSet.isEmpty());

    }
}
