package com.java.assignment1;

abstract class ColdDrinks{
	abstract void slogan();
	public void drink() {
		System.out.println("it's refreshing");
	}
}


class MountainDew extends ColdDrinks{
	public void slogan() {
		System.out.println("Dar ke aage Jeet Hai");
	}
}


class ThumbsUp extends ColdDrinks{
	public void slogan() {
		System.out.println("Taste The thunder");
	}
}


class main {
	public static void main(String[] args) {
		MountainDew m = new MountainDew();
		ThumbsUp t = new ThumbsUp();
		m.drink();
		m.slogan();
		
		t.drink();
		t.slogan();
	}
}