package test.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestStream {
	public static void main(String[] args) throws IOException {
		// walk();
		// find();
		list();
		lines();
	}

	private static void lines() throws IOException {
		Files.lines(Paths.get("/home/renan/Documents/challenges/wallethub/access.log")).forEach(System.out::println);
	}

	private static void list() throws IOException {
		Files.list(Paths.get("files")).forEach(System.out::println);
		;
	}

	private static void find() throws IOException {
		Files.find(Paths.get(""), 10, (p, a) -> p.toString().endsWith("_renan") && !a.isDirectory())
				.forEach(System.out::println);
		;
	}

	private static void walk() throws IOException {
		Files.walk(Paths.get("files/"), Integer.MAX_VALUE).forEach(System.out::println);
	}
}
