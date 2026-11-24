/*
 * Program 5: Spring Bean Scopes and Lifecycle
 * Aim: Defines beans with @Configuration and @Bean, compares singleton and
 *      prototype scopes, and shows init and destroy lifecycle callbacks.
 *
 * Author: Bhavy Shukla (1NT23CS042)
 *
 * ------------------------------------------------------------------
 * THINGS TO INSTALL (one time)
 *   1. JDK 17 or newer      (check: java -version)
 *   2. Apache Maven 3.9+    (check: mvn -v)
 *   Spring (spring-context 6.1.14) is downloaded automatically by Maven.
 *
 * STEPS TO EXECUTE
 *   Terminal (inside program5-spring-bean-scopes):
 *     mvn compile exec:java
 *
 *   IDE (IntelliJ / Eclipse): open the folder as a Maven project, then
 *   right-click MainApp.java -> Run.
 *
 * EXPECTED OUTPUT
 *   Engine bean created: Petrol
 *   Car constructor: Engine dependency injected
 *   Car init(): bean initialised, model = Honda City
 *   Honda City is running with Petrol engine
 *   Singleton -> c1 == c2 ? true
 *   Ticket bean created, id = 1
 *   Ticket bean created, id = 2
 *   Prototype -> t1 == t2 ? false
 *   Car cleanup(): bean is being destroyed
 * ------------------------------------------------------------------
 */
package com.nmit.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        // Singleton: both references point to the same object
        Car c1 = context.getBean(Car.class);
        Car c2 = context.getBean(Car.class);
        c1.drive();
        System.out.println("Singleton -> c1 == c2 ? " + (c1 == c2));

        // Prototype: each call creates a new object
        Ticket t1 = context.getBean(Ticket.class);
        Ticket t2 = context.getBean(Ticket.class);
        System.out.println("Prototype -> t1 == t2 ? " + (t1 == t2));

        // Triggers the destroy callback of singleton beans
        context.close();
    }
}
