package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProducerApplication.class);

	}

	@Autowired
	private WikimediaChangesProducer wikimediaChangesProducer;
	
	@Override
	public void run(String... args) throws Exception {
		wikimediaChangesProducer.sendMessage();
		
	}

}

// producer is reading real time data from wikimedia and writing it to the topic 
//and consumer is reading from the topic