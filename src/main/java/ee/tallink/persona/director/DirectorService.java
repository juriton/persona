package ee.tallink.persona.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DirectorService {

    @Autowired
    DirectorRepository directorRepository;

    public Director findById(Long id) {
        return directorRepository.findOne(id);
    }

    public List<Director> loadDirectors() {
       return  directorRepository.findAll();
    }

}
