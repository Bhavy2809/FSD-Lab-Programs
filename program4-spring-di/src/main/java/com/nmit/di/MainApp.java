/*
 * Program 4: Spring Dependency Injection
 * Aim: Constructor injection of a MessageService into NotificationClient using
 *      @Component, @Qualifier and component scanning, plus a test with a mock.
 *
 * Author: Bhavy Shukla (1NT23CS042)
 *
 * ------------------------------------------------------------------
 * THINGS TO INSTALL (one time)
 *   1. JDK 17 or newer      (check: java -version)
 *   2. Apache Maven 3.9+    (check: mvn -v)
 *   Spring (spring-context 6.1.14) is downloaded automatically by Maven
 *   from pom.xml - no manual JAR download needed.
 *
 * STEPS TO EXECUTE
 *   Terminal (inside program4-spring-di):
 *     mvn compile exec:java
 *     mvn compile exec:java -Dexec.mainClass=com.nmit.di.NotificationClientTest
 *
 *   IDE (IntelliJ / Eclipse): open the folder as a Maven project, wait for
 *   dependencies to download, then right-click MainApp.java -> Run.
 *
 * EXPECTED OUTPUT
 *   Email sent to student@example.com : Dependency Injection works!
 * ------------------------------------------------------------------
 */
package com.nmit.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationClient client = context.getBean(NotificationClient.class);
        client.notifyUser("student@example.com", "Dependency Injection works!");

        context.close();
    }
}
