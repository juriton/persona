package ee.tallink.persona.employee;

import com.fasterxml.jackson.databind.ObjectMapper;
import ee.tallink.persona.PersonaIntegrationTestBase;
import ee.tallink.persona.user.User;
import ee.tallink.persona.user.UserDto;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class EmployeeControllerTest extends PersonaIntegrationTestBase {

    @Test
    public void testEmployees() throws Exception {
        mockMvc.perform(get("/company/directors/1/managers/1/employees").contentType(APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$['content']", hasSize(5)));
    }

    @Test
    public void testEmployeeDeletion() throws Exception {

        // remove employee
        mockMvc.perform(
                delete("/company/directors/1/managers/1/employees/1/remove").contentType(APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }

    @Test
    public void testAddEmployee() throws Exception {
        User user = new User();
        user.id = new Long(1);
        user.setFirstName("Andres");
        user.setLastName("Andresson");
        user.setFullName("Andres Andresson");

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setUser(user);
        employeeDto.setJobTitle("employee");
        employeeDto.setOrderNr(2);

        String requestBody = new ObjectMapper().writeValueAsString(employeeDto);

        MvcResult mvcResult = mockMvc.perform(
                post("/company/directors/1/managers/1/employees/add")
                        .contentType(APPLICATION_JSON_VALUE).content(requestBody)).
                andExpect(status().isOk()).
                andExpect(jsonPath("$.user.id", Matchers.isA(Integer.class))).
                andExpect(jsonPath("$.orderNr", Matchers.notNullValue())).
                andExpect(jsonPath("$.user.fullName", Matchers.notNullValue())).
                andReturn();
    }

}
