package br.cpm.fiap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ArquivoCSV {

	public static void main(String[] args) {

		String nomeArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "/" + nomeArquivo;
		
		List<String> conteudo = new ArrayList<String>();
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade;");
		conteudo.add("Pera; 200; pct; R$ 5.40;");
		conteudo.add("Morango; 400; cx; R$ 6.50;");
		conteudo.add("Abacaxi; 280; un; R$ 5.00;");
		
		gravarEstoque(nomeArquivo, caminho, conteudo);
		lerEstoque(caminho);
		
	}
	
	private static void gravarEstoque(String nomeArquivo, String caminho, List<String> conteudo) {
		FileWriter stream;
		PrintWriter print;
		
		try {
			// stream é uma conexão de escrita para o arquivo
			stream = new FileWriter(caminho);
			// a classe PrintWriter escreverá no arquivo
			print = new PrintWriter(stream); 
			
			for (String linha: conteudo) {
				//o método println escreve uma linha no arquivo
				print.println(linha);
			}
			print.close();
			stream.close();
			
			System.out.println("O arquivo "+ nomeArquivo + " foi salvo em "+ caminho);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	private static void lerEstoque(String caminho) {
		try {
			//Abre o arquivo
			FileReader stream = new FileReader(caminho);
			
			//BufferedReader possui o método readLine()
			//lê uma linha do arquivo e retorna uma String com valor lido ou null
			BufferedReader reader = new BufferedReader(stream);
			//Lê uma linha do arquivo
			String linha = reader.readLine();
			
			while (linha !=null) {
				System.out.println(linha);
				//Lê a próxima linha do arquivo
				linha = reader.readLine(); 
			}
			reader.close();
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
