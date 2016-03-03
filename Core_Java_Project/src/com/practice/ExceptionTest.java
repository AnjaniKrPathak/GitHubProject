package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExceptionTest {
	public static void main(String[] args) {
		testIOException();
	}

	private static void testIOException() {
		// TODO Auto-generated method stub
		try {
			A a1=new A();
			File f=new File("E:\\Anjani_Data\\My_Resume");
			FileOutputStream fout=new FileOutputStream(f);
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(a1);
			
		}catch(FileNotFoundException fe){ 
			
		}
		catch (IOException io) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}

}
