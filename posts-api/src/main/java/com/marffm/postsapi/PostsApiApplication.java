package com.marffm.postsapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PostsApiApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PostsApiApplication.class).run();
    }

}
