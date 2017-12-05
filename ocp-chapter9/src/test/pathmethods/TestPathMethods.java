package test.pathmethods;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPathMethods {
	public static void main(String[] args) throws URISyntaxException, IOException {
		getNameCounAndGetNamet();
		getFileName();
		getParent();
		getRoot();
		isAbsolute();
		toAbsolute();
		subpath();
		relativize();
		resolve();
		normalize();
		toRealPath();
	}

	private static void toRealPath() throws IOException {
		Path path = Paths.get("files/maven_renan");
		System.out.println(path.toRealPath());
	}

	private static void normalize() {
		Path path1 = Paths.get("/home/renan/Desktop");
		Path path2 = Paths.get("/home/renan/Downloads/Boletos.pdf");
		System.out.println(path1.resolve(path2).normalize());
	}

	private static void resolve() {
		Path path = Paths.get("home/renan/Desktop/");
		System.out.println(path.resolve(Paths.get("resolve/")));
	}

	private static void relativize() {
		Path path1 = Paths.get("/home/renan/Desktop/maven");
		Path path2 = Paths.get("/Desktop/renan");
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));
	}

	private static void subpath() {
		Path path = Paths.get("home/renan/Desktop/maven");
		System.out.println(path.subpath(2, 4));
	}

	private static void toAbsolute() {
		Path path = FileSystems.getDefault().getPath("files/maven_renan");
		System.out.println(path.toAbsolutePath());
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

	private static void isAbsolute() {
		Path path = Paths.get("files/maven_renan");
		System.out.println(path.isAbsolute());
	}

}
