package javaProject;

public class SecondPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, c=0, cnt=2;
		System.out.print(a+", "+b);
		
		while(cnt<20){
			c=a+b;
			System.out.print(", "+c);
			if (c%11==0)
				break;
			cnt++;
			a=b;
			b=c;
		}

	}

}
