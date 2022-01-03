package shah;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Advice extends JFrame {

	private JPanel contentPane;


	public Advice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel advice = new JLabel("Advice");
		advice.setFont(new Font("Bahnschrift", Font.PLAIN, 60));
		advice.setBounds(296, 24, 220, 74);
		contentPane.add(advice);
		
		JTextPane txtpnMakeSureYou = new JTextPane();
		txtpnMakeSureYou.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		txtpnMakeSureYou.setText("Make sure you drink plenty of water and get as much rest as possible. Try to stay quarantined within one room of your house if you live with other people. If any symptoms begin to get more serious or if you remain sick for more than 2 weeks, don't hesitate to seek medical help from a professional.");
		txtpnMakeSureYou.setBounds(165, 180, 488, 171);
		contentPane.add(txtpnMakeSureYou);
		
		JButton close = new JButton("Close");
		close.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		close.setBounds(640, 518, 89, 23);
		contentPane.add(close);
		
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
			}

	});
		
		JButton main = new JButton("Main Menu");
		main.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		main.setBounds(490, 518, 89, 23);
		contentPane.add(main);
		
		main.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Covid door = new Covid();
				door.setVisible(true);
				setVisible(false);
			}

	});
	}
}
