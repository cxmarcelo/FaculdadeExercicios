package exercicioFiles.ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ResultadoEnquete extends JFrame {

	private JPanel contentPane;
	private JLabel lblSim;
	private JLabel lblNao;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultadoEnquete frame = new ResultadoEnquete();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ResultadoEnquete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 169, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnVer = new JButton("Ver Votação");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					@SuppressWarnings("resource")
					BufferedReader arquivo = new BufferedReader(new FileReader("c:/exercicios4semestre/enquete/arquivo.txt"));
					int votos[] = new int[2];
					int x = 0;
					try {
						while(arquivo.ready()) {
							votos[x] = Integer.parseInt(arquivo.readLine());
							x++;
						}
					} catch (NumberFormatException | IOException e) {
					}

					lblSim.setText("Sim: "+ votos[0]);
					lblNao.setText("Não: "+ votos[1]);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		});
		btnVer.setBounds(10, 10, 133, 23);
		contentPane.add(btnVer);

		lblSim = new JLabel();
		lblSim.setBounds(10, 50, 133, 23);
		contentPane.add(lblSim);

		lblNao = new JLabel();
		lblNao.setBounds(10, 85, 133, 23);
		contentPane.add(lblNao);
	}

}
