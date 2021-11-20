package screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setResizable(false);
		setTitle("Tela principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Que tipo de registro voc\u00EA quer?");
		lblNewLabel.setBounds(77, 5, 270, 21);
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		JButton btnProfessor = new JButton("Professor");
		btnProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaRegistroProfessor frame = new TelaRegistroProfessor();
				frame.setVisible(true);
			}
		});
		btnProfessor.setBounds(77, 51, 129, 23);
		panel.add(btnProfessor);
		
		JButton btnAluno = new JButton("Aluno");
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaRegistroAluno frame = new TelaRegistroAluno();
				frame.setVisible(true);
			}
		});
		btnAluno.setBounds(218, 51, 129, 23);
		panel.add(btnAluno);
	}
}
