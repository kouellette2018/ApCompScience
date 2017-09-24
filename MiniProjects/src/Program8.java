import java.util.Scanner;
	//By Kyle Ouellette
public class Program8 {

	public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
System.out.println("Enter Radius of Sphere: ");
int radius = reader.nextInt();
//Write equations
double pi = 3.14;
int diameter = 2 * radius;
double surfaceArea = 4* pi *(radius*radius);
double circumference = 2 * pi * radius;
double volume = (4 * pi) * ((radius*radius*radius)/3);
//Output the equations
System.out.println("Diameter = "+diameter);
System.out.println("Circumference = "+circumference);
System.out.println("Surface Area = "+surfaceArea);
System.out.println("Volume: "+volume);


	}

}
