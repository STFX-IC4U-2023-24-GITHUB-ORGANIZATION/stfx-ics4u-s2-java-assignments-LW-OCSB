package sandbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class VersionControl {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VersionControl window = new VersionControl();
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
	public VersionControl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 276);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton nicholasPButton = new JButton("Nic. P.");
		nicholasPButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nicholasPButton.setBounds(30, 45, 89, 23);
		frame.getContentPane().add(nicholasPButton);
		
		JButton aydenButton = new JButton("Ayden");
		aydenButton.setBounds(30, 67, 89, 23);
		frame.getContentPane().add(aydenButton);
		
		JButton sageButton = new JButton("Sage");
		sageButton.setBounds(30, 89, 89, 23);
		frame.getContentPane().add(sageButton);
		
		JButton jordanButton = new JButton("Jordan");
		jordanButton.setBounds(30, 111, 89, 23);
		frame.getContentPane().add(jordanButton);
		
		JButton ayahButton = new JButton("Ayah");
		ayahButton.setBounds(121, 45, 89, 23);
		frame.getContentPane().add(ayahButton);
		
		JButton adamButton = new JButton("Adam");
		adamButton.setBounds(121, 67, 89, 23);
		frame.getContentPane().add(adamButton);
		
		JButton maryamButton = new JButton("Maryam");
		maryamButton.setBounds(121, 89, 89, 23);
		frame.getContentPane().add(maryamButton);
		
		JButton ilyasButton = new JButton("Ilyas");
		ilyasButton.setBounds(121, 111, 89, 23);
		frame.getContentPane().add(ilyasButton);
		
		JButton jihyeongButton = new JButton("Jihyeong");
		jihyeongButton.setBounds(213, 45, 89, 23);
		frame.getContentPane().add(jihyeongButton);
		
		JButton marcusButton = new JButton("Marcus");
		marcusButton.setBounds(213, 67, 89, 23);
		frame.getContentPane().add(marcusButton);
		
		JButton kevinButton = new JButton("Kevin");
		kevinButton.setBounds(213, 89, 89, 23);
		frame.getContentPane().add(kevinButton);
		
		JButton nicholasRButton = new JButton("Nic. R.");
		nicholasRButton.setBounds(213, 111, 89, 23);
		frame.getContentPane().add(nicholasRButton);
		
		JButton myriamButton = new JButton("Myriam");
		myriamButton.setBounds(305, 45, 89, 23);
		frame.getContentPane().add(myriamButton);
		
		JButton haydonButton = new JButton("Haydon");
		haydonButton.setBounds(305, 67, 89, 23);
		frame.getContentPane().add(haydonButton);
		
		JButton evanButton = new JButton("Evan");
		evanButton.setBounds(305, 89, 89, 23);
		frame.getContentPane().add(evanButton);
		
		JButton mrWongButton = new JButton("Mr. Wong");
		mrWongButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(VersionControlMethods.mrWongMethod());
			}
		});
		mrWongButton.setBounds(305, 111, 89, 23);
		frame.getContentPane().add(mrWongButton);
		
		JLabel lblNewLabel = new JLabel("ICS4U Large Project");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(137, 11, 165, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(121, 189, 181, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Message");
		lblNewLabel_1.setBounds(188, 170, 103, 19);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
