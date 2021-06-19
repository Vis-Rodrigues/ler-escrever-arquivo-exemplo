package br.cpm.fiap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoTXT {

	public static void main(String[] args) {
		// Abre o arquivo
		FileReader stream;
		try {
			stream = new FileReader("arquivo.txt");
			BufferedReader reader = new BufferedReader(stream);

			// Lê uma linha do arquivo
			String linha = reader.readLine();
			while (linha != null) {
				System.out.println(linha);
				// Lê a próxima linha do arquivo
				linha = reader.readLine();
			}

			reader.close();
			// Fechar o arquivo
			stream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
