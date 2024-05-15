package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_table")
public class EmailRequest {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String toSend;
    private String subject;
    private String text;
    private String mobileNumber;
    private String name;
    
	public EmailRequest() {
		super();
		// toSendDO AutoSend-generated constructoSendr stub
	}
	
	public EmailRequest(Long id, String toSend, String subject, String text, String mobileNumber, String name) {
		super();
		this.id = id;
		this.toSend = toSend;
		this.subject = subject;
		this.text = text;
		this.mobileNumber = mobileNumber;
		this.name = name;
	}

	public String gettoSend() {
		return toSend;
	}
	public String getSubject() {
		return subject;
	}
	public String getText() {
		return text;
	}
	public void settoSend(String toSend) {
		this.toSend = toSend;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public Long getId() {
		return id;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmailRequest [id=" + id + ", toSend=" + toSend + ", subject=" + subject + ", text=" + text + ", mobileNumber="
				+ mobileNumber + ", name=" + name + "]";
	}

	    

}
