package javaProject;

public class nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=22;
		if (age<=19) {
			if (age>=13) {
				System.out.println("you are in your teen age. ");
			}
			else {
				System.out.println("You are a child");
			}
		}
		else {
			System.out.println("You are an adult. ");
		}

	}

}
