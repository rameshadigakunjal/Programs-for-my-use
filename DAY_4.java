
JAVA PROGRAMING LANGUAGE:
PROGRAM NUMBER :4 AREA OF TRIANGLE:
package com.myuse;

import java.util.Scanner;

public class Area_of_triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base:");
		int base=sc.nextInt();
		System.out.println("enter the height:");
		int height=sc.nextInt();
		int area=(base*height)/2;
		System.out.println("area of triangle is:"+area);
	}
}

OUTPUT:
enter the base:
25
enter the height:
25
area of triangle is:312

JAVA PROGRAMING LANGUAGE:
PROGRAM NUMBER :5 AREA OF RECTANGLE:
package com.myuse;

import java.util.Scanner;

public class Area_of {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		int length=sc.nextInt();
		System.out.println("enter the breadth:");
		int breadth=sc.nextInt();
		int area=length*breadth;
		System.out.println("area of rectangle is:"+area);
		
		
	}

}
OUTPUT:
enter the length:
25
enter the breadth:
25
area of rectangle is:625


