package com.example.grocerystorestats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo") //URL's start w/ /demo after application path

public class MainController {

	@Autowired
	
	private UserRepository userRepository;
	
	@GetMapping(path="/add") // map ONLY POST requests
	public @ResponseBody String addNewUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email)
	{
		User n = new User();
		n.setFirstName(firstName);
		n.setLastName(lastName);
		n.setEmail(email);
		userRepository.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers()
	{
		//returns JSON w/ users
		return userRepository.findAll();
	}
	
}

