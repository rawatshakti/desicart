package com.desicart.config;

import com.mongodb.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

@Configuration
@EnableMongoRepositories
public class MongoDBConfig {

    //Reference - https://www.concretepage.com/spring-5/spring-data-mongotemplate
    public String getDatabaseName() {
        return "desicart";
    }

    @Bean
    public MongoClient mongoClient() {
//        ServerAddress address = new ServerAddress("cluster0-hdo9y.mongodb.net",27017);
//        MongoCredential credential = MongoCredential.createCredential("ultimatepda", getDatabaseName(), "April#123".toCharArray());
//        MongoClientOptions options = new MongoClientOptions.Builder().sslEnabled(true).build();
//        MongoClient client = new MongoClient(address, credential, options);

        MongoClient client = new MongoClient(new MongoClientURI("mongodb+srv://<user>:<password>@cluster0-hdo9y.mongodb.net/test?retryWrites=true&w=majority"));

        return client;
    }

    @Bean
    public MongoDbFactory mongoDbFactory() {
        MongoDbFactory factory = new SimpleMongoDbFactory(mongoClient(), getDatabaseName());
        return factory;
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        MongoTemplate template = new MongoTemplate(mongoDbFactory());
        return template;
    }
//    @Bean
//    MongoDatabase mongoDatabase() throws UnknownHostException {
//        MongoClient mongoClient = (MongoClient) MongoClients.create(
//                "mongodb+srv://ultimatepda:April%23123@cluster0-hdo9y.mongodb.net/test?retryWrites=true&w=majority");
//        MongoDatabase db = mongoClient.getDatabase("desicart");
//        //boolean auth = db.au.authenticate("ultimatepda", "April#123".toCharArray());
//        return db;
//    }


}


//public class MongoDBConfig extends AbstractMongoConfiguration {
//    @Override
//    public String getDatabaseName() {
//        return "desicart";
//    }
//    @Override
//    @Bean
//    public MongoClient mongoClient() {
//        ServerAddress address = new ServerAddress("cluster0-hdo9y.mongodb.net");
//        MongoCredential credential = MongoCredential.createCredential("ultimatepda", getDatabaseName(), "April#123".toCharArray());
//        MongoClientOptions options = new MongoClientOptions.Builder().build();
//
//        MongoClient client = new MongoClient(address, credential, options);
//        return client;
//    }
//}