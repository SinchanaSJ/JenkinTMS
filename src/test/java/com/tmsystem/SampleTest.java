package com.tmsystem;

import org.testng.annotations.Test;

public class SampleTest {
@Test(groups = "Smoke")
public void sampleTest() {
	System.out.println("--- Sample Test 1---");
	System.out.println("--- Sample Test 2---");
}

@Test(groups = "Regression")
public void sampleTest2() {
	System.out.println("--- Sample Test 12---");
	System.out.println("--- Sample Test 12---");
}
}
