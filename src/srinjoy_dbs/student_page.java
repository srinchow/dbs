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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class student_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student_page frame = new student_page();
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
	public student_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentPage = new JLabel("student page");
		lblStudentPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentPage.setBounds(124, 19, 168, 23);
		contentPane.add(lblStudentPage);
		
		JRadioButton d1 = new JRadioButton("Day 1");
		d1.setBounds(37, 109, 141, 23);
		contentPane.add(d1);
		
		JRadioButton d2 = new JRadioButton("Day 2");
		d2.setBounds(37, 144, 141, 23);
		contentPane.add(d2);
		
		JRadioButton d3 = new JRadioButton("Day 3");
		d3.setBounds(37, 179, 141, 23);
		contentPane.add(d3);
		
		JRadioButton d4 = new JRadioButton("Day 4");
		d4.setBounds(37, 214, 141, 23);
		contentPane.add(d4);
		
		JRadioButton d5 = new JRadioButton("Day 5");
		d5.setBounds(37, 249, 141, 23);
		contentPane.add(d5);
		
		JButton submit = new JButton("submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//submit
			}
		});
		submit.setBounds(283, 213, 117, 29);
		contentPane.add(submit);
		
		JLabel lblDayOfBooking = new JLabel("Day of booking :-");
		lblDayOfBooking.setBounds(51, 73, 127, 16);
		contentPane.add(lblDayOfBooking);
	}

}
