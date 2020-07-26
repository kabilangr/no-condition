import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("item1 price");
		float x1=in.nextFloat();
		System.out.println("item2 price");
		float x2=in.nextFloat();
		System.out.println("discount");
		float x3=in.nextFloat();
		System.out.printf("Total %.2f\n", (x1+x2));
		System.out.printf("Discount amount %.2f\n", (x1+x2)-(x1+x2)*(x3/100));
		System.out.printf("Saved amount %.2f\n",(x1+x2)*(x3/100));
	}

}
