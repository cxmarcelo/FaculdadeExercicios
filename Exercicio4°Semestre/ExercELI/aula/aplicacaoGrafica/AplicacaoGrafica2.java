package aula.aplicacaoGrafica;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AplicacaoGrafica2 extends JFrame {
	
	public AplicacaoGrafica2() {
		super("Interface Gr�fica Swing - vers�o - 2");
		
	}
	
	public void Executa() {
		setBounds(300, 300, 320, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AplicacaoGrafica2().Executa();
	}
}
