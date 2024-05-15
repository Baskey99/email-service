package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmailRequest;

public interface EmailRequestRepository extends JpaRepository<EmailRequest, Long>{

}
