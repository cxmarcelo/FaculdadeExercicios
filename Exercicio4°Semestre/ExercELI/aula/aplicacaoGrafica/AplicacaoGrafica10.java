package aula.aplicacaoGrafica;

import java.awt.BorderLayout;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class AplicacaoGrafica10 extends JFrame {


	JButton btn1, btn2, btn3, btn4;
	JLabel lbl1, lbl2;

	public AplicacaoGrafica10 () {
		super("Interface gráfica SWING - versão 7");
	}

	public void executar() {
		btn1 = new JButton("Botão 1");
		btn2 = new JButton("Botão 2");
		btn3 = new JButton("Botão 3");
		btn4 = new JButton("Botão 4");

		lbl1 = new JLabel("Grupo de botões 1");
		lbl2 = new JLabel("Grupo de botões 2");

		setBounds(200 , 300, 600, 400);
		getContentPane().setLayout(new BorderLayout());	
		getContentPane().add(lbl1, BorderLayout.NORTH);
		getContentPane().add(btn1, BorderLayout.EAST);
		getContentPane().add(lbl2, BorderLayout.SOUTH);
		getContentPane().add(btn2, BorderLayout.WEST );
		getContentPane().add(btn3, BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new AplicacaoGrafica10().executar();
		new AplicacaoGrafica10().executar();
		new AplicacaoGrafica10().executar();
		new AplicacaoGrafica10().executar();
		new AplicacaoGrafica10().executar();
		new AplicacaoGrafica10().executar();
		new AplicacaoGrafica10().executar();
		new AplicacaoGrafica10().executar();
		new AplicacaoGrafica10().executar();
	}
	
}
