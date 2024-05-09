package com.elitech;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elitech.dao.UserRepository;
import com.elitech.entities.User;

@SpringBootApplication
public class DemojpaRepoApplication implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemojpaRepoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 User u1=new User(0,"user1","prenom1","email1","90000111",22);
		 User u2=new User(0,"user2","prenom2","email2","20000222",45);
		 userRepository.save(u1);
		 userRepository.save(u2);
		 System.out.println("--liste compléte--");
		 show(userRepository.findAll());
		 System.out.println("--user par nom ou prénom--");
		 show(userRepository.findByNomOrPrenom("user1", "prenom4"));
		 show(userRepository.findByNomAndPrenom("user1", "prenom4"));
	}
public void show(List<User> users)
{
	users.forEach(u->{
		System.out.println(u.toString());
	});
	
}
}
