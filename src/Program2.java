import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Number of students");
		int n=in.nextInt();
		System.out.println("Number of teams");
		int t=in.nextInt();
		System.out.println("The number of terms in each team is "+(n/t)+" and left out is "+(n%t));
	}

}
