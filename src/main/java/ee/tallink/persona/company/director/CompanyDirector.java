package ee.tallink.persona.company.director;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ee.tallink.persona.director.Director;
import ee.tallink.persona.common.BaseEntity;
import ee.tallink.persona.company.Company;

import javax.persistence.*;

@Entity
@Table(name = "company_director")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyDirector  extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "director_id")
    private Director director;


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
