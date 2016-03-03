package com.practice;

public class StringReverseInteger {
 public static void main(String[] args) {
	reverseStringIntValue();
}

private static void reverseStringIntValue() {
	// TODO Auto-generated method stub
	String str="abc123rty456";
	char[] c=str.toCharArray();
	for(int i=0;i<c.length;i++){
		int ascii=(int)c[i];
		System.out.println(ascii);
	}
	
}
}
