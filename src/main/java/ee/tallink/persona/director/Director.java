package ee.tallink.persona.director;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ee.tallink.persona.common.AuditedEntity;
import ee.tallink.persona.manager.Manager;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "director")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Director extends AuditedEntity {

    @OneToMany
    @JoinTable(name = "director_manager",
            joinColumns = @JoinColumn(name = "director_id"), inverseJoinColumns = @JoinColumn(name = "manager_id"))
    private List<Manager> managers;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "department_name")
    private String departmentName;


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }
}
