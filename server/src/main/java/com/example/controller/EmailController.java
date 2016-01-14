package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmailDAO;
import com.google.gson.Gson;

@RestController
@RequestMapping("/emails")
public class EmailController {
	
	private EmailDAO emailDAO = new EmailDAO();

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody String sayHello() {
    	if (this.emailDAO.getEmails().isEmpty()) {
			this.emailDAO.seed();
		}
    	String json = new Gson().toJson(this.emailDAO.getEmails());
        return json;
    }

}
