# Program 6: Book Management Application (Spring Boot + Thymeleaf)
**Bhavy Shukla – 1NT23CS042**

A Spring MVC web application to **list, add and delete books**, using a controller, a model class and Thymeleaf templates.

## Things to install (one time)
| Tool | Version | Download | Check |
|---|---|---|---|
| Git | any | https://git-scm.com/downloads | `git --version` |
| JDK | 17+ | https://adoptium.net | `java -version` |
| Apache Maven | 3.9+ | https://maven.apache.org/download.cgi | `mvn -v` |

Spring Boot 3.3.5, Spring MVC, Thymeleaf and the embedded Tomcat server are all downloaded by Maven from `pom.xml`. You don't need to install Tomcat separately.

**Windows: Maven setup:** extract the Maven zip (e.g. `C:\maven`), add `C:\maven\bin` to the system **Path** variable, make sure `JAVA_HOME` points to your JDK, then reopen the terminal and run `mvn -v`.

**No Maven?** Open this folder in **IntelliJ IDEA**, then right-click `BookApplication.java` → **Run**.

## Get the code
This program is one folder of the **FSD-Lab-Programs** repo (all 6 programs are in it).
```bash
git clone https://github.com/Bhavy2809/FSD-Lab-Programs.git
cd FSD-Lab-Programs/program6-book-management
```
Later, to get updates (run inside `FSD-Lab-Programs`): `git pull`

## Run
```bash
mvn spring-boot:run
```
Wait for `Tomcat started on port 8080`, then open **http://localhost:8080** (it redirects to `/books`).
Stop with `Ctrl + C`.

## Pages
| URL | What it does | Template |
|---|---|---|
| `GET /books` | List all books | `books.html` |
| `GET /books/add` | Show the add-book form | `add-book.html` |
| `POST /books/add` | Save the book, go back to the list | — |
| `GET /books/delete/{id}` | Delete a book, go back to the list | — |

Starts with 2 books: *Clean Code* (Robert C. Martin) and *Effective Java* (Joshua Bloch).
Books are kept in an in-memory list, so they reset when the app restarts.

## Files
```
pom.xml
src/main/java/com/nmit/bookapp/
  BookApplication.java              @SpringBootApplication (main)
  config/WebConfig.java             redirects "/" to "/books"
  controller/BookController.java    list / add / delete
  model/Book.java                   id, title, author
src/main/resources/templates/
  books.html                        book table with Delete links
  add-book.html                     form (th:object, th:field)
```

## Common problems
| Problem | Fix |
|---|---|
| `mvn` is not recognized | Add Maven's `bin` folder to Path, then reopen the terminal |
| `release version 17 not supported` | Install JDK 17+ and set `JAVA_HOME` |
| `Port 8080 was already in use` | Stop the other app, or run on 8081: `mvn spring-boot:run "-Dspring-boot.run.arguments=--server.port=8081"` |
| Template / 500 error | Make sure the HTML files are in `src/main/resources/templates/` |
