package com.example.demo;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}
	
//	 run as the program start 
	CommandLineRunner initdatabase(BookDao dao) {
		return args -> {
			dao.save(new Books("A Guide to the Bodhisattva Way of Life","Manu1", 15.111));
			dao.save(new Books("A Guide to the Bodhisattva Way of Life","Manu1", 15.1111));
			dao.save(new Books("A Guide to the Bodhisattva Way of Life","Manu1", 15.11111));
		};
	}

}
