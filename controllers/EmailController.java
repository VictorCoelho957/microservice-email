package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import services.EmailService;

@RestController
public class EmailController {
	@Autowired
	EmailService emailservice;

}
