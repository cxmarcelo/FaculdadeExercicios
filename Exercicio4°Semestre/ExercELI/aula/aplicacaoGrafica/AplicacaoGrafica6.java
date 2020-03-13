package aula.aplicacaoGrafica;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class AplicacaoGrafica6 extends JFrame{

	JButton btn1, btn2, btn3, btn4;
	JLabel lbl1, lbl2;

	public AplicacaoGrafica6() {
		super("Interface gráfica SWING - versão 6");
	}

	public void executar() {
		btn1 = new JButton("Botão 1");
		btn2 = new JButton("Botão 2");
		btn3 = new JButton("Botão 3");
		btn4 = new JButton("Botão 4");

		lbl1 = new JLabel("Grupo de botões 1");
		lbl2 = new JLabel("Grupo de botões 2");

		setBounds(200 , 300, 600, 400);
		getContentPane().setLayout(new FlowLayout());	
		getContentPane().add(lbl1);
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		getContentPane().add(lbl2);
		getContentPane().add(btn3);
		getContentPane().add(btn4);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new AplicacaoGrafica6().executar();
	}

}
