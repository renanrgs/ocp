package test.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream {
	public static void main(String[] args) {
		//copy(new File("files/test.txt"), new File("files/destination.txt"));
		bufferedCopy(new File("files/test.txt"), new File("files/destination.txt"));
	}

	private static void copy(File source, File destination) {
		try (FileInputStream fileInputStream = new FileInputStream(source);
				FileOutputStream fileOutputStream = new FileOutputStream(destination)) {
			int b = 0;
			int count = 0;
			while ((b = fileInputStream.read()) != -1) {
				System.out.println("Vez sem buffer: " + ++count);
				fileOutputStream.write(b);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void bufferedCopy(File source, File destination) {
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
						new FileOutputStream(destination))) {
			byte[] buffer = new byte[1024];
			
			int lengthRead;
			int count = 0;
			while((lengthRead = bufferedInputStream.read(buffer)) > 0) {
				System.out.println("Vez com buffer: " + ++count);
				bufferedOutputStream.write(buffer, 0, lengthRead);
			}
			bufferedOutputStream.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
