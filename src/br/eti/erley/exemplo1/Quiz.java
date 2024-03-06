package br.eti.erley.exemplo1;

import java.io.FileReader;
import java.io.IOException;

public class Quiz {

	public static void main(String[] args) {
//		try {
//			// abre um aquivo para leitura
			FileReader reader = new FileReader("teste.txt");
			
			// fecha o arquivo
			reader.close();
//		} // fim do try
//		catch(IOException e) {
//			System.out.println("Arquivo nao encontrado!");
//		}

	}

}
