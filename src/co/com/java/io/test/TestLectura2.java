package co.com.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestLectura2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("contas.csv"));
		String linea= scanner.nextLine();
		System.out.println(linea);
		while ((linea = scanner.nextLine()) != null && scanner.hasNextLine()) {
			//System.out.println(linea);
			 // usando split
			String[] lineas=linea.split(",");
			System.out.println(Arrays.toString(lineas));
			//Formatear un string
			System.out.println(String.format("%s,%s,%s", lineas));
			//System.out.println(lineas[0]);
			System.out.println(String.format("Diego tiene %d años", 29));
			
			
			//Usando scanner
			/*Scanner lineaScanner= new Scanner(linea);
			lineaScanner.useDelimiter(",");
			String valor;
			while (lineaScanner.hasNextLine()&&(valor = lineaScanner.nextLine())!=null) {
				System.out.println(valor);
				
			}*/
		}
		
	}

}
