package com.mohyehia.springbootprofiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
public class ConfigurationTest {
    @Autowired
    private Configuration configuration;

    @Test
    public void testDevelopmentProfile(){
        assertThat(configuration.getName()).contains("development");
    }
}
