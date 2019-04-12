package srinjoy_dbs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(49, 41, 82, 23);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(49, 145, 61, 16);
		contentPane.add(lblPassword);
		
		JRadioButton rdbtnStudent = new JRadioButton("student");
		rdbtnStudent.setBounds(236, 40, 141, 23);
		contentPane.add(rdbtnStudent);
		
		JRadioButton rdbtnTeacher = new JRadioButton("teacher");
		rdbtnTeacher.setBounds(236, 92, 141, 23);
		contentPane.add(rdbtnTeacher);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//login code
			}
			
		});
		btnLogin.setBounds(236, 179, 117, 29);
		contentPane.add(btnLogin);
		
		username = new JTextField();
		username.setBounds(29, 76, 130, 26);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(29, 182, 130, 26);
		contentPane.add(password);
		password.setColumns(10);
	}
}
