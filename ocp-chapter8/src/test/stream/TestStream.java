package test.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader(new File("files/test.txt"));

		try (BufferedReader b = new BufferedReader(fileReader)) {
			System.out.println(b.readLine());
		}
		
		wrapping();
	}

	private static void wrapping() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/test.txt"))) {
			System.out.println(ois.readUTF());
		} catch (IOException e) {
			Stream.of(e.getSuppressed()).forEach(System.out::println);
			System.out.println(e.getMessage());
		}
	}

}
