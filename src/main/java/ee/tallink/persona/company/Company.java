package ee.tallink.persona.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ee.tallink.persona.director.Director;
import ee.tallink.persona.common.AuditedEntity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "company")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company extends AuditedEntity {

    @NotNull
    @Column(name = "company_name")
    private String companyName;

    @OneToMany
    @JoinTable(name = "company_director",
            joinColumns = @JoinColumn(name = "company_id"), inverseJoinColumns = @JoinColumn(name = "director_id"))
    private List<Director> directors;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }
}
