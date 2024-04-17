package com.selenium;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
		@Ignore
		private void chrome() {
		System.out.println("chrome");
		}
		@Test(enabled=false)
		private void firefox() {
		System.out.println("firefox");
		}
		@Test(enabled=true)
		private void edge() {
		System.out.println("edge");
		}
		@Test(invocationCount=8)
		private void chrome1() {
		System.out.println("chrome");
		}
		@Test(invocationCount=3)
		private void chrome2() {
		System.out.println("chrome");
		}
		@Test(priority=2)
		private void firefox1() {
		System.out.println("firefox");
		}
		@Test(priority=-3)
		private void edge1() {
		System.out.println("edge");
		}
		@Test(priority=2)
		private void chrome3() {
		System.out.println("chrome");
		}

}

	