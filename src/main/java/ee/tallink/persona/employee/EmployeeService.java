package ee.tallink.persona.employee;

import ee.tallink.persona.director.Director;
import ee.tallink.persona.director.DirectorService;
import ee.tallink.persona.manager.Manager;
import ee.tallink.persona.manager.ManagerService;
import ee.tallink.persona.manager.employee.ManagerEmployee;
import ee.tallink.persona.manager.employee.ManagerEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DirectorService directorService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ManagerService managerService;

    @Autowired
    private ManagerEmployeeService managerEmployeeService;

    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }


    Iterable<Employee> findAll(Pageable page) {
        return employeeRepository.findAll(page);
    }

    public boolean isAllowAddEmployee(EmployeeDto employeeDto, Long directorId) {
        List<Director> directors = directorService.loadDirectors();
        for (Director director : directors) {
            if (director.id != directorId) {
                for (Manager manager : director.getManagers()) {
                    for (Employee employee : manager.getEmployees()) {
                        if (employeeDto.getUser().id == employee.getUser().id) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public EmployeeDto addNewEmployee(EmployeeDto newEmployeeDto, Long managerId, Integer orderNr) {
        Manager manager = managerService.findById(managerId);
        orderNr = Math.min(manager.getEmployees().size() + 1, orderNr);
        orderNr = Math.max(1, orderNr);

        List<Employee> employees = manager.getEmployees();

        for (Employee employee : employees) {
            if (employee.getOrderNr() != null && employee.getOrderNr() >= orderNr) {
                employee.setOrderNr(employee.getOrderNr() + 1);
            }
        }
        Employee newEmployee = employeeMapper.toEmployee(newEmployeeDto);
        newEmployee = employeeService.save(newEmployee);

        ManagerEmployee managerEmployee = new ManagerEmployee();
        managerEmployee.setManager(manager);
        managerEmployee.setEmployee(newEmployee);
        managerEmployeeService.save(managerEmployee);

        return employeeMapper.employeeToDto(newEmployee);
    }


    public void removeEmployee(Long employeeId) {
        ManagerEmployee managerEmployee = managerEmployeeService.findByEmployeeId(employeeId);
        managerEmployeeService.removeEmployeeMembership(managerEmployee);
        Employee employee = employeeRepository.findOne(employeeId);
        employeeRepository.delete(employee);

    }

}
