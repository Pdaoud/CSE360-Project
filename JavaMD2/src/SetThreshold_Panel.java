import java.awt.BorderLayout;
import java.awt.Choice;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SetThreshold_Panel extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public SetThreshold_Panel() {
		setLayout(null);
		
		JLabel lblSetthreshold = new JLabel("Set Threshold");
		lblSetthreshold.setFont(new Font("Marion", Font.PLAIN, 26));
		lblSetthreshold.setHorizontalAlignment(SwingConstants.CENTER);
		lblSetthreshold.setBounds(147, 0, 154, 28);
		add(lblSetthreshold);
		
		String[] options = {null,"Highest Priority","High Priority","Medium Priority","Low Priority","Lowest Priority"};
		
		JComboBox comboBox = new JComboBox(options);
		comboBox.setBounds(158, 99, 146, 28);
		add(comboBox);
		
		JLabel lblMinimumAmout = new JLabel("Minimum amout:");
		lblMinimumAmout.setBounds(158, 76, 146, 16);
		add(lblMinimumAmout);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() != null){
					JOptionPane.showMessageDialog(null, "Threshold submited correctly!");
					setVisible(false);
					MDGui.intializeDoctor();
				}else{
					JOptionPane.showMessageDialog(null, "Did not fill out form correctly\nPlease double" 
							+ " check your answers and resubmit");
				}
			}
		});
		btnSubmit.setBounds(170, 192, 117, 29);
		add(btnSubmit);
	}
}
