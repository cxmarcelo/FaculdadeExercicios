package br.unip.aula2;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Tela extends JFrame implements ActionListener{
	
	private JLabel lblP1, lblP2, lblMedia;
	private JTextField txtP1, txtP2, txtMedia;
	private JButton btnCalcular;
	
	
	
	
	public Tela() throws HeadlessException {
		
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(4, 2, 5, 5));
		
		
		setTitle("Cálculo de Média");
		
		lblP1 = new JLabel("P1");
		lblP1.setBounds(100, 100, 100, 100);
		
		lblP2 = new JLabel("Nota P1");
		lblP2.setBounds(100, 100, 100, 100);
		
		lblMedia = new JLabel("Média");
		btnCalcular = new JButton("Calcular");
		
		
		txtP1 = new JTextField("");
		txtP2 = new JTextField("");
		txtMedia = new JTextField("");
		txtMedia.setEditable(false);
		
		painel.add(lblP1);
		painel.add(txtP1);
		painel.add(lblP2);
		painel.add(txtP2);
		painel.add(lblMedia);
		painel.add(txtMedia);
		painel.add(btnCalcular);
		setContentPane(painel);
		pack();
		btnCalcular.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}




	public static void main(String[] args) {
		
		new Tela().setVisible(true);
	}




	@Override
	public void actionPerformed(ActionEvent arg0) {
		double p1 = Double.parseDouble(txtP1.getText());
		double p2 = Double.parseDouble(txtP2.getText());
		double media = (p1 +p2) / 2;
		txtMedia.setText("" + media);
		
		
		
		
	}
}
