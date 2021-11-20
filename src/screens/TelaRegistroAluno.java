package screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaRegistroAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeAluno;
	private JTextField txtNota1;
	private JTextField txtNota2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRegistroAluno frame = new TelaRegistroAluno();
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
	public TelaRegistroAluno() {
		setResizable(false);
		setTitle("Registrador de alunos 3000");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrador de Alunos 3000");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 22, 433, 29);
		contentPane.add(lblNewLabel);
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setBounds(20, 79, 423, 20);
		contentPane.add(txtNomeAluno);
		txtNomeAluno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do aluno");
		lblNewLabel_1.setBounds(20, 61, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nota 1");
		lblNewLabel_1_1.setBounds(20, 106, 212, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(20, 124, 200, 20);
		contentPane.add(txtNota1);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(231, 124, 212, 20);
		contentPane.add(txtNota2);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setBounds(231, 106, 212, 14);
		contentPane.add(lblNota2);
		
		Aluno Aluno01 = new Aluno();
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno01.setNome(txtNomeAluno.getText());
				Aluno01.setNota1(Double.valueOf(txtNota1.getText()));
				Aluno01.setNota2(Double.valueOf(txtNota2.getText()));
				
				JOptionPane.showMessageDialog(null, "Aluno " + Aluno01.getNome() + " possui média " + String.valueOf(Aluno01.retornaResultado()) , "Aluno " + Aluno01.Situacao, JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnCadastrar.setBounds(106, 155, 113, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSair.setBounds(229, 155, 113, 23);
		contentPane.add(btnSair);
	}
}
