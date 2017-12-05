package test.attribute;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.time.Instant;

public class TestAttributes {
	public static void main(String[] args) throws IOException {
		isDIrectory();
		isRegularFile();
		isSymbolicLink();
		isHidden();
		isReadable();
		isExecutable();
		size();
		getLastModifiedTime();
		setLastModifiedTime();
		getOwner();
		setOwner();
	}

	private static void setOwner() throws IOException {
		UserPrincipal owner = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("renan");
		Path path = Files.setOwner(Paths.get("files/maven_renan"), owner);
		System.out.println(path);
		System.out.println(owner);
	}

	private static void getOwner() throws IOException {
		System.out.println(Files.getOwner(Paths.get("/home/renan/eclipse/jee-oxygen/eclipse/eclipse")));
	}

	private static void setLastModifiedTime() throws IOException {
		System.out.println(Files.setLastModifiedTime(Paths.get("/home/renan/eclipse/jee-oxygen/eclipse/eclipse"),
				FileTime.from(Instant.now())));
	}

	private static void getLastModifiedTime() throws IOException {
		System.out.println(Files.getLastModifiedTime(Paths.get("/home/renan/eclipse/jee-oxygen/eclipse/eclipse")));
	}

	private static void size() throws IOException {
		System.out.println(Files.size(Paths.get("/home/renan/eclipse/jee-oxygen/eclipse/eclipse")));
	}

	private static void isExecutable() {
		System.out.println(Files.isExecutable(Paths.get("/home/renan/eclipse/jee-oxygen/eclipse/eclipse")));
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
