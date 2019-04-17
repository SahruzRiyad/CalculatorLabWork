import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1 , num2;
		num1 = input.nextDouble();
		num2 = input.nextDouble();

		double add = Add(num1 , num2);
		double mul = Mul(num1 , num2);
		double sub = Sub(num1 , num2);

		System.out.println("Addition "+add+" Subtraction "+sub+" Multiplication "+mul);
	}
	public double Add(double num1, double num2) {
		return num1+num2;
	}
}