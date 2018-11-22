package ee.tallink.persona.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/company/directors/{directorId}/managers/{managerId}/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Employee> loadAll(Pageable page) {
        return employeeService.findAll(page);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, value = "/add")
    public EmployeeDto add(@PathVariable Long directorId, @PathVariable Long managerId, @RequestBody EmployeeDto employeeDto, HttpServletResponse response) throws IOException {

        if (!employeeService.isAllowAddEmployee(employeeDto, directorId)) {
            employeeService.addNewEmployee(employeeDto, managerId, employeeDto.getOrderNr());
            return employeeDto;
        } else {
            response.sendError(HttpStatus.METHOD_NOT_ALLOWED.value(), "Not allow to add");
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE, value = "{employeeId}/remove")
    public void remove(@PathVariable Long directorId, @PathVariable Long managerId, @PathVariable Long employeeId) {
        employeeService.removeEmployee(employeeId);


    }


}
