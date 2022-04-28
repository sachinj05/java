package com.java.assignment1;
interface AddSub{
	int a = 30;
	int b = 14;
	void add();
	void sub();
	
}
public class AdditionSubstraction implements AddSub{
	public void add() {
		System.out.println("addition of"+a+"and"+b+"is:"+(a+b));
	}
	public void sub() {
		System.out.println("substraction of"+a+"and"+b+"is:"+(a-b));
	}
	public static void main(String[] args) {
		AdditionSubstraction obj = new AdditionSubstraction();
		obj.add();
		obj.sub();

	}

}
