import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		double fahrenheit;
		double celsius;
		
		System.out.println("Enter degrees in Fahrenheit: ");
		Scanner converter = new Scanner(System.in);
		fahrenheit = converter.nextDouble();
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.print(fahrenheit+" Degrees Fahrenheit is: "+celsius+" Degrees Celsius");
		converter.close();

	}

}
//I pushed this to git