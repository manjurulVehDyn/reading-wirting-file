package com.example.readwritefile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.FileNotFoundException;

@SpringBootApplication
public class ReadWriteFileApplication {

	public static void main(String[] args) throws FileNotFoundException {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ReadWriteFileApplication.class, args);
		FileService fileService = configurableApplicationContext.getBean(FileService.class);
		fileService.testFile();
	}

}
