package co.com.java.io.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestUnicodeEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String letra = "A";
		// coding en la tabla ascii
		System.out.println("CodePoint: "+letra.codePointAt(0));
		//Charset charser = Charset.defaultCharset();
		Charset charser = Charset.forName("windows-1252");
		// display name que charset esta usando 
		System.out.println("Charset: "+charser.displayName());
		byte[] bytes = letra.getBytes(StandardCharsets.UTF_16);
		System.out.println("Cantidad de Bytes "+bytes.length); 	
	}

}
