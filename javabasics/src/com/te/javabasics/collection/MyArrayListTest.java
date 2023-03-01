package com.te.javabasics.collection;

import java.util.Iterator;

public class MyArrayListTest {
	public static void main(String[] args) {
		MyArrayList arrayList = new MyArrayList(2);

		arrayList.addElements(10);
		arrayList.addElements(20);
		arrayList.addElements(20);
		arrayList.addElements(20);

		System.out.println(arrayList);

		System.out.println("-------------------");
		
//		for (int i = 0; i < arrayList.size(); i++)
//			System.out.println(arrayList.get(i));

		for (Object object : arrayList) {
			System.out.println(object);
		}

		System.out.println("-------------------");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
