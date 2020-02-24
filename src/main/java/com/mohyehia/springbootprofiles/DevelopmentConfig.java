package com.mohyehia.springbootprofiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevelopmentConfig implements Configuration {
    @Override
    public String getName() {
        return "development profile";
    }
}
