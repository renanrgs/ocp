package test.view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class TestView {
	public static void main(String[] args) throws IOException {
		readAttributes();
		getFileAttributesView();
	}

	private static void getFileAttributesView() {
		BasicFileAttributeView data = Files.getFileAttributeView(Paths.get("files/maven_renan"), BasicFileAttributeView.class);
	}

	private static void readAttributes() throws IOException {
		BasicFileAttributes data = Files.readAttributes(Paths.get("files/maven_renan"), BasicFileAttributes.class);
		System.out.println(data.isDirectory());
		System.out.println(data.isRegularFile());
		System.out.println(data.isSymbolicLink());
		System.out.println(data.isOther());
		System.out.println(data.size());
		System.out.println("Creation time: " + data.creationTime());
		System.out.println("Last time modified: " + data.lastAccessTime());
		System.out.println(data.lastAccessTime());
		System.out.println("File key method: " + data.fileKey());
	}
}
