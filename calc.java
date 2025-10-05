import java.util.*;
public class calc 
{
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("simple calculator 2025 (using else if)");
		double num1,num2;
		String op;

		System.out.println("enter num1");
		num1=console.nextDouble();
		System.out.println("enter numeber 2");
		num2=console.nextDouble();

		System.out.println("enter your operator (+,-,/,*) : ");
		op=console.next();

		if (op.equals("+")) {
			System.out.println("the answer is : " + (num1 + num2));

		} else if (op.equals("-")) {
			System.out.println("the answer is : " + (num1 - num2));

		} else if (op.equals("/")) {
			System.out.println("the answer is : " + (num1 / num2));

		} else if (op.equals("*")) {
			System.out.println("the answer is : " + (num1 * num2));


		}
		else {
			System.out.println("invalid operator");
		}



	}
}