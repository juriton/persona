package ee.tallink.persona.director;


import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel="spring")
public interface DirectorMapper {

    DirectorDto toDto(Director director);

    Director toDirector(DirectorDto directorDto);

    default DirectorDto directorToDto(Director director) {
        DirectorDto directorDto = this.toDto(director);
        return directorDto;
    }

    default List<DirectorDto> listToRest(List<Director> directors) {
        return directors.stream().map(this::directorToDto).collect(Collectors.toList());
    }
}
