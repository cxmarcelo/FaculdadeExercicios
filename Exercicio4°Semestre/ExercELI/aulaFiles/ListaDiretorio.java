package aulaFiles;

import java.io.File;

import javax.swing.JOptionPane;

public class ListaDiretorio {
	
	public static void main(String[] args) {
		
		String path = JOptionPane.showInputDialog("Forne�a o caminho do diret�rio");
		File dir = new File(path);
		
		if(dir.isDirectory()) {
			System.out.println("Conte�do do diret�rio" + path);
			String s[] = dir.list();
			for(int x = 0; x < s.length; x++ ) {
				System.out.println(s[x]);
			}
		}else {
			System.out.println(path + "n�o � um diret�rio v�lido");
		}
	}

}
