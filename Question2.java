package shah;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Color;

public class Question2 extends JFrame {

	private JPanel contentPane;
	private int total;

	public Question2(int current) {
		total += current;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel vaccine = new JLabel("Have you been feeling sick?");
		vaccine.setFont(new Font("Bahnschrift", Font.PLAIN, 40));
		vaccine.setBounds(137, 11, 711, 105);
		contentPane.add(vaccine);
		
		JButton yes1 = new JButton("Yes");
		yes1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		yes1.setBounds(115, 243, 176, 71);
		contentPane.add(yes1);
		
		yes1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				total += 5;
				Question4 door = new Question4(total);
				door.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton no1 = new JButton("No");
		no1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		no1.setBounds(489, 243, 176, 71);
		contentPane.add(no1);
		
		no1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			Question3 door = new Question3(total);
			door.setVisible(true);
			setVisible(false);
		}
	});
	}
}
