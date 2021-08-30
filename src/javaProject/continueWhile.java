package javaProject;

public class continueWhile {
	public static void main(String[] args){
		int a=0, b=1, c=0, cnt=2;
		
		System.out.print(a+", "+b);
		
		while(cnt<15) {
			c=a+b;
			cnt++;
			a=b;
			b=c;
			if(c%11==0) {
				continue;
			}
			System.out.print(", "+c);
		}
	}
}
