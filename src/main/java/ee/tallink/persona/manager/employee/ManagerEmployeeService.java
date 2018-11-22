package ee.tallink.persona.manager.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerEmployeeService {

    @Autowired
    private ManagerEmployeeRepository managerEmployeeRepository;

    public ManagerEmployee save(ManagerEmployee managerEmployee) {
        return managerEmployeeRepository.save(managerEmployee);
    }

    public void removeEmployeeMembership(ManagerEmployee managerEmployee) {
        managerEmployeeRepository.delete(managerEmployee);
    }

    public ManagerEmployee findByEmployeeId(Long employeeId) {
        return managerEmployeeRepository.findOneByEmployeeId(employeeId);
    }
}
