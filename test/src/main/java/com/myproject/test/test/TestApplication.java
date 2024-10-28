package com.myproject.test.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		 SpringApplication.run(TestApplication.class, args);
		System.out.println("Hello");
		// int i = 10;
		// for (int k = 0 ; k<i ; k++){
		// 	System.out.println("Test "+k);
		// }
	}

}
