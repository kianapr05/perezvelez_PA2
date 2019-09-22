import java.util.Scanner;

public class BMIcalculator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String input;
		char formula;
		double height;
		double weight;
		double BMI = 0;
		
		System.out.println("To calculate your BMI with the metric system, enter the letter 'm'");
		System.out.println("To calculate your BMI with the standard system, enter the letter 's'");
		input = scnr.next();
		formula = input.charAt(0);
		
		if (formula == 'm') {
			System.out.println("Input your weight in kilograms");
			weight = scnr.nextDouble();
			System.out.println("Input your height in meters");
			height = scnr.nextDouble();
			
			BMI = weight / (height * height);
		}
		
		if (formula == 's') {
			System.out.println("Input your weight in pounds");
			weight = scnr.nextDouble();
			System.out.println("Input your height in inches");
			height = scnr.nextDouble();
			
			BMI = (703 * weight) / (height * height);
		}
		
		System.out.printf("Your BMI is %.1f", BMI);
		System.out.println("");
		System.out.println("");
		System.out.println("BMI Categories:");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");

	}
}