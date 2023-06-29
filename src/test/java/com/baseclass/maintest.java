package com.baseclass;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.general.data;
import com.general.pom;

public class maintest extends base
{
	@Test
	public void login() throws FileNotFoundException
	{
		String user = data.fretch("Sheet1", 0, 0);
		String password = data.fretch("Sheet1", 0, 1);
		pom p= new pom(driver);
		p.username(user);
		p.pwd(password);
		p.btn();
	}
	
}
