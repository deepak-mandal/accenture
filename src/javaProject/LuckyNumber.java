package javaProject;

import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the car no:");
		int carNum=sc.nextInt();
		sc.nextLine();
		
		String numStr=Integer.toString(carNum);
		char numArr[] = numStr.toCharArray();
		int i, sum=0, count=0;
		
		for(char x: numArr) {
			int X= Character.getNumericValue(x);
			if(X<=0) {
				count++;
			}
		}
		
		if(numStr.length()==4 && count==0) {
			for(i=0; i<numArr.length; i++) {
				sum+=Character.getNumericValue(numArr[i]);
				System.out.println(Character.getNumericValue(numArr[i]));
			}
			System.out.println("sum: "+sum);
			if(sum%3==0 || sum%5==0 || sum%7==0) {
				System.out.println("Lucky no");
			}
			else {
				System.out.println("Not lN");
			}
		}
		else {
			System.out.println("not valis");
		}
		
	}
}
