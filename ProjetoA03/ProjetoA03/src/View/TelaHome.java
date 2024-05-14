package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class TelaHome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblImagemUnifacs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHome frame = new TelaHome();
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
	public TelaHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(120, 20, 99, 46);
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHome.setBorder(UIManager.getBorder("TextArea.border"));
		btnHome.setForeground(Color.BLACK);
		btnHome.setBackground(Color.GRAY);
		
		JButton btnCalculadoraDeMacros = new JButton("Calculadora de Macros");
		btnCalculadoraDeMacros.setBounds(254, 21, 180, 46);
		btnCalculadoraDeMacros.setForeground(Color.BLACK);
		btnCalculadoraDeMacros.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalculadoraDeMacros.setBorder(UIManager.getBorder("TextPane.border"));
		btnCalculadoraDeMacros.setBackground(Color.GRAY);
		btnCalculadoraDeMacros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCalculadora tc = new TelaCalculadora();
				tc.setVisible(true);
				dispose();
				
			}
		});
		
		String txtDescricao = "Somos um grupo de estudantes que resolveram realizar um prótotipo de aplicação para nosso trabalho da faculdade, \\r\\nvoltado para a saude e o bem estar dos nossos usuarios. \\r\\r\\n\\r\\r\\nNossa ideia é facilitar e otimizar o processo de iniciação em dietas para pessoas que nao tem condição \\r\\nou conhecimento para montar uma dieta que atenda suas necessidades físicas e psicológicas.";
		
		JTextArea textAreaDescricao = new JTextArea();
		textAreaDescricao.setBounds(351, 143, 357, 257);
		textAreaDescricao.setFont(new Font("Lucida Sans Typewriter", Font.ITALIC, 13));
		textAreaDescricao.setLineWrap(true);
		textAreaDescricao.setText("Somos um grupo de estudantes que resolveram realizar um prótotipo de aplicação para nosso trabalho da faculdade, voltado para a saude e o bem estar dos nossos usuarios. \r\n\r\n\n\nNossa ideia é facilitar e otimizar o processo de iniciação em dietas para pessoas que nao tem condição ou conhecimento para montar uma dieta que atenda suas necessidades físicas e psicológicas.");
		
		JLabel lblNewLabel = new JLabel("Sobre nós:");
		lblNewLabel.setBounds(481, 115, 75, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblGitHUB = new JLabel("GitHub");
		lblGitHUB.setBounds(30, 479, 78, 33);
		 lblGitHUB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 try {
	                    // Abre o navegador padrão com o link especificado
	                    Desktop.getDesktop().browse(new URI("https://github.com/Bernardosc1"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
				
			}
		});
		 lblGitHUB.setHorizontalAlignment(SwingConstants.CENTER);
		 lblGitHUB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblGitHUB.setForeground(SystemColor.textHighlight);
		contentPane.setLayout(null);
		
		lblImagemUnifacs = new JLabel("");
		lblImagemUnifacs.setIcon(new ImageIcon("C:\\Users\\berna\\OneDrive\\Documentos\\Programação\\Estudo\\Java\\eclipse-workspace\\ProjetoA03\\assets\\logoUnifacs (2).png"));
		
		lblImagemUnifacs.setBounds(575, 463, 150, 48);
		contentPane.add(lblImagemUnifacs);
		contentPane.add(textAreaDescricao);
		contentPane.add(lblNewLabel);
		contentPane.add(btnHome);
		contentPane.add(btnCalculadoraDeMacros);
		contentPane.add(lblGitHUB);
		
		JLabel lblLinkedin = new JLabel("Linkedin");
		lblLinkedin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
	                    // Abre o navegador padrão com o link especificado
	                    Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/bernardo-soledade/"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
			}
		});
		lblLinkedin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinkedin.setForeground(SystemColor.textHighlight);
		lblLinkedin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLinkedin.setBounds(149, 479, 78, 33);
		contentPane.add(lblLinkedin);
		
		JLabel lblImagemLogo = new JLabel("");
		lblImagemLogo.setIcon(new ImageIcon("C:\\Users\\berna\\OneDrive\\Documentos\\Programação\\Estudo\\Java\\eclipse-workspace\\ProjetoA03\\assets\\img_fitness.jpeg"));
		
		lblImagemLogo.setBounds(59, 143, 244, 212);
		contentPane.add(lblImagemLogo);
		
		JButton btnCalculadoraEstrategias = new JButton("Estrategias Recomendadas");
		btnCalculadoraEstrategias.setForeground(Color.BLACK);
		btnCalculadoraEstrategias.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalculadoraEstrategias.setBorder(UIManager.getBorder("TextPane.border"));
		btnCalculadoraEstrategias.setBackground(Color.GRAY);
		btnCalculadoraEstrategias.setBounds(468, 22, 194, 46);
		contentPane.add(btnCalculadoraEstrategias);
	}
}
