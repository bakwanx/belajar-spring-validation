package springvalidation.belajarspringvalidation.properties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.executable.ValidateOnExecution;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@Validated
@ConfigurationProperties("database")
public class DatabaseProperties {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
