package com.desicart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class DesicartApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesicartApplication.class, args);
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