package com.example.app;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


@EnableReactiveMongoRepositories
@Configuration
public class MongoCOnfig extends AbstractReactiveMongoConfiguration {

    // https://stackoverflow.com/questions/63107149/spring-boot-reactive-and-mongodb-command-insert-requires-authentication
    @Bean
    public MongoClient reactiveMongoClient() {
        return MongoClients.create("mongodb://test:test@localhost:27017/test?authSource=admin");
    }

    @Override
    protected String getDatabaseName() {
        return "test";
    }
}
