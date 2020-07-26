import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("x1");
		int x1=in.nextInt();
		System.out.println("y1");
		int y1=in.nextInt();
		System.out.println("x2");
		int x2=in.nextInt();
		System.out.println("y2");
		int y2=in.nextInt();
		System.out.println("x3");
		int x3=in.nextInt();
		System.out.println("y3");
		int y3=in.nextInt();
		float x=(float)(x1+x2+x3)/3;
		float y=(float)(y1+y2+y3)/3;
		System.out.printf("Dinesh's house is located at (%.1f,%.1f)",x,y);


	}

}
