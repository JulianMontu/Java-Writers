package co.com.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestEscritura {
	public static void main(String[] args) throws IOException {
		// Genero el archivo
		OutputStream fileOutPutStream = new FileOutputStream("texto-generado.txt");

		// Proceso el archivo
		Writer outputStreamReader = new OutputStreamWriter(fileOutPutStream);
		// escribir el archivo
		BufferedWriter bufferWriter = new BufferedWriter(outputStreamReader);
		bufferWriter.write("Primera linea de mi archivo generado");
		bufferWriter.newLine();
		bufferWriter.write("Segunda linea de mi archivo generado");
		bufferWriter.close();

	}

}
