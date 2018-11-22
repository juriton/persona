package ee.tallink.persona.manager;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ee.tallink.persona.common.AuditedEntity;
import ee.tallink.persona.employee.Employee;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manager")
public class Manager extends AuditedEntity {

    @OneToMany
    @JoinTable(name = "manager_employee",
            joinColumns = @JoinColumn(name = "manager_id"), inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private List<Employee> employees;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "department_name")
    private String departmentName;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
