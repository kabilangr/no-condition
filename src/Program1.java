import java.util.Scanner;

public class Program1 {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the length and width");
	int x=in.nextInt();
	int y=in.nextInt();
	System.out.println("Required length is "+(2*(x+y))+"m");
}
}
