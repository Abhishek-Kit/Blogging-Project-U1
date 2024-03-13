package com.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto 
{
	private int id;
	
	//@NotNull(message = " name should Not null")
	private String name;
	
	//@Email(message = " Email should Valid")
	private String email;
	
//	@NotNull(message = "Password ")
	//@Size(min = 8,message="Atleat 8 char")
	private String password;
	
	//@NotNull(message = "Must right about Yourself")
	private String about;
}
