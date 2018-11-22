package ee.tallink.persona.director;

import ee.tallink.persona.manager.Manager;

import java.util.List;

public class DirectorDto {

    private Long id;

    private List<Manager> managers;

    private String jobTitle;

    private String departmentName;

    public List<Manager> getManagers() {
        return managers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
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
