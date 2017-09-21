
public class Program4 {
	//By Kyle Ouellette
	public static void main(String[] args) {
		topBottom();
		boxes();
		helloWorld();
		boxes();
		topBottom();
		
	}
	public static void topBottom() {
		//The top and under the rocket
		System.out.println("   /\\   ");
		System.out.println("  /  \\  ");
		System.out.println(" /    \\ ");
	}
	public static void boxes() {
		//Empty boxes for middle of rocket
		System.out.println("+------+");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("+------+");
	}
	public static void helloWorld() {
		System.out.println("|Hello |");
		System.out.println("| World|");
	}
}
