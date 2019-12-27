package com.ats.command;

import java.util.Date;

import lombok.Data;

@Data
public class UserCommand {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private Long phoneNo;
	private Date dateOfBirth;
	private String gender;
	private String country;
	private String state;
	private String city;
}//class
