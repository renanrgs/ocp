package test.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class TestStream {
	public static void main(String[] args) throws IOException {
		parse();
		parseBuffered();
	}

	private static void parse() {
		try (FileInputStream fis = new FileInputStream("/home/renan/Desktop/maven");
				FileOutputStream fos = new FileOutputStream("files/maven_renan")) {
			byte[] buffer = new byte[8192];
			int byteRead;
			while ((byteRead = fis.read(buffer)) != -1) {
				System.out.println(byteRead);
				fos.write(buffer);
			}
		} catch (IOException e) {

		}
	}

	private static void parseBuffered() {
		try (BufferedReader b = new BufferedReader(new FileReader("files/maven_renan"))) {
			b.lines().forEach(TestStream::print);
		} catch (IOException e) {
		}
	}

	private static void print(String line) {
		System.out.println(line.trim());
	}
}
