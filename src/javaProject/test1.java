package javaProject;

public class test1 {
	public static void main() {
		Task first=new Task( () = Console.WriteLine("Task starts"));
		first.Start();
		Console.WriteLine("Entered Myclass");
		first.Wait();
	}

}
