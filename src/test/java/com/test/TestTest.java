package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.SkipException;

@Test
public class TestTest {

	@Test(dataProvider = "provider")
	public void testIt() {
	}
	
	@DataProvider(name = "provider")
	public Object[] dataProvider() {
		throw new RuntimeException();
	}
	
	private void overflow() {
		overflow();
	}
	
	@Test
	public void testFail() {
		throw new RuntimeException();
	}
	
	@Test
	public void testSkip() {
		throw new SkipException("Skip tests");
	}
}
