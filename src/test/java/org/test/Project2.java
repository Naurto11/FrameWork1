package org.test;

import org.base.BaseClass;
import org.login.Loginpojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Project2 extends BaseClass {
	
	
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
		passUrl("https://www.amazon.in/");
		
	}

	@AfterMethod
	public void endsTime() throws InterruptedException {

		Thread.sleep(3000);

	}
	
	@Test
	private void testCase1() throws InterruptedException {
		Loginpojo l=new Loginpojo();
		toInput(l.getTxtuser(), "Iphone");
		btnClick(l.getSrchbtn());
		
		System.out.println("test 1");
		
	Thread.sleep(5000);
		
		
	}
	
	@Test
	private void tessCase2() throws InterruptedException {
		Loginpojo l1=new Loginpojo();
		toInput(l1.getTxtuser(), "bikee");
		btnClick(l1.getSrchbtn());
		
		System.out.println("test 2");
		

		Thread.sleep(5000);

	}
	@Test
	private void testCase3() throws InterruptedException {
		Loginpojo l2=new Loginpojo();
		toInput(l2.getTxtuser(), "car");
		btnClick(l2.getSrchbtn());
		
		System.out.println("test 3");

		Thread.sleep(5000);
	}
	
	@Test
	private void testCase4() throws InterruptedException {
		Loginpojo l3=new Loginpojo();
		toInput(l3.getTxtuser(), "car");
		btnClick(l3.getSrchbtn());
		
		System.out.println("test 4");
		Thread.sleep(5000);
	}
	@Test
	private void testCase5() throws InterruptedException {
		Loginpojo l3=new Loginpojo();
		toInput(l3.getTxtuser(), "car");
		btnClick(l3.getSrchbtn());

		
		System.out.println("test 5");
		
		Thread.sleep(5000);

	}
	@Test(enabled=false)
	private void testCase6() throws InterruptedException {
		Loginpojo l4=new Loginpojo();
		toInput(l4.getTxtuser(), "headset");
		btnClick(l4.getSrchbtn());
		
		System.out.println("test 6");


		Thread.sleep(5000);
	
	}
	@Test
	private void testCase7() throws InterruptedException {
		Loginpojo l5=new Loginpojo();
		toInput(l5.getTxtuser(), "laptop");
		btnClick(l5.getSrchbtn());


		
		System.out.println("test 7");
		Thread.sleep(5000);
}
	
	
	
	
	
}