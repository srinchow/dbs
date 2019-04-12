package srinjoy_dbs;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
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
		setVisible(true);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(49, 41, 82, 23);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(49, 145, 61, 16);
		contentPane.add(lblPassword);
		
		JRadioButton r1 = new JRadioButton("student");
		r1.setBounds(236, 40, 141, 23);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("teacher");
		r2.setBounds(236, 92, 141, 23);
		contentPane.add(r2);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(r1);
		bgroup.add(r2);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//submit
				String reply = "";
				try 
				{
					//connection code
					
					String uname = username.getText();
					String pass = password.getText();
					if(uname.isEmpty() || pass.isEmpty())
					{
						reply = "Please enter both the details";
						return;
					}
					if(r2.isSelected())
					{
						String qry = "select count(*) as cnt from teacher_login where username = ? and password = ?";
						PreparedStatement stmt = con.prepareStatement(qry);
						stmt.setString(1, uname);
						stmt.setString(2, pass);
						ResultSet rs = stmt.executeQuery();
						int count = rs.getInt(1);
						
						if(count == 0)
						{
							reply = "wrong password or username";
							return;
						}
						else
						{
							dispose();
							new teacher_page();
							return;
						}
						
						
					}
					if(r1.isSelected())
					{
						String qry = "select count(*) as cnt from student_login where username = ? and password = ?";
						PreparedStatement stmt = con.prepareStatement(qry);
						stmt.setString(1, uname);
						stmt.setString(2, pass);
						ResultSet rs = stmt.executeQuery();
						int count = rs.getInt(1);
						
						if(count == 0)
						{
							reply = "wrong password or username";
							return;
						}
						else
						{
							dispose();
							new student_page();
							return;
						}
					}
					if(!r1.isSelected() && !r2.isSelected())
					{
						reply = "Choose one of them";
						return;
					}
					// need to create a table set the value of it before return
				}
				catch(Exception err)
				{
					reply = "database error";
				}
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
