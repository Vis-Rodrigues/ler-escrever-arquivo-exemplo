package br.cpm.fiap;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscreverArquivoTXT {

	public static void main(String[] args) {

		// Abre o arquivo
		FileWriter stream;
		try {
			stream = new FileWriter("arquivo.txt");

			PrintWriter print = new PrintWriter(stream);

			// Escreve no arquivo
			print.println("Teste");
			print.println("Escrevendo no arquivo");
			
			print.close();
			// Fecha o arquivo
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
