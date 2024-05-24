package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Model.Usuario;

public class TelaInformacoes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaInformacoes(Usuario usuario) {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaHome home = new TelaHome(usuario);
				home.setVisible(true);
				dispose();
				
			}
		});
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.setBounds(1313, 13, 48, 40);
		contentPane.add(btnNewButton);
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setBounds(139, 323, 76, 80);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaHome home = new TelaHome(usuario);
				home.setVisible(true);
				dispose();
			}
		});
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setBounds(63, 398, 227, 34);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea("\r\n"
				+ "A importância da boa forma física para a saúde é fundamental e abrange diversos aspectos do bem-estar geral. Manter-se fisicamente ativo ajuda a prevenir uma série de doenças crônicas, como diabetes tipo 2, doenças cardíacas, hipertensão e certos tipos de câncer. Além disso, o exercício regular melhora a saúde mental, aliviando sintomas de depressão e ansiedade, e promove um sono de melhor qualidade.\r\n"
				+ "\r\n"
				+ "Uma das maneiras de avaliar a forma física de uma pessoa é através do Índice de Massa Corporal (IMC), que é uma medida baseada na relação entre o peso e a altura do indivíduo. As categorias do IMC são:\r\n"
				+ "\r\n"
				+ "Abaixo do peso (IMC inferior a 18,5): Pessoas nesta categoria podem estar em risco de deficiências nutricionais, osteoporose, e fraqueza imunológica. É importante buscar orientação médica para garantir uma alimentação adequada e equilibrada.\r\n"
				+ "\r\n"
				+ "Peso normal (IMC entre 18,5 e 24,9): Indica um peso saudável, associado a um menor risco de doenças crônicas. Manter-se dentro dessa faixa através de uma dieta equilibrada e exercício físico regular é ideal para a saúde geral.\r\n"
				+ "\r\n"
				+ "Sobrepeso (IMC entre 25 e 29,9): Pessoas nesta categoria têm um risco aumentado de desenvolver condições como hipertensão, diabetes tipo 2 e doenças cardiovasculares. Medidas para reduzir o peso, como mudanças na dieta e aumento da atividade física, são recomendadas.\r\n"
				+ "\r\n"
				+ "Obesidade Grau I (IMC entre 30 e 34,9): Este nível de obesidade está associado a um risco significativamente maior de problemas de saúde, incluindo doenças cardíacas, diabetes, e alguns tipos de câncer. Intervenções mais intensivas na dieta, exercício físico e, possivelmente, medicamentos são necessários para reduzir o risco de complicações.\r\n"
				+ "\r\n"
				+ "Obesidade Grau II (IMC entre 35 e 39,9): Os riscos de saúde são ainda mais altos nesta categoria, exigindo um enfoque mais rigoroso no controle do peso. Acompanhamento médico regular e, em alguns casos, cirurgia bariátrica podem ser considerados.\r\n"
				+ "\r\n"
				+ "Obesidade Grau III ou mórbida (IMC igual ou superior a 40): Representa um risco extremamente alto de doenças graves e complicações de saúde. A intervenção médica intensiva é essencial, frequentemente incluindo tratamentos cirúrgicos e uma abordagem multidisciplinar para o manejo do peso.\r\n"
				+ "\r\n"
				+ "Manter um IMC dentro da faixa saudável é crucial para a promoção de uma vida longa e saudável, destacando a importância da forma física na prevenção de doenças e na melhoria da qualidade de vida.");
		textArea.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textArea.setBorder(null);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setMargin(new Insets(1, 1, 1, 1));
		textArea.setEditable(false);
		textArea.setBounds(377, 113, 979, 626);
		contentPane.add(textArea);
		
		JLabel lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon("C:\\Users\\berna\\OneDrive\\Área de Trabalho\\A3\\3.png"));
		lblFundo.setBounds(1, 0, 1366, 768);
		contentPane.add(lblFundo);
	}
}
