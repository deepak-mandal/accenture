package javaProject;
/*
public class ProgrammingUsingJavasession17Aug21 {

}
*/
//println is a overloader method (inbuild) it can print int, string, float etc.

class Student {
	private int stu_id;
	private String stu_name;
	//this data does not required object & does not depends on object
	private static String coll_name;//---------->class load :- common memeory
	private final static String coll_name="abc";	// for constant
	
//Constructor
	public Student(int id, String name) {
		stu_id = id;
		stu_name = name;
		System.out.println("Welcome");

	}
	//if you don't pass the value
	//then invoke this constructor
	public Student() {
		System.out.println("Welcome");
	}
	public static void getinfo() {//------static variable eg. college name
		//....
	}
	
	

//overriding :- either number of parameter should change
//or have to change the data type if no. of parameter is same.
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		Student st = new Student(101, "ram");
		// st.display();
		st.add(10, 20);
		st.add(10, 30, 40);
		st.coll_name="cyx";
		Student.coll_name="d";
		student.getinfo();

	}

}

/*
  Array --->similar type of data

  *****new refer allocating a memory.
  
  
  int[] marks=new int[10] 
  
  marks[0]=89;
  marks[1]=98;
  ...
  ...
  marks[9]=88;


//for lop
scanner sc=new Scanner();
for (int i=0; i<100; i++){
marks[i]=sc.nextInt()
}



//for each look  or enhanced for loop
for (int k:marks){
System.out.println(k)

}
  
  
//jarked array concept multi dimentional array

int[][] marks=new int[4][]

marks[0]=new int[4];
marks[1]=new int[2];
  
  
  
  
  
  
  
  
  
  
  
*/



