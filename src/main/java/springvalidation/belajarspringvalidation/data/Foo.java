package springvalidation.belajarspringvalidation.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import springvalidation.belajarspringvalidation.validation.Palindrome;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo {

    @Palindrome
    private String bar;
}
