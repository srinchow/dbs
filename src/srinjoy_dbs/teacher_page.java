package srinjoy_dbs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class teacher_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacher_page frame = new teacher_page();
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
	public teacher_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton r1 = new JRadioButton("val1");
		r1.setBounds(21, 90, 141, 23);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("val2");
		r2.setBounds(21, 125, 141, 23);
		contentPane.add(r2);
		
		JButton submit = new JButton("submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//submit solve
			}
		});
		submit.setBounds(58, 200, 117, 29);
		contentPane.add(submit);
		
		JLabel lblTeacherPage = new JLabel("teacher page ");
		lblTeacherPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacherPage.setBounds(86, 22, 217, 35);
		contentPane.add(lblTeacherPage);
		
		JLabel lblStudentOptionsFor = new JLabel("student options for doubt clearing");
		lblStudentOptionsFor.setBounds(21, 57, 252, 29);
		contentPane.add(lblStudentOptionsFor);
	}

}
