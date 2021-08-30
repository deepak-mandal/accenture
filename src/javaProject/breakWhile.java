package javaProject;

public class breakWhile {
	public static void main(String[] args) {
		int a=0, b=1, c=0, cnt=2;
		
		System.out.println(a+", "+b);
		
		while(cnt<20) {
			c=a+b;
			System.out.print(c);
			if(cnt<10){
				System.out.print(" ");
			}
			if(c%11==0) {
				break;
			}
			cnt++;
			a=b;
			b=c;
		}
		
	}

}
