package screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaRegistroProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCargaHoraria;
	private JTextField txtIdade;
	private JTextField txtEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRegistroProfessor frame = new TelaRegistroProfessor();
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
	public TelaRegistroProfessor() {
		setResizable(false);
		setTitle("Registro professor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de professor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 26, 494, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome do professor");
		lblNome.setFont(new Font("Ubuntu", Font.PLAIN, 12));
		lblNome.setBounds(10, 58, 414, 21);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 77, 494, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblMatricula_1_1 = new JLabel("Carga Horaria");
		lblMatricula_1_1.setFont(new Font("Ubuntu", Font.PLAIN, 12));
		lblMatricula_1_1.setBounds(10, 104, 203, 21);
		contentPane.add(lblMatricula_1_1);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setColumns(10);
		txtCargaHoraria.setBounds(10, 123, 246, 20);
		contentPane.add(txtCargaHoraria);
		
		Professor Prof1 = new Professor();
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prof1.setNome(txtNome.getText());
			//	Prof1.setEndereco(txtEndereco.getText());
				Prof1.setCargaHoraria(Integer.parseInt(txtCargaHoraria.getText()));
				Prof1.setIdade(Integer.parseInt(txtIdade.getText()));				
				
				 JOptionPane.showMessageDialog(null, "Professor " + Prof1.verificaTipo(), "Professor " + Prof1.getNome() + " de " + String.valueOf(Prof1.getIdade()) + " anos registrado!", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnCadastrar.setBounds(142, 204, 113, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSair.setBounds(265, 204, 113, 23);
		contentPane.add(btnSair);
		
		JLabel lblMatricula_1_1_1 = new JLabel("Idade");
		lblMatricula_1_1_1.setFont(new Font("Ubuntu", Font.PLAIN, 12));
		lblMatricula_1_1_1.setBounds(266, 104, 238, 21);
		contentPane.add(lblMatricula_1_1_1);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(266, 123, 238, 20);
		contentPane.add(txtIdade);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(10, 173, 494, 20);
		contentPane.add(txtEndereco);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setFont(new Font("Ubuntu", Font.PLAIN, 12));
		lblEndereo.setBounds(10, 154, 414, 21);
		contentPane.add(lblEndereo);
	}
}
