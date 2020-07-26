import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("sides of triangle");
		int x1=in.nextInt();
		int x2=in.nextInt();
		int x3=in.nextInt();
		double s=(float)(x1+x2+x3)/2;
		s=Math.sqrt((s-x1)*(s-x2)*(s-x3)/s);
		System.out.printf("The radius is %.2f", s);
	}

}
