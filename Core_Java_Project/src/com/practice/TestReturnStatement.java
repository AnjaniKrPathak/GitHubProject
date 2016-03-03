package com.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestReturnStatement {
	public static void main(String[] args) {
		int i=testTryReturnStatement();
		System.out.println(i);
	}

	private static int testTryReturnStatement() {
		// TODO Auto-generated method stub
		try {
			int i=10/0;
			
			System.out.println("Hi ");
			return 30;
		} catch (NullPointerException | NumberFormatException ie) {
			// TODO: handle exception
			
			System.out.println("Exception");
			return 40;
		}
		finally {
			//return 50;
		}
		//return 80;
	}

}
