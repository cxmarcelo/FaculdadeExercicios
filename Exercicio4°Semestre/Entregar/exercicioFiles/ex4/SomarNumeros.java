package exercicioFiles.ex4;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class SomarNumeros extends JFrame {

	private JPanel contentPane;
	private JLabel lblNumeros;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SomarNumeros frame = new SomarNumeros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SomarNumeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarNumeros();
			}
		});
		btnMostrar.setBounds(95, 11, 89, 23);
		contentPane.add(btnMostrar);

		JButton btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				somar();
			}
		});
		btnSomar.setBounds(224, 11, 89, 23);
		contentPane.add(btnSomar);

		lblNumeros = new JLabel("");
		lblNumeros.setBounds(10, 83, 414, 154);
		contentPane.add(lblNumeros);
	}

	public void mostrarNumeros() {
		try {
			@SuppressWarnings("resource")
			BufferedReader arquivo = new BufferedReader(new FileReader("c:/exercicios4Semestre/exSomar/numeros.txt"));
			String linha = "";
			while(arquivo.ready()) {
				linha += arquivo.readLine() + " - ";
			}
			lblNumeros.setText(linha);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void somar() {
		try {
			@SuppressWarnings("resource")
			BufferedReader arquivo = new BufferedReader(new FileReader("c:/exercicios4Semestre/exSomar/numeros.txt"));
			int soma = 0;
			while(arquivo.ready()) {
				try {
					soma += Integer.parseInt(arquivo.readLine());
				} catch (Exception e) {
					continue;
				}
			lblNumeros.setText("Soma de todos números: " +  soma);
			
			}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
