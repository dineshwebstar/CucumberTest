package org.table;

import java.util.ArrayList;
import java.util.List;

public class Conf2D {

	public static void main(String[] args) {
		//2d without headewr
		
		List<ArrayList<String>> li=new ArrayList<ArrayList<String>>();
		ArrayList<String> a=new ArrayList<String>();
		a.add("aaaa");
		a.add("bbbb");
		a.add("ccc");
		ArrayList<String> b =new ArrayList<String>();
		b.add("dddd");
		b.add("eee");
		b.add("eeee");
		li.add(a);
		li.add(b);
		
		ArrayList<String> arrayList = li.get(0);///row
		String string = arrayList.get(0);//colum
		System.out.println(string);
	}
}
