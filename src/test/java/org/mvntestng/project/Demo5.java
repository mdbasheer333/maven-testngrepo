package org.mvntestng.project;

import org.testng.annotations.Test;

public class Demo5 {

	@Test(groups = {"sanity", "regression"})
	public void test1() {
		System.out.println("test1 from Demo5");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void test2() {
		System.out.println("test2 from Demo5");
	}
	
}
