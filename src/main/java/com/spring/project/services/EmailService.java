package com.spring.project.services;

import org.springframework.mail.SimpleMailMessage;

import com.spring.project.domain.Cliente;
import com.spring.project.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
