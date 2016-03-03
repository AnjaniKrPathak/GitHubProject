package com.practice;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortImplemantation {
	public static void main(String[] args) {
		final List<Integer> list=new ArrayList<>();
		final int i=3;
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(15);
		list.add(3);
		//sortArrayBasedOnBubbleSort();
		searchValueBasedOnBinarySearch(list,i);
		getFibnokiSeries();
		
		
	}

	private static int getFibnokiSeries() {
		// TODO Auto-generated method stub
		int fibn1=1 , fibn2=1,fibnoki=1;
		for(int i=3;i<10;i++){
			fibnoki=fibn1+fibn2;
			fibn1=fibn2;
			fibn2=fibnoki;
			System.out.println(fibnoki);
		}
		
		return fibnoki;
		
	}

	private static void searchValueBasedOnBinarySearch(List<Integer> list, int i) {
		// TODO Auto-generated method stub
		int comprassion=list.get(list.size()/2);
		if(i== comprassion){
			
		}
		
	}

	private static void sortArrayBasedOnBubbleSort() {
		// TODO Auto-generated method stub
		int[] a=new int[]{3,5,1,7,9};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				int temp;
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			}
		}
}
