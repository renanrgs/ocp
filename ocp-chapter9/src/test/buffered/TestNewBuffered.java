package test.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestNewBuffered {
	public static void main(String[] args) throws IOException {
		//newBufferedReader();
		//newBufferedWriter();
		readAllLines();
	}

	private static void readAllLines() throws IOException {
		Files.readAllLines(Paths.get("files/maven_renan")).forEach(System.out::println);;
	}

	private static void newBufferedWriter() throws IOException {
		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("files/maven_renan"))) {
			bufferedWriter.write("Testing new Input/Output API");
		}
	}

	private static void newBufferedReader() throws IOException {
		try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("files/maven_renan"),
				Charset.defaultCharset())) {
			System.out.println(bufferedReader.readLine());
		}

	}
}
