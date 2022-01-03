package shah;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JButton;

public class End1 extends JFrame {

	private JPanel contentPane;


	public End1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You do not need to get tested");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 50));
		lblNewLabel.setBounds(69, 74, 701, 45);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnYourResultsDid = new JTextPane();
		txtpnYourResultsDid.setEditable(false);
		txtpnYourResultsDid.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		txtpnYourResultsDid.setText("Your results did not indicate any reason to get tested for covid-19. Stay safe.");
		txtpnYourResultsDid.setBounds(180, 232, 434, 63);
		contentPane.add(txtpnYourResultsDid);
		
		JButton close = new JButton("Close");
		close.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		close.setBounds(640, 518, 89, 23);
		contentPane.add(close);
		
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
		
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
			}

	});
}
}
