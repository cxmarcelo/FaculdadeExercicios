package exercicio.vetor;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exercicios.vetor.Aluno;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CriarAlunoInterface extends JFrame {

	private JPanel contentPane;
	private JTextField textRA;
	private JTextField textNome;
	private JTextField textDisciplina;
	private JTextField textNP1;
	private JTextField textNP2;
	private JTextField textNSub;
	private JTextField textNExame;
	private Aluno alunoCriado;
	private String opcao;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarAlunoInterface frame = new CriarAlunoInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CriarAlunoInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		
		
		
		JLabel lblRa = new JLabel("RA");
		contentPane.add(lblRa);
		
		textRA = new JTextField();
		contentPane.add(textRA);
		textRA.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		contentPane.add(lblDisciplina);
		
		textDisciplina = new JTextField();
		contentPane.add(textDisciplina);
		textDisciplina.setColumns(10);
		
		JLabel lblNp1 = new JLabel("NP1");
		contentPane.add(lblNp1);
		
		textNP1 = new JTextField();
		contentPane.add(textNP1);
		textNP1.setColumns(10);
		
		JLabel lblNp2 = new JLabel("NP2");
		contentPane.add(lblNp2);
		
		textNP2 = new JTextField();
		contentPane.add(textNP2);
		textNP2.setColumns(10);
		
		JLabel lblNSub = new JLabel("NSub");
		contentPane.add(lblNSub);
		
		textNSub = new JTextField();
		contentPane.add(textNSub);
		textNSub.setColumns(10);
		
		JButton btnCriarAluno = new JButton("Criar");
		btnCriarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					alunoCriado = new Aluno(textRA.getText(), textNome.getText(), textDisciplina.getText(),
							Float.parseFloat(textNP1.getText()), Float.parseFloat(textNP2.getText()),
							Float.parseFloat(textNSub.getText()), Float.parseFloat(textNExame.getText()));
					JOptionPane.showMessageDialog(null, "Aluno Criado");
					dispose();					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro: Dados inválidos");
				}
			}
		});
		
		JLabel lblNExame = new JLabel("NExame");
		contentPane.add(lblNExame);
		
		textNExame = new JTextField();
		contentPane.add(textNExame);
		textNExame.setColumns(10);
		contentPane.add(btnCriarAluno);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcao = "voltar";
				dispose();
			}
		});
		contentPane.add(btnVoltar);
		pack();
		
	}

	public Aluno getAlunoCriado() {
		return alunoCriado;
	}

	public String getOpcao() {
		return opcao;
	}
}
