# Program 4: Spring Dependency Injection
**Bhavy Shukla – 1NT23CS042**

Constructor injection of a `MessageService` into `NotificationClient` using `@Component`, `@Qualifier` and component scanning, plus a test with a mock service.

## Things to install (one time)
| Tool | Version | Download | Check |
|---|---|---|---|
| Git | any | https://git-scm.com/downloads | `git --version` |
| JDK | 17+ | https://adoptium.net | `java -version` |
| Apache Maven | 3.9+ | https://maven.apache.org/download.cgi | `mvn -v` |

Spring (`spring-context 6.1.14`) is downloaded automatically by Maven from `pom.xml`, so you don't need to download any JAR by hand.

**Windows: Maven setup:** extract the Maven zip (e.g. `C:\maven`), add `C:\maven\bin` to the system **Path** variable, make sure `JAVA_HOME` points to your JDK, then reopen the terminal and run `mvn -v`.

**No Maven?** Open this folder in **IntelliJ IDEA**. It reads `pom.xml` and downloads Spring. Then right-click `MainApp.java` → **Run**.

## Get the code
This program is one folder of the **FSD-Lab-Programs** repo (all 6 programs are in it).
```bash
git clone https://github.com/Bhavy2809/FSD-Lab-Programs.git
cd FSD-Lab-Programs/program4-spring-di
```
Later, to get updates (run inside `FSD-Lab-Programs`): `git pull`

## Run
```bash
mvn compile exec:java                                                       # main program
mvn compile exec:java -Dexec.mainClass=com.nmit.di.NotificationClientTest   # mock test
```
On **Windows PowerShell**, quote the `-D` argument:
```powershell
mvn compile exec:java "-Dexec.mainClass=com.nmit.di.NotificationClientTest"
```

## Expected output
```
Email sent to student@example.com : Dependency Injection works!
```
Mock test:
```
[MOCK] To: test@example.com | Message: Testing with a mock service
```
To switch to SMS, change `@Qualifier("emailService")` to `@Qualifier("smsService")` in `NotificationClient.java`.

## Files
```
pom.xml                         spring-context dependency + exec plugin
src/main/java/com/nmit/di/
  MessageService.java           interface
  EmailService.java             @Component("emailService")
  SmsService.java               @Component("smsService")
  NotificationClient.java       constructor injection with @Qualifier
  AppConfig.java                @Configuration + @ComponentScan
  MainApp.java                  starts the Spring container
  NotificationClientTest.java   test with a mock (no Spring)
```

## Common problems
| Problem | Fix |
|---|---|
| `mvn` is not recognized | Add Maven's `bin` folder to Path, then reopen the terminal |
| `release version 17 not supported` | Install JDK 17+ and set `JAVA_HOME` |
| Download errors on first run | Check your internet connection; Maven downloads Spring the first time |
