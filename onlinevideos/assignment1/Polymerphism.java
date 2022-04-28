package com.java.assignment1;

class Parents {
public void showcase () {
System.out.println("I am Parent");
}
}
class Children extends Parents {
	public void showcase () {
		System.out.println("I am Children");
		}
}
public class Polymerphism {

	public static void main(String[] args) {
		
		Parents obj = new Children(); 
		obj.showcase();
	}

}