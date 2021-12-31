package com.marffm.usersapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class UsersApiApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(UsersApiApplication.class).run();
    }

}
