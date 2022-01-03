package shah;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class End2 extends JFrame {

	private JPanel contentPane;


	public End2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Optional Testing");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 55));
		lblNewLabel.setBounds(188, 64, 701, 61);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnYourResultsDid = new JTextPane();
		txtpnYourResultsDid.setEditable(false);
		txtpnYourResultsDid.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		txtpnYourResultsDid.setText("If you begin feeling any symptoms in the next 10 days, you should get officially tested. Otherwise, please wear a mask in public indoor settings for the safety of others.");
		txtpnYourResultsDid.setBounds(174, 218, 464, 118);
		contentPane.add(txtpnYourResultsDid);
		
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
