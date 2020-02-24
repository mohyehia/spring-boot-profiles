package com.mohyehia.springbootprofiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootProfilesApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringBootProfilesApplication.class);

    private ApplicationProperties properties;
    private Configuration configuration;

    @Autowired
    public SpringBootProfilesApplication(ApplicationProperties properties, Configuration configuration) {
        this.properties = properties;
        this.configuration = configuration;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProfilesApplication.class, args);
    }

    @PostConstruct
    private void init(){
        logger.info("Spring Boot - active profile: " + configuration.getName());
        logger.info("Spring Boot - Choosing Your Profile and @Profile annotation example");
        logger.info(properties.toString());
    }

}
