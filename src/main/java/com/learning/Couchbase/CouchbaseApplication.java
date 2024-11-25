package com.learning.Couchbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.learning")
public class CouchbaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchbaseApplication.class, args);
	}

}
