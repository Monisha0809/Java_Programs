
Solution file
____________________________________________________________________________________________________________________________

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
	public static void main(String args[])  throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Circle\t2.Rectangle\t3.Triangle");
		System.out.println("Choice : ");
		int choice;
		choice = Integer.parseInt(bf.readLine());
		
		switch(choice)	{
				case 1:
				
						Circle circleObject=new Circle();
						System.out.println("Enter the Radius:");
						circleObject.radius=Double.parseDouble(bf.readLine());
						circleObject.Area();
						break;
				case 2:
				
						Rectangle rectangleObject=new Rectangle();
						System.out.println("Enter  the length :");
						rectangleObject.length=Double.parseDouble(bf.readLine());
						System.out.println("Enter  the breadth  :");
						rectangleObject.breadth=Double.parseDouble(bf.readLine());
						rectangleObject.Area();
						break;
				case 3:
				
						Triangle triangleObject=new Triangle();
						System.out.println("Enter  the base :");
						triangleObject.base=Double.parseDouble(bf.readLine());
						System.out.println("Enter  the height  :");
						triangleObject.height=Double.parseDouble(bf.readLine());
						triangleObject.Area();
						break;
		}
	}
}
___________________________________________________________________________________________________________________
Circle class
_______________
      public class Circle {
	double radius;
	static  double pi=3.14;
	void Area() {
		System.out.println("AREA OF CIRCLE IS :" + (pi * radius * radius));
	}
}
________________________________________________________________________________________
Rectangle class
_____________________
public class Rectangle {
	double length;
	double breadth;
	void Area() {
			System.out.println("AREA OF TRIANGLE IS : " + ( length * breadth ));
	}
}
_____________________________________________________________________________________
Trianle class
___________________
public class Triangle {
	double height;
	double base;
	void Area() {
		System.out.println("AREA OF  TRIANGLE IS : " + (( base * height )/2));
	}
}
