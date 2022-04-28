package com.java.assignment1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		int l,b,h,area,volume;
		System.out.println("Enter value for length: ");{
		Scanner x = new Scanner(System.in);{
		l = x.nextInt();
		}
		}
		System.out.println("Enter value for breadth: ");{
		Scanner y = new Scanner(System.in);{
		b = y.nextInt();
		}
		}
		System.out.println("Enter value for height: ");{
		Scanner z = new Scanner(System.in);{
		h = z.nextInt();
		}
		}
		
		
		
		area = l*b;
		volume = l*b*h;
		System.out.println("Area of Rectangle is: "+area);
		System.out.println("Volume of Rectangle is: "+volume);

	}
}
