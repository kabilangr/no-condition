import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		System.out.println("Purchase cost:");
		int p=in.nextInt();
		System.out.println("Loss percentage:");
		int l=in.nextInt();
		float f=((float)l/100);
System.out.printf("The selling price of the cycle is Rs.%.2f",p-(f*p));
	}

}
