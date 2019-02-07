package com.demo.email;

import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test() {
	  
	  int a =90;
	  int b=90;
			  Assert.assertEquals(a, b);
  }  
			  @AfterClass
			  
			  public void  afterclass() throws EmailException
			  {
				  
				  SendEmail.sentEmail();
				  
			  }
			  
  }
