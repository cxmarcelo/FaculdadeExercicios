package aula.aplicacaoGrafica;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AplicacaoGrafica9 {

		public static void main(String[] args) {
			JButton btn1, btn2, btn3;
			JLabel lbl1, lbl2;

			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame minha_janela = new JFrame("Interface gr�fica SWING -  Vers�o 5");

			btn1 = new JButton("Bot�o 1");
			btn2 = new JButton("Bot�o 2");
			btn3 = new JButton("Bot�o 3");

			lbl1 = new JLabel("Grupo de bot�es 1");
			lbl2 = new JLabel("Grupo de bot�es 2");


			minha_janela.setBounds(200 , 300, 600, 400);
			minha_janela.getContentPane().setLayout(new BorderLayout());	
			minha_janela.getContentPane().add(lbl1, BorderLayout.NORTH);
			minha_janela.getContentPane().add(btn1, BorderLayout.EAST);
			minha_janela.getContentPane().add(lbl2, BorderLayout.SOUTH);
			minha_janela.getContentPane().add(btn2, BorderLayout.WEST );
			minha_janela.getContentPane().add(btn3, BorderLayout.CENTER);
			minha_janela.setVisible(true);
		}

}
