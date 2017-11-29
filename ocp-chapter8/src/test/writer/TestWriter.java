package test.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import test.reader.TestReader;

public class TestWriter {
	public static void main(String[] args) throws IOException {
		writeFile(new File("files/maven_renan_2"));
	}

	private static void writeFile(File destination) throws IOException {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))) {
			List<String> lines = TestReader.readFile(new File("files/maven_renan"));
			for (String line : lines) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
		}
	}
}
