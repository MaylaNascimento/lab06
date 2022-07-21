package edu.ifma.lpweb.musicbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MusicBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicBookApplication.class, args);
    }
}
