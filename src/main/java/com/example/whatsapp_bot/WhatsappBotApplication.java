package com.example.whatsapp_bot;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WhatsappBotApplication {
	@PostConstruct
public void initFirebase() throws IOException {
    FileInputStream serviceAccount = new FileInputStream("src/main/resources/firebase-service-account.json");

    FirebaseOptions options = FirebaseOptions.builder()
        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        .build();

    FirebaseApp.initializeApp(options);
    System.out.println("✅ Firebase initialized successfully");
}


	public static void main(String[] args) {
		SpringApplication.run(WhatsappBotApplication.class, args);
	}

}
