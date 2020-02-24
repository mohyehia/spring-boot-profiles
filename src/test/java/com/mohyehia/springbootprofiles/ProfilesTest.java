package com.mohyehia.springbootprofiles;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProfilesTest {
    @Rule
    public OutputCaptureRule captureRule = new OutputCaptureRule();

    @BeforeEach
    public static void before(){
        System.clearProperty("spring.profiles.active");
    }

    @Test
    public void testDevelopmentProfile(){
        System.setProperty("spring.profiles.active", "dev");
        SpringBootProfilesApplication.main(new String[]{});
        assertThat(getConsoleOutput())
                .contains("development@mail.com")
                .contains("Spring Boot Profiles");
    }

    @Test
    public void testProductionProfile(){
        System.setProperty("spring.profiles.active", "prod");
        SpringBootProfilesApplication.main(new String[]{});
        assertThat(getConsoleOutput())
                .contains("production@mail.com")
                .contains("Spring Boot Profiles");
    }

    private String getConsoleOutput(){
        return captureRule.toString();
    }
}
