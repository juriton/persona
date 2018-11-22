package ee.tallink.persona.director.manager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorManagerRepository extends JpaRepository<DirectorManager, Long>, JpaSpecificationExecutor<DirectorManager> {

}
