package com.practice;

import java.io.Externalizable;
import java.io.Serializable;
import java.lang.management.BufferPoolMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class SplitString {
	public static void main(String[] args) {
		testFinalPremitive();
		testFinalList();
		String s1="bzdsdaddwcfaobwww";
		String s2="abc";
		findSmallestSubString(s1,s2);
		
		
		
		
		
		
		
		
			
	}

	private static void findSmallestSubString(String s1, String s2) {
		// TODO Auto-generated method stub
		
	}

	private static void testFinalList() {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>(2);
		list.add(1);
		list.add(4);
		list.add(10);
		System.out.println(list.size());
		
	}

	private static void testFinalPremitive() {
		// TODO Auto-generated method stub
		final int i=10;
		//i=20;
		
	}

	

}
