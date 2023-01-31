package springvalidation.belajarspringvalidation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import springvalidation.belajarspringvalidation.helper.StringHelper;

public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {
    @Autowired
    private StringHelper stringHelper;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return stringHelper.isPalindrome(value);
    }
}
