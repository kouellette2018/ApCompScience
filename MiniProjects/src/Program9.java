import java.util.Scanner;

public class Program9 {
	//By Kyle Ouellette
	public static void main(String[] args) {
	double baseOne;
	double baseTwo;
	double height;
	double area;
	//Add Scanner
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Enter width of first base: ");
	baseOne = reader.nextDouble();
	System.out.println("Enter width of second base: ");
	baseTwo = reader.nextDouble();
	System.out.println("Enter length of height: ");
	height = reader.nextDouble();
	area = (0.5) * (baseOne + baseTwo) * height;
	System.out.println("Area: "+area);

	}

}
