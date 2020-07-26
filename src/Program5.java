import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Bird said:");
		int n=in.nextInt();
		int x=0;
		while(n!=0)
		{
			x=x+(n%10);
			n=n/10;
		}
		System.out.println("Alice must go in path-"+x);
	}

}
