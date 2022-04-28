package com.java.assignment1;

class first{
	void display() {
		System.out.println("class 1st display");
}
}

class second extends first{
	void display() {
	System.out.println("class 2nd display");
}
}

class RuntimePolymorphism
{
	public static void main(String[] args) {
		first ref;
		ref = new second();
		ref.display();
	}
}