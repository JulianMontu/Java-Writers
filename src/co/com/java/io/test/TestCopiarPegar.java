package co.com.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TestCopiarPegar {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket();
		//InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(socket.getInputStream());
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		Socket socket2=new Socket();
		//OutputStream fileOutPutStream = new FileOutputStream("texto-copia2.txt");
		Writer outputStreamReader = new OutputStreamWriter(socket2.getOutputStream());
		BufferedWriter bufferWriter = new BufferedWriter(outputStreamReader);
		String linea;

		while ((linea = bufferReader.readLine()) != null) {
			bufferWriter.write(linea);
			bufferWriter.newLine();
		}
		bufferWriter.close();

	}

}
