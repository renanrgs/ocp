package test.printstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestPrintStream {
	public static void main(String[] args) throws FileNotFoundException {
		try (PrintStream printStream = new PrintStream(new File("files/maven_renan"))) {
			printStream.println("Renan Guedes da Silva");
			System.out.println();
		}
	}
}
