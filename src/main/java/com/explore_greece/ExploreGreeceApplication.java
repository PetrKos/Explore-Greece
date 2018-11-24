package com.explore_greece;

import com.explore_greece.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExploreGreeceApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExploreGreeceApplication.class, args);
    }

}

/*
    @Configuration : Any class annotated with @Configuration annotation
    is bootstrapped by Spring and is also considered as a source of other
    bean definitions.

    @EnableAutoConfiguration : This annotation tells Spring to automatically
    configure your application based on the dependencies that you have added
    in the pom.xml file.

    For example, If spring-data-jpa or spring-jdbc is in the classpath, then it
    automatically tries to configure a DataSource by reading the database properties
    from application.properties file.

    @ComponentScan : It tells Spring to scan and bootstrap other components
    defined in the current package (com.example.easynotes) and all the sub-packages.
*/
