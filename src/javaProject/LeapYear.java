package javaProject;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year=1998;//sc.nextInt();
		
		if(Integer.toString(year).length()==4) {
			System.out.println("4");
		}
		else {
			System.out.println("not 4");
		}
		
		System.out.println(Math.max(1, 1));
		
		
	}

}
