package co.com.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestLectura {
	public static void main(String[] args) throws IOException {
		// Obtengo el archivo
		InputStream file = new FileInputStream("Test.txt");

		// Proceso el archivo
		Reader reader = new InputStreamReader(file);
		// Leer el archivo
		BufferedReader bufferReader = new BufferedReader(reader);
		String linea;
		// System.out.println(linea);
		while ((linea = bufferReader.readLine()) != null) {
			System.out.println(linea);

		}

	}

}
