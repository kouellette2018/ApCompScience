import java.util.Scanner;

public class Program10 {
	//By Kyle Ouellette
	public static void main(String[] args) {
		//add Scaner
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter height in inches: ");
	int height = reader.nextInt();
	int menWeight = ((height - 60) * 7) + 106;
	int womenWeight = ((height - 60) * 6) + 100;
	System.out.println("Recommended weight for men: "+menWeight);
	System.out.println("Recommended weight for women: "+womenWeight);

	}

}
