import java.util.Scanner;

public class Program3 {

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
		float x=(float)(x1+x2)/2;
		float y=(float)(y1+y2)/2;
		System.out.printf("Binoy's house location at (%.1f,%.1f)",x,y);
	}

}
