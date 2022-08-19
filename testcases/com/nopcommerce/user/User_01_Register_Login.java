package com.nopcommerce.user;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class User_01_Register_Login {

	//toan cuc (global)
	String homePageURL = "";

	
  @BeforeClass
  public void beforeClass() {
  }

  @Test
  public void TC_01() {
	  //cuc bo (local): su dung trong pham vi cua testcase /ham
	  //bien local k co gia tri mac dinh
	  String homePageURL = "";
	  
	  if(3<5) {
		  String homePageTitle ="";
		  System.out.println(homePageTitle);
	  }
	  
	  System.out.println(homePageURL);
  }
  
  
  @Test
  public void TC_02() {
	  System.out.println(homePageURL);
  }
  
  @AfterClass
  public void afterClass() {
  }

}
