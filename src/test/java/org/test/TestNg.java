package org.test;

import org.base.BaseClass;
import org.pojo.Pojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg extends BaseClass{
	
	@BeforeClass
	private void browserLaunch() {

		launchBrowser();
		maxBrowser();
	}

	@AfterClass
	private void browserClose() {
		closebrowser();

	}

	@BeforeMethod
	public void startstime() {
		passUrl("https://en-gb.facebook.com/");

		
	}

	@AfterMethod
	public void endsTime() throws InterruptedException {

		Thread.sleep(3000);

	}
	

	@Test
	private void testCase1() {
		
		Pojo l=new Pojo();
		toInput(l.getTxtuser(),"Suresh");
		toInput(l.getTxtpass(),"Suresh@123");
		btnClick(l.getClkbtn());
		
		
		
	}
	
	@Test
	private void testCase2() throws InterruptedException {
		
		Pojo l1=new Pojo();
		toInput(l1.getTxtuser(),"Dinesh");
		toInput(l1.getTxtpass(),"Dinesh@356");
		btnClick(l1.getClkbtn());
		
		Thread.sleep(3000);
		
	

	}
	@Test(enabled=false)
	private void testCase3() {
		Pojo l2=new Pojo();
		toInput(l2.getTxtuser(),"Darvash");
		toInput(l2.getTxtpass(), "darvash@376");
		btnClick(l2.getClkbtn());

	}
	@Test
	private void testCase4() {
		Pojo l3=new Pojo();
		toInput(l3.getTxtuser(),"sureshsatz2000@gmail.com");
		toInput(l3.getTxtpass(), "9384646016");
		btnClick(l3.getClkbtn());


	}

}
