package io.turntabl.springbootdemo;

import io.turntabl.springbootdemo.model.Maths;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringbootdemoApplication {

	@Bean
	public Maths getMathFunctions(){
		return new Maths();
	}


	public static void main(String[] args) {

		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
