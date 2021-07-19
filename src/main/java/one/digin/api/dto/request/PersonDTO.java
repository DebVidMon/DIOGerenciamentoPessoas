package one.digin.api.dto.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty
    private String email;

    @NotNull
    private String birthDate;
    
    @NotNull
    private String website;

    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;
}
