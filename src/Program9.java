import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("X coordinate");
		int x=in.nextInt();
		System.out.println("y coordinate");
		int y=in.nextInt();
		System.out.println("length od side");
		int l=in.nextInt();
		float x1=(float)(x+(l/2));
		float y1=(float)(y+(l/2));
		System.out.printf("Center grounf is (%.0f,%.0f)",x1,y1);
	}

}
