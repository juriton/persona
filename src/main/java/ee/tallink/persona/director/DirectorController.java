package ee.tallink.persona.director;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company/directors")
public class DirectorController {

    @Autowired
    DirectorService directorService;

    @Autowired
    DirectorMapper directorMapper;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/{directorId}")
    public DirectorDto findById(@PathVariable Long directorId) {
        Director director = directorService.findById(directorId);
        return directorMapper.toDto(director);
    }
}
