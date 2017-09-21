
public class Program6 {
	//By Kyle Ouellette
	public static void main(String[] args) {
		triple();
		skip();
		triple();
		vertLines();
		longSingle();
		triple();
		skip();
		triple();
		shortSingle();
		vertLines();
		vertLines();
		shortSingle();
		shortSingle();
		
		
	}
	public static void vertLines() {
		//vertical lines
		System.out.println("* | | | | | *");
	}
	public static void triple() {
		//triple star line
		System.out.println("    *****    ");
		System.out.println("  *********  ");
		System.out.println("*************");
	}
	public static void shortSingle() {
		//single star line
		System.out.println("    *****    ");
	}
	public static void longSingle() {
		System.out.println("*************");
	}
	public static void skip() {
		System.out.println("");
	}
}
