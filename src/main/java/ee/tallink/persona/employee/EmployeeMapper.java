package ee.tallink.persona.employee;

import ee.tallink.persona.user.User;
import ee.tallink.persona.user.UserDto;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel="spring")
public interface EmployeeMapper {

    EmployeeDto toDto(Employee employee);

    Employee toEmployee(EmployeeDto employeeDto);

    UserDto map(User user);

    User map(UserDto userDto);

    default EmployeeDto employeeToDto(Employee employee) {
        EmployeeDto employeeDto = this.toDto(employee);
        return employeeDto;
    }

    default List<EmployeeDto> listToRest(List<Employee> employees) {
        return employees.stream().map(this::employeeToDto).collect(Collectors.toList());
    }
}
