import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		System.out.println("x and y coordinates");
		int x1=in.nextInt();
		int x2=in.nextInt();
		double s=Math.sqrt(((x1-3)*(x1-3))+(x2-4)*(x2-4));
		System.out.printf("raju need %.0f", s);
	}

}
