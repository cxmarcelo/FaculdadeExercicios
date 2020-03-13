package aula.aplicacaoGrafica;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class aplicacaoGrafica5 {

	public static void main(String[] args) {
		JButton btn1, btn2, btn3, btn4;
		JLabel lbl1, lbl2;

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame minha_janela = new JFrame("Interface gráfica SWING -  Versão 5");

		btn1 = new JButton("Botão 1");
		btn2 = new JButton("Botão 2");
		btn3 = new JButton("Botão 3");
		btn4 = new JButton("Botão 4");

		lbl1 = new JLabel("Grupo de botões 1");
		lbl2 = new JLabel("Grupo de botões 2");


		minha_janela.setBounds(200 , 300, 600, 400);
		minha_janela.getContentPane().setLayout(new FlowLayout());	
		minha_janela.getContentPane().add(lbl1);
		minha_janela.getContentPane().add(btn1);
		minha_janela.getContentPane().add(btn2);
		minha_janela.getContentPane().add(lbl2);
		minha_janela.getContentPane().add(btn3);
		minha_janela.getContentPane().add(btn4);
		minha_janela.setVisible(true);
	}
}
