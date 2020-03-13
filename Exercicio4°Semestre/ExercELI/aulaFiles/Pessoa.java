package aulaFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Pessoa {

	public String codigo, nome, email;
	public Pessoa ler(String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path + "/" + codigo + ".txt"));
			codigo = br.readLine();
			nome = br.readLine();
			email = br.readLine();
			br.close();
			return this;

		} catch (Exception e) {
			return null;
		}
	}
	
	
	public String gravar(String path) {
		try {
			File dir = new File(path);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			PrintWriter pw = new PrintWriter(path + "/" + codigo + ".txt");
			pw.println(codigo);
			pw.println(nome);
			pw.println(email);
			pw.flush();
			pw.close();
			return "Arquivo gravado com sucesso!";
		} catch (IOException erro) {
			return "Falha ao gravar o arquivo: " + erro.toString();
		}
	}
}
