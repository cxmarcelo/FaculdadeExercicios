package interfaceSlide107;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Interface107 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JFormattedTextField txtIdade;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtDddtel;
	private JTextField txtDddcel;
	private JTextField txtCelular;
	private JTextField txtNumero;
	private JTextField txtCep;
	private JTextField txtNaturalidade;
	private ButtonGroup grupoMF;
	private ButtonGroup grupoSO;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnWindows;
	private JRadioButton rdbtnLinux;
	private JRadioButton rdbtnUnix;
	private JComboBox<String> comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface107 frame = new Interface107();
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
	public Interface107() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 36, 56, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(10, 61, 46, 14);
		contentPane.add(lblBairro);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 86, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(10, 138, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 185, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 227, 56, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(314, 227, 46, 14);
		contentPane.add(lblCelular);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String proTxt = "";
				proTxt = "Nome: " + txtNome.getText() + "\n";
				proTxt += "Endereço: " + txtEndereco.getText() + "    CEP: " + txtCep.getText() + "\n";
				proTxt += "Bairro: " + txtBairro.getText() + "    UF: " + comboBox.getSelectedItem() + "\n";
				proTxt += "Idade: " + txtIdade.getText() + "     Naturalidade: " + txtNaturalidade.getText() + "\n";
				if(rdbtnFeminino.isSelected()) {
					proTxt += "Sexo: Feminino \n" ; 
				}else if(rdbtnMasculino.isSelected()) {
					proTxt += "Sexo: Masculino \n";
				}else {
					JOptionPane.showMessageDialog(null, "Selecione seu sexo");
					return;
				}
				proTxt += "Email: " + txtEmail.getText() + "\n";
				proTxt += "Telefone: " + txtDddtel.getText() + " " + txtTelefone.getText() + "  Celular: " + txtDddcel.getText() + " " + txtCelular.getText() + "\n";
				
				if(rdbtnWindows.isSelected()) {
					proTxt += "Sistema Operacional: Windows \n"; 
				}else if(rdbtnLinux.isSelected()) {
					proTxt += "Sistema Operacional: Linux \n";
				}else if(rdbtnUnix.isSelected()) {
					proTxt += "Sistema Operacional: Unix \n";
				}else {
					JOptionPane.showMessageDialog(null, "Selecione o seu Sistema Operacional");
					return;
				}
				
				System.out.println(proTxt);
				
				
			}
		});
		btnCadastrar.setBounds(63, 427, 100, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtBairro.setText("");
				txtCelular.setText("");
				txtCep.setText("");
				txtDddcel.setText("");
				txtDddtel.setText("");
				txtEmail.setText("");
				txtEndereco.setText("");
				txtIdade.setText("");
				txtNaturalidade.setText("");
				txtNumero.setText("");
				txtTelefone.setText("");
				grupoMF.clearSelection();
				grupoSO.clearSelection();
				
			}
		});
		btnLimpar.setBounds(257, 428, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnFechar.setBounds(443, 427, 89, 23);
		contentPane.add(btnFechar);
		
		txtNome = new JTextField();
		txtNome.setBounds(76, 8, 346, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(76, 33, 346, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(76, 58, 346, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtIdade = new JFormattedTextField();
		txtIdade.setBounds(76, 83, 153, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(76, 182, 238, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(132, 224, 172, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtDddtel = new JTextField();
		txtDddtel.setBounds(76, 224, 46, 20);
		contentPane.add(txtDddtel);
		txtDddtel.setColumns(10);
		
		txtDddcel = new JTextField();
		txtDddcel.setBounds(370, 224, 52, 20);
		contentPane.add(txtDddcel);
		txtDddcel.setColumns(10);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(439, 224, 135, 20);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(442, 11, 46, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(498, 8, 76, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(442, 36, 46, 14);
		contentPane.add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setBounds(498, 33, 76, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(442, 61, 46, 14);
		contentPane.add(lblUf);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(498, 60, 76, 17);
		contentPane.add(comboBox);
		
		comboBox.addItem("AC");
		comboBox.addItem("AL");
		comboBox.addItem("AP");
		comboBox.addItem("AM");
		comboBox.addItem("BA");
		comboBox.addItem("CE");
		comboBox.addItem("DF");
		comboBox.addItem("ES");
		comboBox.addItem("GO");
		comboBox.addItem("MA");
		comboBox.addItem("MT");
		comboBox.addItem("MS");
		comboBox.addItem("MG");
		comboBox.addItem("PA");
		comboBox.addItem("PB");
		comboBox.addItem("PR");		
		comboBox.addItem("PE");
		comboBox.addItem("PI");
		comboBox.addItem("RJ");
		comboBox.addItem("RN");
		comboBox.addItem("RS");
		comboBox.addItem("RO");
		comboBox.addItem("RR");
		comboBox.addItem("SC");
		comboBox.addItem("SP");
		comboBox.addItem("SE");
		comboBox.addItem("TO");
		
		JLabel lblInformeOSistema = new JLabel("Informe o sistema operacional que voc\u00EA utiliza");
		lblInformeOSistema.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblInformeOSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformeOSistema.setBounds(63, 281, 469, 40);
		contentPane.add(lblInformeOSistema);
		
		JLabel lblNaturalidade = new JLabel("Naturalidade");
		lblNaturalidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNaturalidade.setBounds(271, 86, 89, 14);
		contentPane.add(lblNaturalidade);
		
		txtNaturalidade = new JTextField();
		txtNaturalidade.setBounds(370, 83, 204, 20);
		contentPane.add(txtNaturalidade);
		txtNaturalidade.setColumns(10);
		
		JPanel panelSexo = new JPanel();
		panelSexo.setBounds(80, 120, 500, 50);
		contentPane.add(panelSexo);
		panelSexo.setLayout(null);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnMasculino.setBounds(100, 15, 130, 25);
		panelSexo.add(rdbtnMasculino);
		
		rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnFeminino.setBounds(300, 15, 130, 25);
		panelSexo.add(rdbtnFeminino);
		
		grupoMF = new ButtonGroup();
		grupoMF.add(rdbtnFeminino);
		grupoMF.add(rdbtnMasculino);
		
		JPanel panelSO = new JPanel();
		panelSO.setBounds(20, 330, 540, 80);
		contentPane.add(panelSO);
		panelSO.setLayout(null);
		
		
		
		rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(20, 26, 120, 30);
		panelSO.add(rdbtnWindows);
		
		rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(200, 26, 120, 30);
		panelSO.add(rdbtnLinux);
		
		rdbtnUnix = new JRadioButton("Unix");
		rdbtnUnix.setBounds(380, 26, 120, 30);
		panelSO.add(rdbtnUnix);

		grupoSO = new ButtonGroup();
		grupoSO.add(rdbtnWindows);
		grupoSO.add(rdbtnLinux);
		grupoSO.add(rdbtnUnix);
	}
}
