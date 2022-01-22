package com.example.solrwithjmetertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext-beans.xml")
public class SolrWithJmeterTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolrWithJmeterTestApplication.class, args);
    }

}
