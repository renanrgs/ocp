package test.path;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestePath {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("files/maven_renan");
		Path pathSeparator = Paths.get("files", "maven_renan");
		FileSystem fileSystem = FileSystems.getDefault();
		Path pathFileSystem = fileSystem.getPath("files/renan_maven");
		
		System.out.println(pathSeparator.toAbsolutePath());

	}
}
