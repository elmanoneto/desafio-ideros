package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Email;



public class EmailDAO {
	
	private List<Email> emails = new ArrayList();
	
	public void addEmail(Email email) {
		emails.add(email);
	}
	
	public List getEmails() {
		return this.emails;
	}
	
	public void seed() {
		this.addEmail(new Email("Shawn Carter", null, "New voicemail from (877) 466-4411 at 5:19 AM", "Missed call from: (877) 466-4411 at 9:05 AM", true));
    	this.addEmail(new Email("Jason Cornwell", null, "Shutterbugg", "Hey man, did you have a chance to check out the new app? Just released it for iOS and Android. Curious to hear what you think!", true));
    	this.addEmail(new Email("Google Voice", null, "I'm different EOM", "", false));
    	this.addEmail(new Email("Antwan Patton", null, "Why so serious?", "I finally saw that movie you were talking about and really liked it! Thanks for the recommendation.", false));
    	this.addEmail(new Email("Shutterbugg", null, "This weekend", "Hi, are you around this weekend? Want to check out the new coffee shop that opened down the street?", false));
    	this.addEmail(new Email("Arielle Reinstein", null, "This weekend", "Hi, are you around this weekend? Want to check out the new coffee shop that opened down the street?", false));
	}

}
