package ee.tallink.persona.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;


    Iterable<Company> findAll(Pageable page) {
        return companyRepository.findAll(page);
    }

}

