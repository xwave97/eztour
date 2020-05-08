package com.eztour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ImportAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class EztourApplication {
    public static void main(String[] args) {
        SpringApplication.run(EztourApplication.class, args);
    }
}
