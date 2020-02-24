package com.mohyehia.springbootprofiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProductionConfig implements Configuration {
    @Override
    public String getName() {
        return "production profile";
    }
}
