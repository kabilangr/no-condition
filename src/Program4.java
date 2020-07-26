import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Number of copies sold");
		int n=in.nextInt();
		System.out.println("Cost of each copies");
		int c=in.nextInt();
		System.out.println("Cost spent by the agency");
		int a=in.nextInt();
		System.out.println("The profit obtained is Rs."+((n*c)-(n*a)-100));
	}

}
