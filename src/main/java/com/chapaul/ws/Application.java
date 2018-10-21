package com.chapaul.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chapaul.ws.repository.MonsterRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private MonsterRepository monsterRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
//		 monsterRepository.init();
	}
}
