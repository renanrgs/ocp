package test.files;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFiles {
	public static void main(String[] args) throws IOException {
		exists();
		isSameFile();
		createDirectory();
		createDirectories();
		copy();
		move();
		delete();
	}

	private static void delete() throws IOException {
//		Files.delete(Paths.get("filesz/relatives"));
		Files.deleteIfExists(Paths.get("filesz/relatives"));
		
	}

	private static void move() throws IOException {
		Path path1 = FileSystems.getDefault().getPath("files/maven_renan");
		Path path2 = FileSystems.getDefault().getPath("files/relatives/renan/maven_renan");
		Files.move(path1, path2);
	}

	private static void copy() throws IOException {
		Path path1 = Paths.get("files");
		Path path2 = Paths.get("files2");
		Files.copy(path1, path2);
	}

	private static void createDirectories() throws IOException {
		Files.createDirectories(Paths.get("files/relatives/renan"));
	}

	private static void createDirectory() throws IOException {
		// Files.createDirectory(Paths.get("files/testing/"));
	}

	private static void isSameFile() throws IOException {
		Path path1 = FileSystems.getDefault().getPath("files/");
		Path path2 = FileSystems.getDefault().getPath("file/");
		System.out.println(Files.isSameFile(path1, path2));
	}

	private static void exists() {
		System.out.println(Files.exists(Paths.get("files/")));
	}
}
