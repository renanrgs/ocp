package test.attribute;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestAttributes {
	public static void main(String[] args) throws IOException {
		isDIrectory();
		isRegularFile();
		isSymbolicLink();
		isHidden();
		isReadable();
	}

	private static void isReadable() {
		System.out.println(Files.isReadable(Paths.get("files/maven_renan")));
	}

	private static void isHidden() throws IOException {
		System.out.println(Files.isHidden(Paths.get("~/.xpaint")));
	}

	private static void isSymbolicLink() {
		System.out.println(Files.isSymbolicLink(Paths.get("files/maven_renan")));
	}

	private static void isRegularFile() {
		System.out.println(Files.isRegularFile(Paths.get("files/maven_renan")));
	}

	private static void isDIrectory() {
		System.out.println(Files.isDirectory(Paths.get("files")));
	}
}
