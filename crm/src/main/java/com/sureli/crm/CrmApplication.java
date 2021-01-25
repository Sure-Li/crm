package com.sureli.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.sureli.crm" })
@MapperScan(basePackages = { "com.sureli.crm" }, annotationClass = org.springframework.stereotype.Repository.class)
public class CrmApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
	}
}
