package com.pn.anteater.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AnteaterPaymentDiscreteCenterApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AnteaterPaymentDiscreteCenterApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AnteaterPaymentDiscreteCenterApplication.class);
    }

}

