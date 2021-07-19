package one.digin.api.dto.request;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;
import one.digin.api.enums.PhoneType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}
