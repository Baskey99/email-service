package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmailRequest;
import com.example.demo.repository.EmailRequestRepository;

@Service
public class EmailServiceImp implements EmailService {

	@Autowired
	private JavaMailSender emailSender;
	
	 @Autowired
	    private EmailRequestRepository emailRequestRepository;


	@Override
	public void sendSimpleMessage(EmailRequest request) {
		
		// Save the email request to the database
        emailRequestRepository.save(request);
        
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setTo(request.gettoSend());
		message.setSubject(request.getSubject());
		message.setText(request.getText());
		emailSender.send(message);

	}

}
