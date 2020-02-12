package com.mockito.practice;

import org.junit.Test;

import com.mvi.test.HelloWorld;

public class FirstMokitoTest {

	HelloWorld cusCre = new HelloWorld();

	@Test
	public void test() {
		cusCre.helloWorld("Mani");
	}

	@Test
	public void testWithEmptyValues() {
		cusCre.helloWorld("  ");
	}

	@Test
	public void testWithEmptNumber() {
		cusCre.helloWorld("123");
	}

}