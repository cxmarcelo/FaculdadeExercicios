package exercicioFiles.ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CadastroAmigos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAmigos frame = new CadastroAmigos();
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
	public CadastroAmigos() {
		setTitle("Cadastro Amigos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(0, 11, 56, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(66, 8, 208, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File dir = new File("c:/meusamigos");
				if(!dir.exists()) {
					dir.mkdir();
				}
				
				try {
					PrintWriter arquivo = new PrintWriter(new FileWriter("c:/meusamigos/arquivo.txt", true));
					arquivo.println(txtNome.getText());
					arquivo.flush();
					arquivo.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
		});
		btnInserir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnInserir.setBounds(185, 53, 89, 23);
		contentPane.add(btnInserir);


	}

}
