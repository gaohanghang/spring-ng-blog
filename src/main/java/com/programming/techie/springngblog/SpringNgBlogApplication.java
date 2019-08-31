package com.programming.techie.springngblog;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class SpringNgBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNgBlogApplication.class, args);
	}

}
