package com.raffaelbrandao.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

public class ProfileController {

    @Autowired
    private Environment env;

    @Value("${spring.profiles.active:}")
	private String activeProfiles;

    public void getActiveProfilesByEnvObject() {
        for (String profile : env.getActiveProfiles()) {
            System.out.println("Current active profile: " + profile);
        }
    }

    public void getActiveProfilesByValue() {
		for (String profile : activeProfiles.split(",")) {
		    System.out.println("Current active profile: " + profile);
		}
	}

}
