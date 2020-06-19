package com.eztour;


import com.eztour.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.Resource;

@SpringBootApplication
@EnableWebMvc
@ImportAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class EztourApplication {


    public static void main(String[] args) {
        SpringApplication.run(EztourApplication.class, args);
    }

//    @Bean
//    CommandLineRunner init(StorageService storageService) {
//        return (args) -> {
//            storageService.deleteAll();
//            storageService.init();
//        };
//    }
}
