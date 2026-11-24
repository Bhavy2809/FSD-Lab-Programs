# FSD Lab Programs – Bhavy Shukla (1NT23CS042)

Six Full Stack Development lab programs: three in **React** and three in **Spring / Spring Boot**.
Every program is a separate, ready-to-run project in its own folder.

| No. | Program | Folder | Tech | Run command |
|---|---|---|---|---|
| 1 | Scholarship Analysis – Student Counter | `program1-scholarship-counter` | React | `npm install` → `npm start` |
| 2 | React Form with a Text Area | `program2-textarea-form` | React | `npm install` → `npm start` |
| 3 | Input Validation using useEffect | `program3-input-validation` | React | `npm install` → `npm start` |
| 4 | Spring Dependency Injection | `program4-spring-di` | Spring 6 | `mvn compile exec:java` |
| 5 | Spring Bean Scopes and Lifecycle | `program5-spring-bean-scopes` | Spring 6 | `mvn compile exec:java` |
| 6 | Book Management (Spring Boot + Thymeleaf) | `program6-book-management` | Spring Boot 3 | `mvn spring-boot:run` |

Each main source file also has the install and run steps written in a comment at the top.

---

## 1. Things to install (one time)

| Tool | Needed for | Version | Download | Check it works |
|---|---|---|---|---|
| **Git** | Cloning / pulling this repo | any | https://git-scm.com/downloads | `git --version` |
| **Node.js** (includes npm) | Programs 1–3 | 18 or newer (LTS) | https://nodejs.org | `node -v` and `npm -v` |
| **JDK** | Programs 4–6 | 17 or newer | https://adoptium.net (Temurin) | `java -version` |
| **Apache Maven** | Programs 4–6 | 3.9+ | https://maven.apache.org/download.cgi | `mvn -v` |

**Windows: installing Maven**
1. Download the *Binary zip archive* (`apache-maven-3.9.x-bin.zip`) and extract it, e.g. to `C:\maven`.
2. Search Windows for **"Edit the system environment variables"** → **Environment Variables**.
3. Under *System variables*, select **Path** → **Edit** → **New** → add `C:\maven\bin` (the folder you extracted, plus `\bin`).
4. Make sure `JAVA_HOME` points to your JDK folder (the Temurin installer can set this for you).
5. **Close and reopen** the terminal, then run `mvn -v`.

> **Shortcut for programs 4–6:** you can skip installing Maven by using **IntelliJ IDEA Community**. Open the program folder; IntelliJ detects `pom.xml`, downloads Spring automatically, and you can right-click the `MainApp` / `BookApplication` class → **Run**.

The first `npm install` / `mvn` run downloads libraries, so you need an internet connection.

---

## 2. Get the code

**First time (clone):**
```bash
git clone https://github.com/Bhavy2809/FSD-Lab-Programs.git
cd FSD-Lab-Programs
```

**Later (get the latest changes):**
```bash
cd FSD-Lab-Programs
git pull
```

---

## 3. How to run each program

### Programs 1, 2, 3 – React
```bash
cd program1-scholarship-counter      # or program2-textarea-form / program3-input-validation
npm install                          # first time only, creates node_modules
npm start                            # opens http://localhost:3000
```
Program 1 should show **Total students: 30**, **Distinction: 9**, **First Class: 15**.

Stop the server with `Ctrl + C`. Only one React app can use port 3000 at a time. If another one is running, stop it, or press `Y` when npm asks to use a different port.

### Program 4 – Spring Dependency Injection
```bash
cd program4-spring-di
mvn compile exec:java                                                         # main program
mvn compile exec:java -Dexec.mainClass=com.nmit.di.NotificationClientTest     # mock test
```
Expected output:
```
Email sent to student@example.com : Dependency Injection works!
[MOCK] To: test@example.com | Message: Testing with a mock service
```

> **Windows PowerShell:** put the `-D` argument in quotes:
> `mvn compile exec:java "-Dexec.mainClass=com.nmit.di.NotificationClientTest"`

### Program 5 – Spring Bean Scopes and Lifecycle
```bash
cd program5-spring-bean-scopes
mvn compile exec:java
```
Expected output:
```
Engine bean created: Petrol
Car constructor: Engine dependency injected
Car init(): bean initialised, model = Honda City
Honda City is running with Petrol engine
Singleton -> c1 == c2 ? true
Ticket bean created, id = 1
Ticket bean created, id = 2
Prototype -> t1 == t2 ? false
Car cleanup(): bean is being destroyed
```

### Program 6 – Book Management (Spring Boot + Thymeleaf)
```bash
cd program6-book-management
mvn spring-boot:run
```
Wait for `Tomcat started on port 8080`, then open **http://localhost:8080** (it redirects to `/books`).
Stop with `Ctrl + C`.

---

## 4. Common problems

| Problem | Fix |
|---|---|
| `npm` / `node` is not recognized | Install Node.js, then **reopen** the terminal |
| `mvn` is not recognized | Add Maven's `bin` folder to `Path` (see section 1), then reopen the terminal |
| `release version 17 not supported` | Your JDK is older than 17. Install JDK 17+ and set `JAVA_HOME` |
| `Port 8080 was already in use` | Stop the other app, or run on 8081: `mvn spring-boot:run "-Dspring-boot.run.arguments=--server.port=8081"` |
| `Something is already running on port 3000` | Stop the other React app, or press `Y` to use another port |
| React page is blank | Check the terminal for errors, and make sure you ran `npm install` in **that** program's folder |

---

## Repository layout
```
FSD-Lab-Programs/
├── README.md
├── program1-scholarship-counter/   package.json, public/index.html, src/App.js, src/index.js
├── program2-textarea-form/         package.json, public/index.html, src/TextAreaForm.js, src/index.js
├── program3-input-validation/      package.json, public/index.html, src/ValidatedInput.js, src/index.js
├── program4-spring-di/             pom.xml, src/main/java/com/nmit/di/*.java
├── program5-spring-bean-scopes/    pom.xml, src/main/java/com/nmit/beans/*.java
└── program6-book-management/       pom.xml, src/main/java/com/nmit/bookapp/**, src/main/resources/templates/*.html
```
