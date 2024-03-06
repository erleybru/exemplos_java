package br.eti.erley.exemplo1;

import java.io.FileReader;
import java.nio.charset.*;
import java.io.IOException;

public class Arquivo {

	public static void main(String[] args) {
		try {
			// abre um aquivo para leitura. usando charset default
			FileReader reader = new FileReader("teste.txt");

			// Exemplo informando o charset UTF-8
			FileReader entrada = new FileReader("teste_utf8.txt", Charset.forName("UTF8"));
			
			/*
			 * veja os métodos: 
			 * 		ready() - está pronto para ser lido? 
			 * 		mark() - marca a posicao que foi lida 
			 * 		reset() - retorna o controle para a ultima marca (mark())
			 */
						
			// Retornando a codificação de caracteres usada
			System.out.println("Codificacao Chaset de teste.txt: " + reader.getEncoding());
			System.out.println("Codificacao Chaset de teste_utf8.txt: " + entrada.getEncoding());

			// fecha o arquivo
			reader.close();
			entrada.close();
		} // fim do try
		catch(IOException e) {
//			System.out.println("Arquivo nao encontrado!");
			e.getStackTrace();
		}

	}

}
