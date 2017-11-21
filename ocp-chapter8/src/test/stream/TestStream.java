package test.stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class TestStream {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader(new File("files/test.txt"));

		try (BufferedReader b = new BufferedReader(fileReader)) {
			System.out.println(b.readLine());
		}

		lerArquivo();
	}

	public static byte[] lerArquivo() throws IOException {
		File file = new File("/home/renan/Documents/propostas/EUR20171028185505.TXT");
		try (BufferedReader br = new BufferedReader(new FileReader(file));
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File("files/test2.txt")));) {

			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int read;
			while (br.read() != -1) {
				bos.write(br.read());
			}
			
			System.out.println("Fim");

			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			
			while((read = bis.read()) != -1) {
				bw.write(read);
			}
			
			return bos.toByteArray();

		}

	}
}
