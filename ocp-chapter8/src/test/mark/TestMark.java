package test.mark;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestMark {

	public static void main(String[] args) {
		try(InputStream is = new ByteArrayInputStream(new byte[] {12,3,4})){
			System.out.println(is.markSupported());
			
		}catch(IOException e) {};
		
	}

}
