import java.nio.charset.Charset;

public class TestCharset {
	public static void main(String[] args) {
		System.out.println(Charset.defaultCharset());
		Charset usAsciiCharset = Charset.forName("US-ASCII");
		Charset utfCharset = Charset.forName("UTF-8");
		Charset utf16Charset = Charset.forName("UTF-16");
	}
}
