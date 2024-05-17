package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Model.ENivelDeAtividadeFisica;
import Model.EResultadoIMC;
import Model.Usuario;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class TelaCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int altura;
	int idade;
	int peso;
	Usuario usuario = new Usuario();
	DecimalFormat df = new DecimalFormat("#.##");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
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
    public TelaCalculadora() {
		setUndecorated(true);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1366, 768);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        ButtonGroup buttonGroupSexo = new ButtonGroup();
        JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
        rdbtnMasculino.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        rdbtnMasculino.setBounds(614, 182, 71, 23);

        JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
        rdbtnFeminino.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        rdbtnFeminino.setBounds(687, 182, 67, 23);

        buttonGroupSexo.add(rdbtnMasculino);
        buttonGroupSexo.add(rdbtnFeminino);

        JLabel lblNewLabel = new JLabel("Sexo:");
        lblNewLabel.setBounds(577, 183, 37, 21);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));

        JSpinner spinnerIdade = new JSpinner();
        spinnerIdade.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        spinnerIdade.setForeground(Color.LIGHT_GRAY);
        spinnerIdade.setBackground(Color.LIGHT_GRAY);
        spinnerIdade.setBounds(634, 238, 89, 20);
        spinnerIdade.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                idade = (int) spinnerIdade.getValue();
            }
        });
        spinnerIdade.setToolTipText("Em anos");

        JLabel lblIdade = new JLabel("Idade: ");
        lblIdade.setBounds(577, 241, 39, 14);
        lblIdade.setToolTipText("Em anos");
        lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
        lblIdade.setFont(new Font("Tahoma", Font.BOLD, 11));

        JSpinner spinnerAltura = new JSpinner();
        spinnerAltura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        spinnerAltura.setBounds(634, 276, 89, 20);
        spinnerAltura.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                altura = (int) spinnerAltura.getValue();
            }
        });
        spinnerAltura.setToolTipText("Em cm\r\n");

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(577, 279, 38, 14);
        lblAltura.setToolTipText("Em cm");
        lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
        lblAltura.setFont(new Font("Tahoma", Font.BOLD, 11));

        ButtonGroup buttonGroupAtivFisica = new ButtonGroup();
        JRadioButton rdbtnSedentario = new JRadioButton("Sedentário");
        rdbtnSedentario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        rdbtnSedentario.setBounds(628, 369, 91, 23);
        rdbtnSedentario.setToolTipText("0x (Por semana)");
        rdbtnSedentario.setHorizontalAlignment(SwingConstants.CENTER);

        JRadioButton rdbtnModerado = new JRadioButton("Moderado");
        rdbtnModerado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        rdbtnModerado.setBounds(714, 369, 84, 23);
        rdbtnModerado.setToolTipText("3x - 5x (Por semana)");
        rdbtnModerado.setHorizontalAlignment(SwingConstants.CENTER);

        JRadioButton rdbtnAtivo = new JRadioButton("Ativo");
        rdbtnAtivo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        rdbtnAtivo.setBounds(795, 369, 65, 23);
        rdbtnAtivo.setToolTipText("6x - 7x (Por semana)");
        rdbtnAtivo.setHorizontalAlignment(SwingConstants.CENTER);

        buttonGroupAtivFisica.add(rdbtnSedentario);
        buttonGroupAtivFisica.add(rdbtnModerado);
        buttonGroupAtivFisica.add(rdbtnAtivo);

        JLabel lblNewLabel_3 = new JLabel("Nível de atividade fisíca:");
        lblNewLabel_3.setBounds(484, 373, 139, 14);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));

        JLabel lblPeso = new JLabel("Peso:");
        lblPeso.setBounds(577, 317, 37, 14);
        lblPeso.setToolTipText("Em kg");
        lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
        lblPeso.setFont(new Font("Tahoma", Font.BOLD, 11));

        JSpinner spinnerPeso = new JSpinner();
        spinnerPeso.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        spinnerPeso.setBounds(634, 315, 65, 20);
        spinnerPeso.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                peso = (int) spinnerPeso.getValue();
            }
        });
        spinnerPeso.setToolTipText("Em kg");

        JLabel lblTituloResultado = new JLabel("Resultado");
        lblTituloResultado.setBounds(450, 417, 444, 22);
        lblTituloResultado.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTituloResultado.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblIMC = new JLabel("Índice de massa corporal (IMC): ");
        lblIMC.setHorizontalAlignment(SwingConstants.CENTER);
        lblIMC.setBounds(481, 453, 206, 14);
        

        JLabel lblTMB = new JLabel("Taxa Metabólica Basal (TMB):");
        lblTMB.setBounds(490, 484, 194, 14);
        lblTMB.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblGastoCalorico = new JLabel("Gasto calórico:");
        lblGastoCalorico.setBounds(494, 520, 190, 14);
        lblGastoCalorico.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblCampoResultadoTMB = new JLabel("");
        lblCampoResultadoTMB.setBounds(708, 480, 168, 22);
        lblCampoResultadoTMB.setBackground(new Color(0, 128, 192));

        JLabel lblCampoResultadoGC = new JLabel("");
        lblCampoResultadoGC.setBounds(708, 516, 152, 22);
        lblCampoResultadoGC.setBackground(new Color(0, 128, 192));
        
        JLabel lblCampoResultadoIMC = new JLabel("");
        lblCampoResultadoIMC.setBounds(708, 449, 168, 22);
        lblCampoResultadoIMC.setBackground(new Color(0, 128, 192));
        contentPane.setLayout(null);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 // Verifica se todos os campos estão preenchidos
                if (altura != 0 && peso != 0 && idade != 0 && rdbtnMasculino.isSelected() || rdbtnFeminino.isSelected() && (rdbtnSedentario.isSelected() || rdbtnModerado.isSelected() || rdbtnAtivo.isSelected())) {
                    if (rdbtnMasculino.isSelected()) {
                        if (rdbtnSedentario.isSelected()) {
                            usuario.CalculoHomem(altura, peso, idade, ENivelDeAtividadeFisica.SEDENTARIO.getFator());
                        } else if (rdbtnModerado.isSelected()) {
                            usuario.CalculoHomem(altura, peso, idade, ENivelDeAtividadeFisica.MODERADAMENTE_ATIVO.getFator());
                        } else if (rdbtnAtivo.isSelected()) {
                            usuario.CalculoHomem(altura, peso, idade, ENivelDeAtividadeFisica.EXTREMAMENTE_ATIVO.getFator());
                        }
                    } else if (rdbtnFeminino.isSelected()) {
                        if (rdbtnSedentario.isSelected()) {
                            usuario.CalculoMulher(altura, peso, idade, ENivelDeAtividadeFisica.SEDENTARIO.getFator());
                        } else if (rdbtnModerado.isSelected()) {
                            usuario.CalculoMulher(altura, peso, idade, ENivelDeAtividadeFisica.MODERADAMENTE_ATIVO.getFator());
                        } else if (rdbtnAtivo.isSelected()) {
                            usuario.CalculoMulher(altura, peso, idade, ENivelDeAtividadeFisica.EXTREMAMENTE_ATIVO.getFator());
                        }
                    }
                    lblCampoResultadoGC.setText(df.format(usuario.getGC()) + " Kcal");
                    lblCampoResultadoTMB.setText(df.format(usuario.getTMB()) + " Kcal");

                    if (usuario.getIMCres() == EResultadoIMC.ABAIXO_PESO) {
                        lblCampoResultadoIMC.setText(df.format(usuario.getIMC()) + "  (Abaixo do peso ideal)");
                    } else if (usuario.getIMCres() == EResultadoIMC.PESO_IDEAL) {
                        lblCampoResultadoIMC.setText(df.format(usuario.getIMC()) + "  (Peso ideal)");
                    } else if (usuario.getIMCres() == EResultadoIMC.SOBRE_PESO) {
                        lblCampoResultadoIMC.setText(df.format(usuario.getIMC()) + "  (Sobrepeso)");
                    } else if (usuario.getIMCres() == EResultadoIMC.OBESIDADE) {
                        lblCampoResultadoIMC.setText(df.format(usuario.getIMC()) + "  (Obesidade)");
                    }
                } else {
                    // Exibe uma mensagem de erro se algum campo estiver vazio
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de calcular!");
                }
        	}
        });
        
        JLabel lblBtnHome = new JLabel("");
        lblBtnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblBtnHome.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		  TelaHome th = new TelaHome();
                  th.setVisible(true);
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
        btnNewButton.setBounds(1308, 11, 48, 40);
        contentPane.add(btnNewButton);
        lblBtnHome.setBounds(303, 600, 58, 61);
        contentPane.add(lblBtnHome);
        btnCalcular.setToolTipText("");
        btnCalcular.setBackground(new Color(169, 169, 169));
        btnCalcular.setBounds(860, 614, 194, 47);
        contentPane.add(btnCalcular);
        contentPane.add(lblNewLabel);
        contentPane.add(rdbtnMasculino);
        contentPane.add(rdbtnFeminino);
        contentPane.add(lblIdade);
        contentPane.add(spinnerIdade);
        contentPane.add(lblAltura);
        contentPane.add(spinnerAltura);
        contentPane.add(lblTituloResultado);
        contentPane.add(lblNewLabel_3);
        contentPane.add(rdbtnSedentario);
        contentPane.add(lblPeso);
        contentPane.add(spinnerPeso);
        contentPane.add(rdbtnModerado);
        contentPane.add(rdbtnAtivo);
        contentPane.add(lblGastoCalorico);
        contentPane.add(lblCampoResultadoGC);
        contentPane.add(lblTMB);
        contentPane.add(lblCampoResultadoTMB);
        contentPane.add(lblCampoResultadoIMC);
        contentPane.add(lblIMC);
       
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\berna\\OneDrive\\Área de Trabalho\\A3\\2.png"));
        lblNewLabel_1.setBounds(0, 0, 1366, 768);
        contentPane.add(lblNewLabel_1);
    }
}
