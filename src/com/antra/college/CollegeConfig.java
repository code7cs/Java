package com.antra.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.antra.college")
public class CollegeConfig {

    @Bean
    public College collegeBean() {      // method name is the bean id
        // College college = new College();
        return new College();
    }
}
