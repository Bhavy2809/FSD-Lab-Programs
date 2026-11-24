package com.nmit.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean
    public Engine engine() {
        return new Engine("Petrol");
    }

    // Singleton scope (default) with lifecycle callbacks and a dependency
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    @Scope("singleton")
    public Car car() {
        Car car = new Car(engine());
        car.setModel("Honda City");
        return car;
    }

    // Prototype scope: a new object for every getBean() call
    @Bean
    @Scope("prototype")
    public Ticket ticket() {
        return new Ticket();
    }
}
