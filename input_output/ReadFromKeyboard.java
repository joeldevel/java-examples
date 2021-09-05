import java.util.Scanner;

public class ReadFromKeyboard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your name: >>>");
		String userName = input.nextLine();

		System.out.println("Welcome " + userName + ", nice to meet u");
	}
}
