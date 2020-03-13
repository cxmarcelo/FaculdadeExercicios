package aulaFiles;

import java.io.*;
public class CriarDiretorio {

	public static void main(String[] args) {

		File dir = new File("c:/loja");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		dir = new File("c:/loja/site");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		dir = new File("c:/loja/site/imagens");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		dir = new File("c:/loja/site/video");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		dir = new File("c:/loja/site/sons");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		System.out.println("Final do processo de criação");
		
		
	}
}
