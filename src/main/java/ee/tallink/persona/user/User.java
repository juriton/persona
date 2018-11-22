package ee.tallink.persona.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ee.tallink.persona.common.AuditedEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static org.springframework.util.StringUtils.isEmpty;

@Entity
@Table(name = "\"user\"")
public class User extends AuditedEntity {

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "department_name")
    private String departmentName;

    @PrePersist
    protected void prePersist() {
        generateFullName();
    }

    @PreUpdate
    protected void preUpdate() {
        generateFullName();
    }

    private void generateFullName() {
        StringBuilder fullNameBuilder = new StringBuilder();
        if (!isEmpty(this.firstName)) {
            fullNameBuilder.append(this.firstName.trim()).append(" ");
        }
        if (!isEmpty(this.lastName)) {
            fullNameBuilder.append(this.lastName.trim());
        }
        this.fullName = fullNameBuilder.toString().trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
