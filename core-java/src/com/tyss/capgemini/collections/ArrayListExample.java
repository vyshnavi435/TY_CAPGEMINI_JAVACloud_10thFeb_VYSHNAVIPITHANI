package com.tyss.capgemini.collections;
 
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		// < ~FOR GENERICS
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
		arrayList.add(12);
		arrayList.add(0,16);
		arrayList.add(11);
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(14);
		arrayList.add(15);
		arrayList.add(16);
		//different ways of printing
		System.out.println("\n Priting array elements");
		
		//arrayList.add(4, 34);
		System.out.println("Size of ArrayList: "+arrayList.size());
		
		System.out.println();
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		System.out.println(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i)+ " ");
		}
		System.out.println("/n---------");
		
		//collections.rotate(list<E>,int)
		Collections.rotate(arrayList, -1);
		System.out.println(arrayList);
		System.out.println("---------------------");,
		
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		//System.out.println(arrayList.get(3)); throws Exception since size is 2
	}

}
