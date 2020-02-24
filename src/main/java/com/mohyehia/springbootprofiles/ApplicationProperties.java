package com.mohyehia.springbootprofiles;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "app")
@Configuration
@Data
public class ApplicationProperties {
    private String name;
    private String email;
}
