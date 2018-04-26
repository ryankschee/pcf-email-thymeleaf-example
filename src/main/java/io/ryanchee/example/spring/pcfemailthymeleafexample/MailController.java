package io.ryanchee.example.spring.pcfemailthymeleafexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	@Autowired
	MailClient mailClient;
	
	@RequestMapping("/send")
    public String sendMail(@RequestParam(value="message", defaultValue="Test") String message) {
        
		System.out.println("sendMail BEGIN");
		
		mailClient.prepareAndSend("ryan.kschee@gmail.com", message);
		
		return "OK";
    }
}
