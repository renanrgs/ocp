package test.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestStream {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader(new File("files/test.txt"));

		try (BufferedReader b = new BufferedReader(fileReader)) {
			System.out.println(b.readLine());
		}
	}

}
