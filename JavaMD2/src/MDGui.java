import java.awt.EventQueue;
import javax.swing.JFrame;

public class MDGui {

	private static JFrame frame;
	public static Database db;
	public static Person user;

	/*
	 * private Connection conn = null; PreparedStatement pst = null; ResultSet
	 * rs = null;
	 * 
	 * private void formWindowOpened(java.awt.event.WindowEvent event){ conn =
	 * MySQLConnect.ConnectDb(); }
	 */
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					db = new Database();
					if(db.getConnection()){
						System.out.println("Database is connected");
					}
					MDGui window = new MDGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MDGui() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initializeLogin();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void initializeLogin() {
		frame.add(new Login_Panel());
	}

	public static void intializePatient() {
		frame.add(new Patient_Panel());
	}

	public static void intializeDoctor() {
		frame.add(new Doctor_Panel());
	}

	public static void intializePatientCreateForm() {
		frame.add(new CreateForm_Panel());
	}

	public static void intializeDoctorSetThreshold() {
		frame.add(new SetThreshold_Panel());
	}

	public static void intializeExistingFormPatient() {
		frame.add(new ExistingFormPatient_Panel());
	}

	public static void intializeDoctorDiagonse() {
		frame.add(new Diagnose_Panel());

	}

	public static void intializeExistingFormDoctor() {
		frame.add(new ExistingFormDoctor_Panel());

	}
	public static void initializeResetPassword(){
		frame.add(new ResetPassword_Panel());
	}

	public static void initializePassResetForm() {
		frame.add(new ResetPassword_Panel());
		
	}

	public static void initializeRegisterForm() {
		frame.add(new RegisterPatient());
		
	}
}
