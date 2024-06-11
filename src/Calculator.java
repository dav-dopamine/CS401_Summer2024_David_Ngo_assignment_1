

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String another = "yes";
				
		while(another.equals("yes"))
		{
			System.out.print("Enter the first number: ");
			int firstNumber = scan.nextInt(); 
			
			System.out.print("Enter the second number: ");
			int secondNumber = scan.nextInt();
			
			System.out.println("\nSelect an operation: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division\n");
			
			System.out.print("Enter the operation number: ");
			int operation = scan.nextInt();
			
			
			int result = 0; 
			if(operation == 1)
			{
				result = firstNumber + secondNumber;
				System.out.print("Result: " + firstNumber + " + " + secondNumber + " = " + result);
			}
			else if(operation == 2)
			{
				result = firstNumber - secondNumber; 
				System.out.print("Result: " + firstNumber + " - " + secondNumber + " = " + result);
			}
			else if(operation == 3)
			{
				result = firstNumber * secondNumber; 
				System.out.print("Result: " + firstNumber + " * " + secondNumber + " = " + result);
			}
			else
			{
				result = firstNumber/secondNumber;
				System.out.print("Result: " + firstNumber + " / " + secondNumber + " = " + result);
			}
			
			System.out.print("\nDo you want to perform another calculation? (yes/no): ");
			scan.nextLine();
			another = scan.nextLine(); 
			
			
		}
		
		System.out.println("\nGoodbye!");
		
		scan.close();
		
	}
}
