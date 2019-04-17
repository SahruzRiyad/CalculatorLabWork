import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1 , num2;
		num1 = input.nextDouble();
		num2 = input.nextDouble();

		add = Add(num1 , num2);
		mul = Mul(num1 , num2);
		sub = Sub(num1 , num2);

		System.out.println("Addition "+add+" Subtraction "+sub+" Multiplication "+mul);
	}
}