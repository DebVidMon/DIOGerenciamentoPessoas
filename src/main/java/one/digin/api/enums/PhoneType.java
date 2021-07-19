package one.digin.api.enums;

import lombok.*;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Casa"),
    MOBILE("Celular"),
    COMMERCIAL("Comercial");

    private final String description;
}