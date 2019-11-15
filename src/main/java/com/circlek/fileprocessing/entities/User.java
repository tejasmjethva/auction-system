package com.circlek.fileprocessing.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * 
 */
@Entity
@NamedQueries({ 
	@NamedQuery(name = User.FIND_BY_USERNAME_AND_PASSWORD, query = "FROM User WHERE Upper(username) = :username AND password = :password")})
public class User
{
	private static final long serialVersionUID = 1L;

	public static final String FIND_BY_USERNAME_AND_PASSWORD = "findByUsernameAndPassword";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Basic
	private String username;

	@Basic
	private String password;

	public User() 
	{
	
	}
	
	public User(String username) 
	{
		this.username = username;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}
}
