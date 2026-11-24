# Program 5: Spring Bean Scopes and Lifecycle
**Bhavy Shukla – 1NT23CS042**

Defines beans with `@Configuration` and `@Bean`, compares **singleton** and **prototype** scopes, and shows the **init** and **destroy** lifecycle callbacks.

## Things to install (one time)
| Tool | Version | Download | Check |
|---|---|---|---|
| Git | any | https://git-scm.com/downloads | `git --version` |
| JDK | 17+ | https://adoptium.net | `java -version` |
| Apache Maven | 3.9+ | https://maven.apache.org/download.cgi | `mvn -v` |

Spring (`spring-context 6.1.14`) is downloaded automatically by Maven from `pom.xml`.

**Windows: Maven setup:** extract the Maven zip (e.g. `C:\maven`), add `C:\maven\bin` to the system **Path** variable, make sure `JAVA_HOME` points to your JDK, then reopen the terminal and run `mvn -v`.

**No Maven?** Open this folder in **IntelliJ IDEA**, then right-click `MainApp.java` → **Run**.

## Get the code
This program is one folder of the **FSD-Lab-Programs** repo (all 6 programs are in it).
```bash
git clone https://github.com/Bhavy2809/FSD-Lab-Programs.git
cd FSD-Lab-Programs/program5-spring-bean-scopes
```
Later, to get updates (run inside `FSD-Lab-Programs`): `git pull`

## Run
```bash
mvn compile exec:java
```

## Expected output
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
- **Singleton:** the Car is created **once**, so `c1 == c2` is `true`.
- **Prototype:** a new Ticket is created on **every** `getBean()`, so `t1 == t2` is `false`.
- `init()` runs after the bean is created; `cleanup()` runs on `context.close()`.

## Files
```
pom.xml                            spring-context dependency + exec plugin
src/main/java/com/nmit/beans/
  Engine.java                      dependency of Car
  Car.java                         init() / cleanup() lifecycle methods
  Ticket.java                      prototype bean with a counter
  BeanConfig.java                  @Configuration, @Bean, @Scope
  MainApp.java                     starts the container and compares scopes
```

## Common problems
| Problem | Fix |
|---|---|
| `mvn` is not recognized | Add Maven's `bin` folder to Path, then reopen the terminal |
| `release version 17 not supported` | Install JDK 17+ and set `JAVA_HOME` |
| Download errors on first run | Check your internet connection |
