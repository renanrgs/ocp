package test.path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestePath {
	public static void main(String[] args) throws IOException, URISyntaxException {
		//Ways to create a Path
		
		//Most commom
		Path path = Paths.get(new URI("file::///home/renan/Desktop/maven"));
		Path pathByGet = Paths.get("files/maven_renan");
		Path pathByFileSystem = FileSystems.getDefault().getPath("files", "maven_renan");
	}
}
