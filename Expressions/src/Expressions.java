import java.util.Scanner;

public class Expressions {

	public static void main (String [] args)
	{
		double length;
		double width;
		double area;
		double perimeter;
		String answer ="";
		
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		do {
			
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the length of the room:");
		length = scanner.nextDouble();
		
		System.out.println("Please enter the width of the room:");
		width = scanner.nextDouble();
		
		//area = length*width;
		area = length*width;
		System.out.println("The area of the room is:"+area);
		
		//perimeter = 2*(length=width)
		perimeter = 2*(length+width);
		System.out.println("The perimeter of the room is:"+perimeter);
		
		System.out.println("Would you like to continue? (y/n):");
		answer = scanner.next();
		
		
		}while(answer.equals("Y") || answer.equals("y"));
		
	
		
		}
	
	}

	


