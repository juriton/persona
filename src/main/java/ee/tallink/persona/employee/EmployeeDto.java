package ee.tallink.persona.employee;

import ee.tallink.persona.user.User;
public class EmployeeDto {

    private User user;

    private String jobTitle;

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
