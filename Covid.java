package shah;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextPane;

public class Covid extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Covid frame = new Covid();
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
	public Covid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 616);
		getContentPane().setLayout(null);
		
		JLabel titleL = new JLabel("Covid Diagnostic");
		titleL.setFont(new Font("Bahnschrift", Font.PLAIN, 71));
		titleL.setBounds(133, 38, 596, 110);
		getContentPane().add(titleL);
		
		JTextPane description = new JTextPane();
		description.setEditable(false);
		description.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		description.setText("Welcome to a covid-19 diagnostics test. You will be asked a series of questions and it will determine whether or not you should be officially tested.");
		description.setBounds(171, 215, 461, 91);
		getContentPane().add(description);
		
		JButton begin = new JButton("Click to continue");
		begin.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		begin.setBounds(292, 449, 240, 47);
		getContentPane().add(begin);
		
		begin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Question1 door = new Question1();
				door.setVisible(true);
				setVisible(false);
			}
		});
		}
	}

