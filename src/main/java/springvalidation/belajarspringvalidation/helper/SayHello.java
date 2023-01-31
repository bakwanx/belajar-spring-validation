package springvalidation.belajarspringvalidation.helper;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Set;

@Component
public class SayHello implements ISayHello{

    public String sayHello(@NotBlank String name){
        return "Hello" + name;
    }
}
