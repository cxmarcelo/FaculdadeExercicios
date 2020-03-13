package aula.aplicacaoGrafica;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AplicacaoGrafica4 extends JFrame {
	
	public AplicacaoGrafica4() {
		super("Interface gráfica SWING versão 4");
		setDefaultLookAndFeelDecorated(true);
	}
	
	public void executa() {
		setBounds(300, 300, 350, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new AplicacaoGrafica4().executa();
	}
}
