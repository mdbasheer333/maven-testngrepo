package org.mvntestng.project;

import org.testng.annotations.Test;

public class Demo1 {

	@Test(groups = {"sanity", "regression"})
	public void test1() {
		MyDemo demo=new MyDemo();
		demo.myMethod();
		System.out.println("test1 from Demo1");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void test2() {
		System.out.println("test2 from Demo1");
	}
	
}
