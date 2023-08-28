package kr.co.himedia.collection;

import java.util.ArrayList;

public class ListLab {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("banana");
		
		for (int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		list.remove(0);
		list.set(1, "orange");
		
		System.out.println();
		
		for (String str : list)
			System.out.println(str);

		System.out.println();
		
		for (int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		
	}

}
