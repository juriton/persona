package ee.tallink.persona.manager;

import ee.tallink.persona.employee.EmployeeRepository;
import ee.tallink.persona.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company/directors/{directorId}/managers")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @Autowired
    private ManagerMapper managerMapper;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/{managerId}")
    public ManagerDto findById(@PathVariable Long managerId) {
        Manager manager = managerService.findById(managerId);
        return managerMapper.toDto(manager);
    }

}
