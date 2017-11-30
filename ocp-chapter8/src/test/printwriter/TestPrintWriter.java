package test.printwriter;

import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {
	public static void main(String[] args) throws IOException {
		try (PrintWriter writer = new PrintWriter("files/maven_renan_2")) {
			writer.print("Thais Helen Teixeira Pessoa da Silva");
		}
	}
}
