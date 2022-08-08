package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	
	public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("20");
        list.add("30");
        list.add("40");
        
        
        System.out.println("The list of data in the liast "+list.size());
        System.out.println("While Loop:");
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println("Th while loop of the list data is "+itr.next());
        }
        System.out.println("Advanced For Loop:");
        for(Object obj : list) {
            System.out.println("The List of the  list dat  for loop "+obj);
    }
        System.out.println("the list ofthe clasical forrl loop For Loop:");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Testing for conflict");
}
}
