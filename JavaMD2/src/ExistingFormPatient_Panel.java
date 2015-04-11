import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ExistingFormPatient_Panel extends JPanel {
	private Form f1;
	private Patient p1;
	/**
	 * Create the panel.
	 */
	public ExistingFormPatient_Panel() {
		setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(6, 72, 438, 129);
		add(editorPane);
		
		JButton btnPendingForms = new JButton("Pending Forms");
		btnPendingForms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editorPane.setText("List of Pending Forms");
			}
		});
		btnPendingForms.setBounds(24, 43, 155, 29);
		add(btnPendingForms);
		
		JButton btnCompletedForms = new JButton("Completed Forms");
		btnCompletedForms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editorPane.setText("List of Completed Forms");
			}
		});
		btnCompletedForms.setBounds(243, 43, 155, 29);
		add(btnCompletedForms);
		
		JLabel lblExisitingForms = new JLabel("Existing Forms");
		lblExisitingForms.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblExisitingForms.setHorizontalAlignment(SwingConstants.CENTER);
		lblExisitingForms.setBounds(78, 6, 285, 29);
		add(lblExisitingForms);
		
		JButton btnHomepage = new JButton("Back");
		btnHomepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MDGui.intializePatient();
			}
		});
		btnHomepage.setBounds(150, 210, 117, 29);
		add(btnHomepage);

	}
}
