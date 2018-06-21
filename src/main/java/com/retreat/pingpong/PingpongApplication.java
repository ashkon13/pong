package com.retreat.pingpong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication

@EntityScan(basePackageClasses = { 
		PingpongApplication.class,
		Jsr310JpaConverters.class 
})
@EnableAutoConfiguration
public class PingpongApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingpongApplication.class, args);
	}
}
