import java.util.Scanner;

public class Solutions {
	

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int x= sc.nextInt();
		System.out.println("Please enter your second number");
		int y= sc.nextInt();
		
		
		
		System.out.println("Results are as follows");
		
		int add = cal.add(x, y);
	    int sub = cal.sub(x, y);
	    int mul = cal.mul(x, y);
	    int div = cal.div(x, y);

	    System.out.println("Sum of two number  is : "+ add);
	    System.out.println("Substraction of two number is: "+ sub);
	    System.out.println("Multiplication of two number  is: "+ mul);
	    System.out.println("Division of two number is: "+ div);
	}

}
