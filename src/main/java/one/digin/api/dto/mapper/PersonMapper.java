package one.digin.api.dto.mapper;

import org.mapstruct.*;

import one.digin.api.dto.request.PersonDTO;
import one.digin.api.entity.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
