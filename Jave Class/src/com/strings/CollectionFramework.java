package com.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CollectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		//		int[] list = new int[5]; 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(5, 6);
		//		System.out.println(list.contains(11));
		//		System.out.println(list.indexOf(4));
		//		System.out.println(list.toString());

		List<Integer> listll = new LinkedList<Integer>();
		listll.add(1);
		listll.add(2);
		listll.add(3);
		listll.add(4);
		listll.add(5);
		listll.add(1);		 
		listll.add(4, 6);
		//		System.out.println(listll.toString());
		listll.remove(2);

		//		System.out.println(listll.toString());

		//		for (Integer i :listll ) {
		//			System.out.println(i);
		//		}
		//		
		Iterator<Integer> itr = listll.iterator();
		//		while (itr.hasNext()) {
		//			//			System.out.println(itr.next());
		//		}


		// map - collection of key-pair / key: value
		// firstname: 'John'
		// key : firstname
		// value : John

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("C", 4);

		for (Map.Entry<String, Integer> option : map.entrySet() ) {
			System.out.println(option.getKey() + " | " + option.getValue());
		}
	}

}
