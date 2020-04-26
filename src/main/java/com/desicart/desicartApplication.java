package com.desicart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class desicartApplication {

    public static void main(String[] args) {
        SpringApplication.run(desicartApplication.class, args);
        //openHomePage();

    }

//    private static void openHomePage() {
//        try {
//            URI homepage = new URI("http://localhost:9090/");
//            Desktop.getDesktop().browse(homepage);
//        } catch (URISyntaxException | IOException e) {
//            e.printStackTrace();
//        }
//    }
}