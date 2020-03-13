package aulaFiles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtEmail;
	private Pessoa pessoa = new Pessoa();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 11, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 36, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 61, 46, 14);
		contentPane.add(lblEmail);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(66, 8, 231, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 33, 231, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(66, 58, 231, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pessoa.codigo = JOptionPane.showInputDialog(null, "Forneça o código para abrir");
				pessoa = pessoa.ler("c:/temp");
				if(pessoa != null) {
					txtCodigo.setText(pessoa.codigo);
					txtNome.setText(pessoa.nome);
					txtEmail.setText(pessoa.email);
				}else {
					JOptionPane.showMessageDialog(null, "");
				}
			}
		});
		btnAbrir.setBounds(10, 86, 89, 23);
		contentPane.add(btnAbrir);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtCodigo.getText() == "") {
					JOptionPane.showMessageDialog(null,"O Código não pode estar vazio");
					txtCodigo.requestFocus();
				}else if(txtNome.getText() == "") {
					JOptionPane.showMessageDialog(null,"O Nome não pode estar vazio");
					txtNome.requestFocus();
				}else if(txtEmail.getText() == "") {
					JOptionPane.showMessageDialog(null,"O Email não pode estar vazio");
					txtCodigo.requestFocus();
				}else {
					
					pessoa.codigo = txtCodigo.getText();
					pessoa.nome =  txtNome.getText();
					pessoa.email = txtEmail.getText();
					JOptionPane.showMessageDialog(null, pessoa.gravar("c:/temp"));
				}
			}
		});
		btnGravar.setBounds(109, 86, 89, 23);
		contentPane.add(btnGravar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtCodigo.setText("");
				txtNome.setText("");
				txtEmail.setText("");
			}
		});
		btnLimpar.setBounds(208, 86, 89, 23);
		contentPane.add(btnLimpar);
	}
}
