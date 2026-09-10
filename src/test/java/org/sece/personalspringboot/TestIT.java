package org.sece.personalspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestIT {

    @Test
    public void contextLoads() {
        // This test will pass if the application context loads successfully
    }
}
