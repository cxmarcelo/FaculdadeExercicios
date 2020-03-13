package aulaFiles;

import java.io.File;

import javax.swing.JOptionPane;

public class ListaDiretorio {
	
	public static void main(String[] args) {
		
		String path = JOptionPane.showInputDialog("Forneça o caminho do diretório");
		File dir = new File(path);
		
		if(dir.isDirectory()) {
			System.out.println("Conteúdo do diretório" + path);
			String s[] = dir.list();
			for(int x = 0; x < s.length; x++ ) {
				System.out.println(s[x]);
			}
		}else {
			System.out.println(path + "não é um diretório válido");
		}
	}

}
