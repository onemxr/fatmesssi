package test;

import java.util.HashMap;

public class Test {
	 static HashMap<String, Object> myMap ;	
	public static void main(String[] args) {
		pushToController();
	}
	
	public static void pushToController() {
		myMap= new HashMap<String, Object>();
		if (myMap.getClass().equals(String.class)) {
			System.out.println("fat messi");
		}else {
			System.out.println("bad messi");
		}
	}
}
