import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Enter your first number");
		x= sc.nextInt();
		System.out.println("Enter your second number");
		y= sc.nextInt();
		
		System.out.println("The results are as follows");
		Solutions cal = new Solutions();
		
		int sum =cal.add(x, y);
		int subs =cal.sub(x, y);
		int divs =cal.div(x, y);
		int mult =cal.mul(x, y);
			

	}

}


