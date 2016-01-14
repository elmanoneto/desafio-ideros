package com.example.model;

import java.util.Date;

public class Email {
	
	private String from;
	private Date datetime;
	private String subject;
	private String menssage;
	private Boolean unread;
	
	
	
	public Email(String from, Date datetime, String subject, String menssage, Boolean unread) {
		super();
		this.from = from;
		this.datetime = datetime;
		this.subject = subject;
		this.menssage = menssage;
		this.unread = unread;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMenssage() {
		return menssage;
	}
	public void setMenssage(String menssage) {
		this.menssage = menssage;
	}
	public Boolean getUnread() {
		return unread;
	}
	public void setUnread(Boolean unread) {
		this.unread = unread;
	}


}
