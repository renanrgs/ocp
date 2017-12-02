package test.pathmethods;

import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPathMethods {
	public static void main(String[] args) throws URISyntaxException {
		getNameCounAndGetNamet();
		getFileName();
		getParent();
		getRoot();
	}

	private static void getRoot() {
		Path path = Paths.get("/files/maven_renan");
		System.out.println(path.getRoot());
	}

	private static void getNameCounAndGetNamet() {
		Path path = Paths.get("files", "maven_renan");
		System.out.println(path.getNameCount());
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
	}
	
	private static void getFileName() {
		Path path = FileSystems.getDefault().getPath("files");
		System.out.println(path.getFileName());
	}
	
	private static void getParent() throws URISyntaxException {
		Path path = Paths.get("home/renan/Desktop/maven");
		System.out.println(path.getParent());
	}
	
}
