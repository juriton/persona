package ee.tallink.persona.employee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ee.tallink.persona.common.AuditedEntity;
import ee.tallink.persona.user.User;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.Column;

@Entity
@Table(name = "EMPLOYEE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee extends AuditedEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @JoinColumn(name = "job_title")
    private String jobTitle;

    @Column(name = "order_nr")
    private Integer orderNr;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(Integer orderNr) {
        this.orderNr = orderNr;
    }
}

