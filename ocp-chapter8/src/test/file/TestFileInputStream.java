package test.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

public class TestFileInputStream {
	public static void main(String[] args) {
		// copy(new File("files/test.txt"), new File("files/destination.txt"));
		// bufferedCopy(new File("files/test.txt"), new File("files/destination.txt"));
		parseBase64();
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
			while ((lengthRead = bufferedInputStream.read(buffer)) > 0) {
				System.out.println("Vez com buffer: " + ++count);
				bufferedOutputStream.write(buffer, 0, lengthRead);
			}
			bufferedOutputStream.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void parseBase64() {
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream("/home/renan/Documents/propostas/EUR20171028185505.TXT"));

				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				BufferedWriter b = new BufferedWriter(new FileWriter("/home/renan/Documents/propostas/renan.txt"));) {
			int lengthRead;
			byte[] buffer = new byte[1024];
			while ((lengthRead = bufferedInputStream.read(buffer)) > 0) {
				bos.write(buffer, 0, buffer.length);
			}

			b.write(Base64.getEncoder().encodeToString(bos.toByteArray()));
			System.out.println(Base64.getEncoder().encodeToString(bos.toByteArray()));
			b.flush();
			
		} catch (IOException e) {

		}

	}

}
