package com.te.javabasics.collection;

import java.util.HashSet;

public class HashMapDemo {
	public static <E> void main(String[] args) {
//		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//		hashMap.put(500, "Nilim");
//		hashMap.put(1000, "Nilim");
//		hashMap.put(5, "Nilim");
		
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("abc");
		hashSet.add("abc");
		hashSet.add("qwer");
		hashSet.add("mno");
		hashSet.add("xyz");
		
		
		System.out.println(hashSet);
		
	}
}
