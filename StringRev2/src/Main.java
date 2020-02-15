import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Words words = new Words();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the characters to reverse: ");
		String input = scanner.nextLine();
		
		
		String textBackwards = words.convertString(input);
		System.out.println("Result : "+textBackwards);	

	}

}
