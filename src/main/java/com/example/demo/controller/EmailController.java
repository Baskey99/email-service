package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmailRequest;
import com.example.demo.repository.EmailRequestRepository;
import com.example.demo.service.EmailService;

@RestController
@CrossOrigin("*")
public class EmailController {
	
	@Autowired
    private EmailService emailService;
	

    @Autowired
    private EmailRequestRepository emailRequestRepository;


    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
    	
    	// Save the email request to the database
        emailRequestRepository.save(request);
    	
        emailService.sendSimpleMessage(request);
		return new ResponseEntity<String>("Your submission was successful.", HttpStatus.OK);
    }

}
