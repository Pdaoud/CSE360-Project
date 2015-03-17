import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;


public class JavaMDGui {

	private JFrame frmJavamd;
	private JTextField txtPassword;
	private JTextField txtUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaMDGui window = new JavaMDGui();
					window.frmJavamd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaMDGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavamd = new JFrame();
		frmJavamd.setTitle("JavaMD");
		frmJavamd.setBounds(100, 100, 450, 300);
		frmJavamd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavamd.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelLogin = new JPanel();
		frmJavamd.getContentPane().add(panelLogin, "name_31186421828104");
		panelLogin.setLayout(null);
		
		JRadioButton rdbtnDoctor = new JRadioButton("Doctor");
		rdbtnDoctor.setBounds(115, 72, 75, 23);
		panelLogin.add(rdbtnDoctor);
		
		JRadioButton rdbtnPatient = new JRadioButton("Patient");
		rdbtnPatient.setBounds(209, 72, 75, 23);
		panelLogin.add(rdbtnPatient);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setBounds(270, 148, 117, 29);
		panelLogin.add(btnLogin);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(134, 147, 134, 28);
		panelLogin.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setBounds(134, 107, 134, 28);
		panelLogin.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panelPatientMenu = new JPanel();
		frmJavamd.getContentPane().add(panelPatientMenu, "name_31385619939746");
		
		JPanel panelPatientCreateForm = new JPanel();
		frmJavamd.getContentPane().add(panelPatientCreateForm, "name_31828079017857");
		panelPatientCreateForm.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		
	
		
		
		
	}
}
