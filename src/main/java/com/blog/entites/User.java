package com.blog.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="user_name",nullable=false ,length=100)
	@NotNull(message = " name should Not null")
	private String name;
	
	@Email(message = " Email should Valid")
	private String email;
	
	@NotNull(message = "Password ")
	@Size(min = 8,message="Atleat 8 char")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
	private String password;
	
	@NotNull(message = "Must right about Yourself")
	private String about;
}
