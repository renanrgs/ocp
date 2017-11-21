package test.file;

import java.io.File;

public class TestFileClass {
	public static void main(String[] args) {
		File file = new File("files".concat(File.separator).concat("test.txt"));
		System.out.println(File.separator);
		System.out.println(file.exists());
		
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		
		//The directory must be empty to be deleted
//		System.out.println(file.delete());
		
//		/System.out.println(file.mkdir());
		
		System.out.println(file.getParent());
		
	}
}
