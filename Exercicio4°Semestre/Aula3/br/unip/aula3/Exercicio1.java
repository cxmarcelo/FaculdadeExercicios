package br.unip.aula3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Exercicio1 extends JFrame implements ActionListener{

	private JButton botao1 = new JButton("Ação1");
	private JButton botao2 = new JButton("Ação2");
	
	
	public Exercicio1() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Exercício 1");
		setBounds(100, 100, 200, 150);
		
		JPanel painel = new JPanel();
		painel.setLayout(new FlowLayout());
		painel.setBounds(100,100, 400,400);

		botao1.addActionListener(this);
		/*botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Botão 1 pressionado");
				
			}
		});*/
		painel.add(botao1);
		botao2.addActionListener(this);
		/*botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Botão 2 pressionado");
				
			}
		});*/
		painel.add(botao2);
		
		setContentPane(painel);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botao1) {
			JOptionPane.showMessageDialog(null, "Botão 1 Pressionado");
		}else if(e.getSource() == botao2) {
			JOptionPane.showMessageDialog(null, "Botão 2 Pressionado");
		}
	}
	
	public static void main(String[] args) {
		new Exercicio1().setVisible(true);
	
	}


	
}


