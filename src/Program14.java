import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter gold");
		int x1=in.nextInt();
		System.out.println("Enter jack %");
		int x2=in.nextInt();
		System.out.println("Enter barboosa %");
		int x3=in.nextInt();
		float j=(x1*(float)x2/100);
		float b=((x1)*(float)x3/100);
		System.out.printf("jack gets %.0f\n", j);
		System.out.printf("barboosa gets %.0f\n", b);
		System.out.printf("others gets %.0f\n", (x1-b-j));
	}

}
