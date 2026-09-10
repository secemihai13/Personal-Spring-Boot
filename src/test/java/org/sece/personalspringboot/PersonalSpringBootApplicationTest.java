package org.sece.personalspringboot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PersonalSpringBootApplicationTest {

    @Test
    void testMain() {
//        PersonalSpringBootApplication.main(new String[]{});

        Object response = ReflectionTestUtils.invokeMethod(new PersonalSpringBootApplication(), "privateMethod");
        System.out.println(response);
    }
}