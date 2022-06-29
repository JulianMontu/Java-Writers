package co.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TestEscrituraPrintStream {
	public static void main(String[] args) throws IOException {
		OutputStream fileOutPutStream = new FileOutputStream("texto-generado.txt");

		// Proceso el archivo
		Writer outputStreamReader = new OutputStreamWriter(fileOutPutStream);
		// escribir el archivo
		BufferedWriter bufferWriter = new BufferedWriter(outputStreamReader);
		bufferWriter.write("Primera linea de mi archivo generado");
		bufferWriter.newLine();
		bufferWriter.write("Segunda linea de mi archivo generado");
		bufferWriter.close();
		
		PrintStream printStream = new PrintStream("texto-print-string.txt");
		printStream.println("Primera Linea generada via PrintStream");
		printStream.close();
	}

}
