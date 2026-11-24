/*
 * Program 6: Book Management Application - Spring Boot and Thymeleaf
 * Aim: A Spring MVC web application to list, add and delete books using a
 *      controller, a model class and Thymeleaf templates.
 *
 * Author: Bhavy Shukla (1NT23CS042)
 *
 * ------------------------------------------------------------------
 * THINGS TO INSTALL (one time)
 *   1. JDK 17 or newer      (check: java -version)
 *   2. Apache Maven 3.9+    (check: mvn -v)
 *   Spring Boot 3.3.5 + Thymeleaf + embedded Tomcat come from pom.xml.
 *
 * STEPS TO EXECUTE
 *   Terminal (inside program6-book-management):
 *     mvn spring-boot:run
 *   Then open http://localhost:8080 in the browser (redirects to /books).
 *
 *   IDE (IntelliJ / Eclipse): open the folder as a Maven project, then
 *   right-click BookApplication.java -> Run.
 *
 * URLS
 *   GET  /books             -> list all books        (books.html)
 *   GET  /books/add         -> show add-book form    (add-book.html)
 *   POST /books/add         -> save book, back to list
 *   GET  /books/delete/{id} -> delete book, back to list
 *
 * Note: books are stored in an in-memory list, so they reset when the
 * application is restarted.
 * ------------------------------------------------------------------
 */
package com.nmit.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
}
