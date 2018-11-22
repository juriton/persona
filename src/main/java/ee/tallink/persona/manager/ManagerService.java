package ee.tallink.persona.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public Manager findById(Long id) {
        return managerRepository.findOne(id);
    }
}
