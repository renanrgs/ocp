package test.console;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestConsole {

	public static void main(String[] args) throws IOException {
		// oldWay();
		//newWay();
		
		Console console = System.console();
		if (console != null) {
			String userInput = console.readLine();
			console.writer().println("You're utilizing the Console class and you've typed " + userInput);
		}
	}

	private static void newWay() {
		Console console = System.console();
		if (console != null) {
			String userInput = console.readLine();
			console.writer().println("You're utilizing the Console class and you've typed " + userInput);
		}
	}

	private static void oldWay() throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String userInput = reader.readLine();
			System.out.println("You entered the following output: " + userInput);
		}

	}
}
