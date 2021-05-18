package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class AList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myArr = new ArrayList<Integer> ();
		
		myArr.add(5);
		myArr.add(10);
		myArr.add(17);
		myArr.add(25);
		myArr.add(2);
		
		System.out.println(myArr);
		
		for (int i = 0; i < myArr.size(); i++) {
			Integer curVal = myArr.get(i);
			System.out.println(curVal);
		}
		
		for (Integer item : myArr) {
			System.out.println(item);
		}
		
		System.out.println(" ");
		
		Integer firstItem = myArr.get(0);
		System.out.print("First Item: ");
		System.out.println(firstItem);
		
		System.out.println(" ");
		
		myArr.set(0, 555);
		
		Integer newFirstItem = myArr.get(0);
		System.out.print("New First Item: ");
		System.out.print(newFirstItem);
		
		System.out.println(" ");
		
		myArr.remove(0);
		Integer updatedFirstItem = myArr.get(0);
		System.out.print("New First Item: ");
		System.out.println(updatedFirstItem);
		System.out.print("New Array Size: ");
		System.out.println(myArr.size());
		
		Collections.sort(myArr);
		
		for (Integer item : myArr) {
			System.out.println(item);
		}
		
		ArrayList<String> strArr = new ArrayList<String> ();
		
		strArr.add("wow");
		strArr.add("sam");
		strArr.add("computer");
		strArr.add("typing");
		strArr.add("person");
		Collections.sort(strArr);
		
		for (String item : strArr) {
			System.out.println(item);
		}
		
		System.out.println(" ");
		
		Collections.reverse(strArr);
		
		for (String item : strArr) {
			System.out.println(item);
		}
		
		System.out.println(" ");
		
		Collections.swap(strArr, 0, 2);
		System.out.println(strArr);
		
	}
}
