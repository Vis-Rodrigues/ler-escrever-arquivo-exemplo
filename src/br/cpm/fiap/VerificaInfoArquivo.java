package br.cpm.fiap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class VerificaInfoArquivo {

	public static void main(String[] args) {
		
		//Arquivo
		File arquivo = new File("arquivo.txt");
		
		if(arquivo.exists()) {
			System.out.println("O arquivo existe!");
			System.out.println("Pode ser lido: "+arquivo.canRead());
			System.out.println("Pode ser gravado: "+arquivo.canWrite());
			System.out.println("Tamanho: "+arquivo.length());
			System.out.println("Caminho: "+arquivo.getPath());
		}else {
			// Cria o arquivo
			try {
				if (arquivo.createNewFile()) {
					System.out.println("Arquivo criado!");
				}else{
					System.out.println("Arquivo não criado!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Diretorio
		File diretorio = new File("fiap");
		if(diretorio.exists()) {
			System.out.println("Diretório existe!");
		}else {
			if(diretorio.mkdir()) {
				System.out.println("Diretório criado!");
			}else {
				System.out.println("Diretório não criado!");
			}
		}
		
		//Diretorio + Arquivo
		File arquivo2 = new File(diretorio, "arquivo2.txt");
		try {
			if(arquivo2.createNewFile()) {
				System.out.println("Arquivo arquivo2.txt criado!");
			}else
				System.out.println("Arquivo não criado!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileWriter writer;
		try {
			// Escreve no arquivo
			writer = new FileWriter(arquivo2);
			PrintWriter print = new PrintWriter(writer);
			print.println("Graças a Deus deu certo!! :)");
			print.close();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
