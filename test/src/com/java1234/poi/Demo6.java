package com.java1234.poi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo6 {

	public static void main(String[] args) throws Exception{
		List<String> lists=new ArrayList<>();
		lists.add("a");
		lists.add("a");
		lists.add("b");
		lists.add("b");
		lists.add("b");
		lists.add("c");
		lists.add("c");
		lists.add("c");
		lists.add("c");
		lists.add("c");
		Set<String> set=new HashSet<>();
		for (String string : lists) {
			System.out.print(string+",");
			set.add(string);
		}
		Map map=new HashMap<>();
		int i=0;
		for (String string : set) {
			int k=0;
			String s3="";
			for (String s2 : lists) {
				if(string.equals(s2)){
					k++;
					s3=s2;
				}
			}
			map.put(string, k);
		}
		Set keys=map.keySet();
		for (Object object : keys) {
			System.out.print(object+"\t");
			System.out.println(map.get(object));
		}
		
	}
}
