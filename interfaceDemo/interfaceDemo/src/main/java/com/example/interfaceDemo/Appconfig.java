package com.example.interfaceDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.interfaceDemo")
@PropertySource("classpath:application.properties")
public class Appconfig {

}
