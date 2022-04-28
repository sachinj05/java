package com.java.assignment1;
class Parent{
	void show()
	{
		System.out.println("150");
	}
}

class Child extends Parent{
	void show()
	{
		System.out.println("200");
	}
}
public class Demo {

	public static void main(String[] args) {
		Parent c = new Child();
		c.show();

	}

}
