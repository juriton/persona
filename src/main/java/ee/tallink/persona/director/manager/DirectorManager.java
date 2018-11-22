package ee.tallink.persona.director.manager;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ee.tallink.persona.director.Director;
import ee.tallink.persona.common.BaseEntity;
import ee.tallink.persona.manager.Manager;

import javax.persistence.*;

@Entity
@Table(name = "director_manager")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DirectorManager extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
