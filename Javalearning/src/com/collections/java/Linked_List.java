package com.collections.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> bl=new LinkedList<String>();
		bl.add("Ruchitha");
		bl.add("Akshitha");
		bl.add("Akhilesh");
		System.out.println(bl);
		System.out.println(bl.size());
		bl.add(3,"Hello");
		System.out.println(bl);
		
		System.out.println(bl.isEmpty());
		System.out.println(bl.contains("hi"));
	
		Iterator<String> itr = bl.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
