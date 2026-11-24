/*
 * Program 4 (part 2): testing NotificationClient with a mock MessageService.
 * No Spring container is used - the fake service is passed to the constructor.
 *
 * Run (inside program4-spring-di):
 *   mvn compile exec:java -Dexec.mainClass=com.nmit.di.NotificationClientTest
 *
 * Expected output:
 *   [MOCK] To: test@example.com | Message: Testing with a mock service
 */
package com.nmit.di;

public class NotificationClientTest {
    public static void main(String[] args) {
        // A fake MessageService is injected - no Spring, no real email needed
        MessageService mock = (to, msg) ->
                System.out.println("[MOCK] To: " + to + " | Message: " + msg);

        NotificationClient client = new NotificationClient(mock);
        client.notifyUser("test@example.com", "Testing with a mock service");
    }
}
