package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.awt.Cursor;

public class TelaHome extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private final JPanel panel = new JPanel();

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
        setUndecorated(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1366, 768);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        panel.setBackground(new Color(250, 250, 250));
        panel.setBounds(0, 0, 1366, 768);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblLinkedin = new JLabel("LinkedIn");
        lblLinkedin.setBounds(951, 589, 80, 30);
        panel.add(lblLinkedin);
        lblLinkedin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/bernardo-soledade/"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblLinkedin.setForeground(Color.DARK_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblLinkedin.setForeground(SystemColor.textHighlight);
            }
        });
        lblLinkedin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLinkedin.setForeground(SystemColor.textHighlight);
        lblLinkedin.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel lblGitHUB = new JLabel("GitHub");
        lblGitHUB.setBounds(878, 589, 80, 30);
        panel.add(lblGitHUB);
        lblGitHUB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://github.com/Bernardosc1"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblGitHUB.setForeground(Color.DARK_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblGitHUB.setForeground(SystemColor.textHighlight);
            }
        });
        lblGitHUB.setHorizontalAlignment(SwingConstants.CENTER);
        lblGitHUB.setFont(new Font("Arial", Font.PLAIN, 14));
        lblGitHUB.setForeground(SystemColor.textHighlight);

        JButton btnNewButton = new JButton("X");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnNewButton.setBackground(new Color(255, 69, 0));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBounds(1308, 11, 48, 40);
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton.setFocusPainted(false);
        panel.add(btnNewButton);
        
        JLabel lblBtnCalculadora = new JLabel("");
        lblBtnCalculadora.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblBtnCalculadora.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		 TelaCalculadora tc = new TelaCalculadora();
                 tc.setVisible(true);
                 dispose();
        	}
        });
        lblBtnCalculadora.setBounds(753, 107, 400, 53);
        panel.add(lblBtnCalculadora);
        
        JLabel lblBtnInformacoes = new JLabel("");
        lblBtnInformacoes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblBtnInformacoes.setBounds(753, 215, 400, 53);
        panel.add(lblBtnInformacoes);
        lblBtnInformacoes.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		TelaInformacoes ti = new TelaInformacoes();
        		ti.setVisible(true);
        		dispose();
        	}
        });
        
        JLabel lblBtnEstrategias = new JLabel("");
        lblBtnEstrategias.setBounds(753, 321, 400, 53);
        panel.add(lblBtnEstrategias);
        
        
        JLabel lblBtnSobre = new JLabel("");
        lblBtnSobre.setBounds(753, 428, 400, 53);
        panel.add(lblBtnSobre);
        
        JLabel lblNewLabel_1 = new JLabel("");
        
         lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\berna\\OneDrive\\Área de Trabalho\\A3\\1.png"));
         lblNewLabel_1.setBounds(0, 0, 1366, 768);
         panel.add(lblNewLabel_1);
    }
}