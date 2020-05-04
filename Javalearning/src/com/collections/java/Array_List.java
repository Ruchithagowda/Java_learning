package com.collections.java;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al = new ArrayList<String>();
		al.add("Ruchitha");
		al.add("Akshitha");
		al.add("Akhilesh");
		System.out.println(al);
		System.out.println(al.size());
		al.add(0, "Java Programming");
		System.out.println(al);
		System.out.println(al.contains("Rchitha"));
		System.out.println(al.size());
		System.out.println(al.get(3));
		System.out.println(al.isEmpty());
		al.remove(0);
		System.out.println(al);
		al.remove("Ruchitha");
		System.out.println(al);
		al.set(0, "AKSHITHA");
		System.out.println(al);
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al);

	}

}
