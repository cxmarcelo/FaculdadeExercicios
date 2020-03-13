package exercicios.vetor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exercicio.vetor.CriarAlunoInterface;
import exercicio.vetor.Vetor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VisualizacaoAlunos extends JFrame {

	private JPanel contentPane;
	private JPanel panelAlunos;
	private JLabel alunosRA[] = new JLabel[7];
	private JLabel alunosNomes[] = new JLabel[7];
	private JLabel alunosDisciplina[] = new JLabel[7];
	private JLabel alunosNP1[] = new JLabel[7];
	private JLabel alunosNP2[] = new JLabel[7];
	private JLabel alunosNSub[] = new JLabel[7];
	private JLabel alunosNMedia[] = new JLabel[7];
	private JLabel alunosNExame[] = new JLabel[7];
	private JLabel alunosNMediaFinal[] = new JLabel[7];
	private Vetor vetAlunos = new Vetor();	
	private CriarAlunoInterface telaCriarAluno;
	private int paginaAtual;
	private int paginas;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizacaoAlunos frame = new VisualizacaoAlunos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VisualizacaoAlunos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Exibir Alunos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vetAlunos.tamanho() == 0) {
					JOptionPane.showMessageDialog(null, "Nenhum Aluno Cadastrado");
				}else {
					int limiteCont;
					if(vetAlunos.tamanho() > 7) {
						limiteCont = 7;
					}else {
						limiteCont = vetAlunos.tamanho();
					}

					for(int x = 0; x < limiteCont ; x++) {

						alunosRA[x].setText(vetAlunos.pegarAlunos(x).getrA());

						alunosNomes[x].setText(vetAlunos.pegarAlunos(x).getNome());

						alunosDisciplina[x].setText(vetAlunos.pegarAlunos(x).getDisciplina());

						alunosNP1[x].setText("" + vetAlunos.pegarAlunos(x).getNotaNP1());

						alunosNP2[x].setText("" + vetAlunos.pegarAlunos(x).getNotaNP2());

						alunosNSub[x].setText("" + vetAlunos.pegarAlunos(x).getNotaSub());

						float media = mediaComSub(vetAlunos.pegarAlunos(x).getNotaNP1(), vetAlunos.pegarAlunos(x).getNotaNP2(), vetAlunos.pegarAlunos(x).getNotaSub());
						alunosNMedia[x].setText("" + media);

						if(media >= 7) {
							alunosNExame[x].setText("-");

							alunosNMediaFinal[x].setText("-");


						}else {
							alunosNExame[x].setText("" + vetAlunos.pegarAlunos(x).getNotaEx());

							float mediaF = (media + vetAlunos.pegarAlunos(x).getNotaEx()) / 2;
							alunosNMediaFinal[x].setText("" + mediaF);

						}

						revalidate();
						repaint();
					}


				}
			}
		});
		btnNewButton.setBounds(10, 94, 123, 23);
		contentPane.add(btnNewButton);

		JButton btnCriarAluno = new JButton("Adicionar Aluno");
		btnCriarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaCriarAluno = new CriarAlunoInterface();
				setVisible(false);
				telaCriarAluno.setVisible(true);
				telaCriarAluno.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosed(java.awt.event.WindowEvent windowEvent) {
						vetAlunos.adicionar(telaCriarAluno.getAlunoCriado());
						setVisible(true);
					}
				});
			}
		});
		btnCriarAluno.setBounds(425, 94, 149, 23);
		contentPane.add(btnCriarAluno);

		panelAlunos = new JPanel();
		panelAlunos.setBounds(10, 140, 564, 363);
		contentPane.add(panelAlunos);
		panelAlunos.setLayout(new GridLayout(0, 9, 0, 0));

		JLabel lblRa = new JLabel("RA");
		lblRa.setHorizontalAlignment(SwingConstants.CENTER);
		panelAlunos.add(lblRa);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		panelAlunos.add(lblNome);

		JLabel lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		panelAlunos.add(lblDisciplina);

		JLabel lblNp = new JLabel("NP1");
		lblNp.setHorizontalAlignment(SwingConstants.CENTER);
		panelAlunos.add(lblNp);

		JLabel lblNp_1 = new JLabel("NP2");
		lblNp_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelAlunos.add(lblNp_1);

		JLabel lblSub = new JLabel("Sub");
		lblSub.setHorizontalAlignment(SwingConstants.CENTER);
		panelAlunos.add(lblSub);

		JLabel lblMedia = new JLabel("Media");
		lblMedia.setHorizontalAlignment(SwingConstants.CENTER);
		panelAlunos.add(lblMedia);

		JLabel lblExame = new JLabel("Exame");
		lblExame.setHorizontalAlignment(SwingConstants.CENTER);
		panelAlunos.add(lblExame);

		JLabel lblMediaFinal = new JLabel("Media F");
		lblMediaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		panelAlunos.add(lblMediaFinal);


		for(int x = 0; x <7; x++) {

			alunosRA[x] = new JLabel("");
			alunosRA[x].setHorizontalAlignment(SwingConstants.CENTER);
			panelAlunos.add(alunosRA[x]);

			alunosNomes[x] = new JLabel("");
			alunosNomes[x].setHorizontalAlignment(SwingConstants.CENTER);
			panelAlunos.add(alunosNomes[x]);

			alunosDisciplina[x] = new JLabel("");
			alunosDisciplina[x].setHorizontalAlignment(SwingConstants.CENTER);
			panelAlunos.add(alunosDisciplina[x]);

			alunosNP1[x] = new JLabel("");
			alunosNP1[x].setHorizontalAlignment(SwingConstants.CENTER);
			panelAlunos.add(alunosNP1[x]);

			alunosNP2[x] = new JLabel("");
			alunosNP2[x].setHorizontalAlignment(SwingConstants.CENTER);
			panelAlunos.add(alunosNP2[x]);

			alunosNSub[x] = new JLabel("");
			alunosNSub[x].setHorizontalAlignment(SwingConstants.CENTER);
			panelAlunos.add(alunosNSub[x]);

			alunosNMedia[x] = new JLabel("");
			alunosNMedia[x].setHorizontalAlignment(SwingConstants.CENTER);
			panelAlunos.add(alunosNMedia[x]);

			alunosNExame[x] = new JLabel("");
			alunosNExame[x].setHorizontalAlignment(SwingConstants.CENTER);
			panelAlunos.add(alunosNExame[x]);

			alunosNMediaFinal[x] = new JLabel("");
			alunosNMediaFinal[x].setHorizontalAlignment(SwingConstants.CENTER);
			panelAlunos.add(alunosNMediaFinal[x]);
		}

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(467, 514, 107, 36);
		contentPane.add(btnSair);

		JLabel label = new JLabel("");
		label.setBounds(10, 11, 564, 61);
		contentPane.add(label);

		JButton buttonPagAnt = new JButton("<");
		buttonPagAnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(paginaAtual > 1) {
					paginaAtual--;
					for(int x =0; x <7; x++) {

						alunosRA[x].setText(vetAlunos.pegarAlunos(x).getrA());

						alunosNomes[x].setText(vetAlunos.pegarAlunos(x).getNome());

						alunosDisciplina[x].setText(vetAlunos.pegarAlunos(x).getDisciplina());

						alunosNP1[x].setText("" + vetAlunos.pegarAlunos(x).getNotaNP1());

						alunosNP2[x].setText("" + vetAlunos.pegarAlunos(x).getNotaNP2());

						alunosNSub[x].setText("" + vetAlunos.pegarAlunos(x).getNotaSub());

						float media = mediaComSub(vetAlunos.pegarAlunos(x).getNotaNP1(), vetAlunos.pegarAlunos(x).getNotaNP2(), vetAlunos.pegarAlunos(x).getNotaSub());
						alunosNMedia[x].setText("" + media);

						if(media >= 7) {
							alunosNExame[x].setText("-");

							alunosNMediaFinal[x].setText("-");


						}else {
							alunosNExame[x].setText("" + vetAlunos.pegarAlunos(x).getNotaEx());

							float mediaF = (media + vetAlunos.pegarAlunos(x).getNotaEx()) / 2;
							alunosNMediaFinal[x].setText("" + mediaF);

						}

						revalidate();
						repaint();

					}
				}

			}
		});
		buttonPagAnt.setBounds(184, 521, 89, 23);
		contentPane.add(buttonPagAnt);

		JButton buttonPagSeg = new JButton(">");
		buttonPagSeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(paginaAtual < paginas) {
					paginaAtual++;

					for(int x = 0 ; x < 7 ; x++) {
						int y = x + 7 *( paginaAtual -1) ;

						if(y >= vetAlunos.tamanho()) {
							alunosRA[x].setText("");

							alunosNomes[x].setText("");

							alunosDisciplina[x].setText("");

							alunosNP1[x].setText("");

							alunosNP2[x].setText("");

							alunosNSub[x].setText("");

							alunosNMedia[x].setText("");

							alunosNExame[x].setText("");

							alunosNMediaFinal[x].setText("");

							alunosNExame[x].setText("");

							alunosNMediaFinal[x].setText("");


							revalidate();
							repaint();

							// -----------------------------
						}else {
							alunosRA[x].setText(vetAlunos.pegarAlunos(x).getrA());

							alunosNomes[x].setText(vetAlunos.pegarAlunos(x).getNome());

							alunosDisciplina[x].setText(vetAlunos.pegarAlunos(x).getDisciplina());

							alunosNP1[x].setText("" + vetAlunos.pegarAlunos(x).getNotaNP1());

							alunosNP2[x].setText("" + vetAlunos.pegarAlunos(x).getNotaNP2());

							alunosNSub[x].setText("" + vetAlunos.pegarAlunos(x).getNotaSub());

							float media = mediaComSub(vetAlunos.pegarAlunos(x).getNotaNP1(), vetAlunos.pegarAlunos(x).getNotaNP2(), vetAlunos.pegarAlunos(x).getNotaSub());
							alunosNMedia[x].setText("" + media);

							if(media >= 7) {
								alunosNExame[x].setText("-");

								alunosNMediaFinal[x].setText("-");


							}else {
								alunosNExame[x].setText("" + vetAlunos.pegarAlunos(x).getNotaEx());

								float mediaF = (media + vetAlunos.pegarAlunos(x).getNotaEx()) / 2;
								alunosNMediaFinal[x].setText("" + mediaF);

							}

							revalidate();
							repaint();
						}

					}
				}
			}
		});


		buttonPagSeg.setBounds(312, 521, 89, 23);
		contentPane.add(buttonPagSeg);

	}

	private float mediaComSub(float np1, float np2, float nsub) {
		float n1, n2;
		if(np1 > np2 || np1 > nsub) {
			n1 = np1;
			if(np2 > nsub) {
				n2 = np2;
			}else {
				n2= nsub;
			}
		}else {
			n1 = np2;
			n2 = nsub;
		}
		return (n1 + n2) / 2;
	}

}
