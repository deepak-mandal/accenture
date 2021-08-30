package javaProject;
import java.util.Scanner;

public class inputIntArr {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n:");
		int n=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Array data:");
		String inpArr[]=sc.nextLine().split(" ");
		
		int arr[] = new int[n];		
		for (int i=0; i<inpArr.length; i++) {
			arr[i]=Integer.parseInt(inpArr[i]);
		}
		
		

	}

}
