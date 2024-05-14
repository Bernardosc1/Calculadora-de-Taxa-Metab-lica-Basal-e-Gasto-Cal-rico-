package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

import Model.ENivelDeAtividadeFisica;
import Model.Usuario;

import javax.swing.event.ChangeEvent;

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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		ButtonGroup buttonGroupSexo = new ButtonGroup();
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");

		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");

		buttonGroupSexo.add(rdbtnMasculino);
		buttonGroupSexo.add(rdbtnFeminino);

		JLabel lblNewLabel = new JLabel("Sexo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));

		JSpinner spinnerIdade = new JSpinner();
		spinnerIdade.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				idade = (int) spinnerIdade.getValue();
			}
		});
		spinnerIdade.setToolTipText("Em anos");

		JLabel lblIdade = new JLabel("Idade: ");
		lblIdade.setToolTipText("Em anos");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 11));

		JSpinner spinnerAltura = new JSpinner();
		spinnerAltura.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				altura = (int) spinnerAltura.getValue();
			}
		});
		spinnerAltura.setToolTipText("Em cm\r\n");

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setToolTipText("Em cm");
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 11));

		ButtonGroup buttonGroupAtivFisica = new ButtonGroup();
		JRadioButton rdbtnSedentario = new JRadioButton("Sedentário");
		rdbtnSedentario.setToolTipText("0x (Por semana)");
		rdbtnSedentario.setHorizontalAlignment(SwingConstants.CENTER);

		JRadioButton rdbtnModerado = new JRadioButton("Moderado");
		rdbtnModerado.setToolTipText("3x - 5x (Por semana)");
		rdbtnModerado.setHorizontalAlignment(SwingConstants.CENTER);

		JRadioButton rdbtnAtivo = new JRadioButton("Ativo");
		rdbtnAtivo.setToolTipText("6x - 7x (Por semana)");
		rdbtnAtivo.setHorizontalAlignment(SwingConstants.CENTER);

		buttonGroupAtivFisica.add(rdbtnSedentario);
		buttonGroupAtivFisica.add(rdbtnModerado);
		buttonGroupAtivFisica.add(rdbtnAtivo);

		JLabel lblNewLabel_3 = new JLabel("Nível de atividade fisíca:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setToolTipText("Em kg");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 11));

		JSpinner spinnerPeso = new JSpinner();
		spinnerPeso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				peso = (int) spinnerPeso.getValue();
			}
		});
		spinnerPeso.setToolTipText("Em kg");

		JLabel lblTituloResultado = new JLabel("Resultado");
		lblTituloResultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTituloResultado.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblTMB = new JLabel("Taxa Metabólica Basal (TMB):");
		lblTMB.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblGastoCalrico = new JLabel("Gasto calórico:");
		lblGastoCalrico.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblCampoResultadoTMB = new JLabel("");
		lblCampoResultadoTMB.setBackground(new Color(0, 128, 192));

		JLabel lblCampoResultadoGC = new JLabel("");
		lblCampoResultadoGC.setBackground(new Color(0, 128, 192));

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setToolTipText("");
		btnCalcular.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (rdbtnMasculino.isSelected()) {
		            if (rdbtnSedentario.isSelected()) {
		                usuario.CalculoHomem(altura, peso, idade, ENivelDeAtividadeFisica.SEDENTARIO.getFator());
		                lblCampoResultadoGC.setText(df.format(usuario.getGC()) + " Kcal");
		                lblCampoResultadoTMB.setText(df.format(usuario.getTMB()) + " Kcal");

		            } else if (rdbtnModerado.isSelected()) {
		                usuario.CalculoHomem(altura, peso, idade, ENivelDeAtividadeFisica.MODERADAMENTE_ATIVO.getFator());
		                lblCampoResultadoGC.setText(df.format(usuario.getGC()) + " Kcal");
		                lblCampoResultadoTMB.setText(df.format(usuario.getTMB()) + " Kcal");
		            } else if (rdbtnAtivo.isSelected()) {
		                usuario.CalculoHomem(altura, peso, idade, ENivelDeAtividadeFisica.EXTREMAMENTE_ATIVO.getFator());
		                lblCampoResultadoGC.setText(df.format(usuario.getGC()) + " Kcal");
		                lblCampoResultadoTMB.setText(df.format(usuario.getTMB()) + " Kcal");

		            }
		        } else if(rdbtnFeminino.isSelected()){
		            if (rdbtnSedentario.isSelected()) {
		                usuario.CalculoMulher(altura, peso, idade, ENivelDeAtividadeFisica.SEDENTARIO.getFator());
		                lblCampoResultadoGC.setText(df.format(usuario.getGC()) + " Kcal");
		                lblCampoResultadoTMB.setText(df.format(usuario.getTMB()) + " Kcal");

		            } else if(rdbtnModerado.isSelected()) {
		                usuario.CalculoMulher(altura, peso, idade, ENivelDeAtividadeFisica.MODERADAMENTE_ATIVO.getFator());
		                lblCampoResultadoGC.setText(df.format(usuario.getGC()) + " Kcal");
		                lblCampoResultadoTMB.setText(df.format(usuario.getTMB()) + " Kcal");
		            } else if(rdbtnAtivo.isSelected()) {
		                usuario.CalculoMulher(altura, peso, idade, ENivelDeAtividadeFisica.EXTREMAMENTE_ATIVO.getFator());
		                lblCampoResultadoGC.setText(df.format(usuario.getGC()) + " Kcal");
		                lblCampoResultadoTMB.setText(df.format(usuario.getTMB()) + " Kcal");
		            }
		        }
		    }
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(198)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addComponent(rdbtnMasculino)
							.addGap(2)
							.addComponent(rdbtnFeminino))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(198)
							.addComponent(lblIdade)
							.addGap(18)
							.addComponent(spinnerIdade, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(198)
							.addComponent(lblAltura)
							.addGap(19)
							.addComponent(spinnerAltura, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(71)
							.addComponent(lblTituloResultado, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(105)
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addGap(11)
									.addComponent(rdbtnSedentario))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(198)
									.addComponent(lblPeso, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(spinnerPeso, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addGap(12)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCalcular)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnModerado, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addComponent(rdbtnAtivo))))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(194)
								.addComponent(lblGastoCalrico, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addGap(39)
								.addComponent(lblCampoResultadoGC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(142)
								.addComponent(lblTMB)
								.addGap(38)
								.addComponent(lblCampoResultadoTMB, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))))
					.addGap(59))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addComponent(rdbtnMasculino)
						.addComponent(rdbtnFeminino))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblIdade))
						.addComponent(spinnerIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAltura))
						.addComponent(spinnerAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(lblPeso))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(spinnerPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCalcular))))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_3))
						.addComponent(rdbtnSedentario)
						.addComponent(rdbtnModerado)
						.addComponent(rdbtnAtivo))
					.addGap(25)
					.addComponent(lblTituloResultado)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addComponent(lblTMB))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addComponent(lblCampoResultadoTMB, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(lblGastoCalrico))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(lblCampoResultadoGC, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
