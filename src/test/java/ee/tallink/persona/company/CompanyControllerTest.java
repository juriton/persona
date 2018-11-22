package ee.tallink.persona.company;


import ee.tallink.persona.PersonaIntegrationTestBase;
import org.junit.Test;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CompanyControllerTest extends PersonaIntegrationTestBase {

    @Test
    public void load() throws Exception {
        mockMvc.perform(get("/company/structure"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$['content']", hasSize(1)));
    }
}
