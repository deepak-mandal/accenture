package javaProject;

public class Myclass {
	public static void main() {
		Task first=new Task( () = Console.WriteLine("Task starts"));
		first.Start();
		Console.WriteLine("Entered Myclass");
		first.Wait();
	}
}
