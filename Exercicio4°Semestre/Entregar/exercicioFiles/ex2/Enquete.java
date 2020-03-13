package exercicioFiles.ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Enquete extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnSim;
	private JRadioButton rdbtnNao;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enquete frame = new Enquete();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Enquete() {
		setTitle("Você é a favor do aborto ?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 87);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setBounds(5, 5, 141, 41);
		rdbtnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnNao.setSelected(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(rdbtnSim);



		rdbtnNao = new JRadioButton("Não");
		rdbtnNao.setBounds(146, 5, 141, 41);
		rdbtnNao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnSim.setSelected(false);
			}
		});
		contentPane.add(rdbtnNao);

		JButton btnVotar = new JButton("Votar");
		btnVotar.setBounds(287, 5, 141, 41);
		btnVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File dir = new File("c:/exercicios4Semestre");
				if(!dir.exists()) {
					dir.mkdir();
				}
				dir = new File("c:/exercicios4Semestre/enquete");
				if(!dir.exists()) {
					dir.mkdir();
				}

				try {
					File criandoArquivo = new File("c:/exercicios4Semestre/enquete/arquivo.txt");
					if(!criandoArquivo.exists()) {
						criandoArquivo.createNewFile();
					}else {
						BufferedReader br = new BufferedReader(new FileReader("c:/exercicios4Semestre/enquete/arquivo.txt"));
						int votos[] = new int[2];
						int x = 0;
						while(br.ready()){
							votos[x] =  Integer.parseInt(br.readLine());
							x++;
						}
						br.close();	

						if(rdbtnSim.isSelected()) {
							votos[0]++;
						}else if(rdbtnNao.isSelected()) {
							votos[1]++;
						}else {
							JOptionPane.showMessageDialog(null, "Coloque uma resposta");
							return;
						}
						PrintWriter arquivo = new PrintWriter(new FileWriter("c:/exercicios4Semestre/enquete/arquivo.txt", false));
						arquivo.println(votos[0]);
						arquivo.println(votos[1]);
						arquivo.flush();
						arquivo.close();
						JOptionPane.showMessageDialog(null,"Voto computado!");
						System.exit(0);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}


			}
		});
		contentPane.add(btnVotar);

	}

}
