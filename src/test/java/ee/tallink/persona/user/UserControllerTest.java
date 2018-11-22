package ee.tallink.persona.user;

import ee.tallink.persona.PersonaIntegrationTestBase;
import org.junit.Test;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UserControllerTest extends PersonaIntegrationTestBase {

    @Test
    public void loadAll() throws Exception {
        mockMvc.perform(get("/users?size=1000&page=0&sort=firstName,asc&sort=lastName,asc"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$['content']", hasSize(12)));
    }
}
