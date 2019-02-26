package com.blobtestArray;
import java.util.*;

public class NumberItemsInList {
	
	public static int countItems(ArrayList<String> list) {
		 int size = list.size();
		 return size;
		
	}
	
	public static void main (String [] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Cat");
		list.add("Dog");
		list.add("Bird");
		
		System.out.println("There are this many items in the list: " + list.size());
		}
	}


