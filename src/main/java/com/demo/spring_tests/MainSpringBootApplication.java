package com.demo.spring_tests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableCaching
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.demo.spring_tests"})
public class MainSpringBootApplication 
{
    public static void main( String[] args )
    {
      SpringApplication.run(MainSpringBootApplication.class, args);
    }
}
