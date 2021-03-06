import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CreateForm_Panel extends JPanel {
	private Form f1;
	/**
	 * Create the panel.
	 */
	public CreateForm_Panel() {
		setLayout(null);
		
		JLabel lblCreateForm = new JLabel("Create Form");
		lblCreateForm.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		lblCreateForm.setBounds(153, 0, 170, 32);
		add(lblCreateForm);
		
		JLabel lblS = new JLabel("S1");
		lblS.setBounds(20, 50, 61, 16);
		add(lblS);
		
		JLabel lblS_1 = new JLabel("S2");
		lblS_1.setBounds(258, 50, 23, 16);
		add(lblS_1);
		
		JLabel lblS_2 = new JLabel("S3");
		lblS_2.setBounds(20, 98, 61, 16);
		add(lblS_2);
		
		JLabel lblS_3 = new JLabel("S4");
		lblS_3.setBounds(258, 98, 23, 16);
		add(lblS_3);
		
		JLabel lblS_4 = new JLabel("S5");
		lblS_4.setBounds(20, 140, 61, 16);
		add(lblS_4);
		
		JLabel lblAdditionalComments = new JLabel("Additional Comments:");
		lblAdditionalComments.setBounds(20, 175, 176, 16);
		add(lblAdditionalComments);
		
		JEditorPane dtrpnPatientscommit = new JEditorPane();
		dtrpnPatientscommit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dtrpnPatientscommit.setText(null);
			}
		});
		dtrpnPatientscommit.setText("PatientsCommit");
		dtrpnPatientscommit.setBounds(20, 191, 270, 91);
		add(dtrpnPatientscommit);
		
		String[] scaleOfPain = {null,"1","2","3","4","5","6","7","8","9","10"};
		
		JComboBox comboBox1 = new JComboBox(scaleOfPain);
		comboBox1.setBounds(123, 50, 123, 25);
		add(comboBox1);
		
		JComboBox comboBox2 = new JComboBox(scaleOfPain);
		comboBox2.setBounds(327, 50, 120, 25);
		add(comboBox2);
		
		JComboBox comboBox3 = new JComboBox(scaleOfPain);
		comboBox3.setBounds(123, 94, 123, 25);
		add(comboBox3);
		
		JComboBox comboBox4 = new JComboBox(scaleOfPain);
		comboBox4.setBounds(327, 94, 120, 32);
		add(comboBox4);
		
		JComboBox comboBox5 = new JComboBox(scaleOfPain);
		comboBox5.setBounds(123, 136, 123, 27);
		add(comboBox5);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(filledOut() != true){
					JOptionPane.showMessageDialog(null, "Did not fill out form correctly\nPlease double" 
							+ " check your answers and resubmit");
				}else{
					JOptionPane.showMessageDialog(null, "Form submited correctly!\n"
							+ "Priority Level: " + comboToInt() );
					// create form here
					//f1 = new Form(comboBox1.getSelectedItem().toString(), comboBox1.getSelectedItem().toString(),comboBox1.getSelectedItem().toString(),comboBox1.getSelectedItem().toString(),comboBox1.getSelectedItem().toString());
					
					setVisible(false);
					MDGui.intializePatient();
				}
			}
			private int comboToInt(){
				int sum = 0;
				sum += Integer.parseInt(comboBox1.getSelectedItem().toString());
				sum += Integer.parseInt(comboBox2.getSelectedItem().toString());
				sum += Integer.parseInt(comboBox3.getSelectedItem().toString());
				sum += Integer.parseInt(comboBox4.getSelectedItem().toString());
				sum += Integer.parseInt(comboBox5.getSelectedItem().toString());
				return sum;
			}
			private boolean filledOut(){
				if(comboBox1.getSelectedItem() == null || comboBox2.getSelectedItem() == null
						|| comboBox3.getSelectedItem() == null || comboBox4.getSelectedItem() == null 
						|| comboBox5.getSelectedItem() == null){
					return false;
				}else{
					return true;
				}
			}
		});
		btnSubmit.setBounds(302, 253, 117, 29);
		add(btnSubmit);
	
	}
	
}
