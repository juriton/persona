package ee.tallink.persona.manager.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerEmployeeRepository extends JpaRepository<ManagerEmployee, Long>, JpaSpecificationExecutor<ManagerEmployee> {


    ManagerEmployee findOneByEmployeeId(Long employeeId);




}
