package org.umtuk.sample.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableMongoAuditing
@EnableMongoRepositories
public class AuthSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthSampleApplication.class, args);
	}

}
