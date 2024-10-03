
package tan.jerry.microservicesapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class MicroservicesAppTest {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Test that the microservice returns the correct message.
     */
    @Test
    public void testGetMessage() {
        String url = "http://localhost:8080/message";
        String response = restTemplate.getForObject(url, String.class);
        assertEquals("Welcome to the Microservice!", response, "The response should be 'Welcome to the Microservice!'.");
    }
}
