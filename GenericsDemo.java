package com.prathamesh.genericsdemo;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
	
	
	public static void methodWithoutGenerics(){
		List list = new ArrayList();
		 list.add("generics");
        list.add(123); //no compile time error
for (Object object : list){
       String str = (String) object;       //Type casting---class cast exception occurs here
System.out.println(str);
	}
	}
public static void methodWithGenerics(){
	 List<String> list1 = new ArrayList<String>();
	 list1.add("generics");
     // list1.add(123);  //     Compile time error occurs here
     for (String str : list1){
    	 //type casting not needed
     System.out.println(str);
}
}
	public static void main(String[] args) {
//methodWithoutGenerics();
//methodWithGenerics();
}
	}

