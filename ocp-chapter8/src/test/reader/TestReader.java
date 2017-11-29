package test.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestReader {
	public static void main(String[] args) throws IOException {
		readFile(new File("files/maven_renan")).forEach(System.out::println);
	}

	public static List<String> readFile(File file) throws FileNotFoundException, IOException {
		List<String> lines = new ArrayList<>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				lines.add(line);
			}
		}
		return lines;
	}
}
