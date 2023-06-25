import java.util.Scanner;

public class GreetWorld {
	
	private static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Greet who ? ");
		
		Scanner scanner = new Scanner(System.in);
		
		if (args.length <= 0)
			name = scanner.nextLine();
		else
			name = args[0];
		
		System.out.println("Hello " + name + "!");
	}

}
