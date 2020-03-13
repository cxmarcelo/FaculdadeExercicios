package exercicioFiles.ex3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConsultaPalavras {
	
	public boolean ConsultarPalavraJogo(File path) throws IOException {
		boolean retorno = false;
		@SuppressWarnings("resource")
		BufferedReader arquivo = new BufferedReader(new FileReader(path));
		String linha = null;
		while(arquivo.ready()) {
			linha = arquivo.readLine();
			if(linha.contains("jogo") || linha.contains("Jogo")|| linha.contains("jogos")|| linha.contains("Jogos")
					|| linha.contains("game")|| linha.contains("Game")|| linha.contains("games")|| linha.contains("Games")) {
				retorno = true;
			}
		}
		return retorno;
	}

	public static void main(String[] args) {

		ConsultaPalavras consulta = new ConsultaPalavras();
		
		File arquivo1 = new File("c:/exercicios4Semestre/consultaPalavras/consulta1.txt");
		File arquivo2 = new File("c:/exercicios4Semestre/consultaPalavras/consulta2.txt");
		
		try {
			
			System.out.println("Consulta 1: " + consulta.ConsultarPalavraJogo(arquivo1));
			System.out.println("Consulta 2: " + consulta.ConsultarPalavraJogo(arquivo2));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
