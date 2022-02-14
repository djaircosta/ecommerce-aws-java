package com.daytech.ecommerce_aws;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class EcommerceAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAwsApplication.class, args);
	}

}
