package stackAddition;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<Integer>();
		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Please enter a math equation");
			String userInput = scan1.nextLine();

			for (int i = 0; i < userInput.length(); i++) {
				char input = userInput.charAt(i);
				switch (input) {
				case '*':

					if (s1.size() == 2) {
						int x = s1.pop();
						int y = s1.pop();
						s1.push(x * y);
					}

					break;
				case '/':
					if (s1.size() == 2) {
						int x = s1.pop();
						int y = s1.pop();
						s1.push(y / x);
					}

					break;
				case '+':
					if (s1.size() == 2) {
						int x = s1.pop();
						int y = s1.pop();
						s1.push(x + y);
					}

					break;
				case '-':
					if (s1.size() == 2) {
						int x = s1.pop();
						int y = s1.pop();
						s1.push(y - x);
					}

					break;
				default:

					int inputTrans = Character.getNumericValue(input);

					s1.push(inputTrans);

					break;
				}
			}
			System.out.println(s1.pop());
			System.out.println("Continue? (yes/no)");

			choice = scan1.nextLine();
		}

	}

}
