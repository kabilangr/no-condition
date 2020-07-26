import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("First sale");
		int x1=in.nextInt();
		System.out.println("second sale");
		int x2=in.nextInt();
		System.out.println("third sale");
		int x3=in.nextInt();
		System.out.println("Fouth sale");
		int x4=in.nextInt();
		System.out.println("Fifth sale");
		int x5=in.nextInt();
		System.out.println("Average sale");
		int x6=in.nextInt();
		float f=(float)((x6*6)-x1-x2-x3-x4-x5);
		System.out.printf("sixth sale is Rs.%.2f",f);
	}

}
