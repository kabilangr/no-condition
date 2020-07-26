import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("price");
		int x1=in.nextInt();
		System.out.println("Repair cost");
		int x2=in.nextInt();
		System.out.println("Selling price");
		int x3=in.nextInt();
		float ans=(float)((x3-(x1+x2))*100)/(x1+x2);
		System.out.printf("Gain percentage is %.2f",ans);
	}

}
