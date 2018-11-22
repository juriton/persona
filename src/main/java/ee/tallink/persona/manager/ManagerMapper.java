package ee.tallink.persona.manager;

import org.mapstruct.Mapper;


import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel="spring")
public interface ManagerMapper {

    ManagerDto toDto(Manager manager);

    Manager toManager(ManagerDto managerDto);

    default ManagerDto managerToDto(Manager manager) {
        ManagerDto managerDto = this.toDto(manager);
        return managerDto;
    }

    default List<ManagerDto> listToRest(List<Manager> managers) {
        return managers.stream().map(this::managerToDto).collect(Collectors.toList());
    }

}
