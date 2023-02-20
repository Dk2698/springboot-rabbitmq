package com.kumar.springbootrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitmqApplication.class, args);
	}
	//docker pull rabbitmq:3.11.9-management
	//docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.11.9-management
}
