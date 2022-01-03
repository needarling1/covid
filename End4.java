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

public class End4 extends JFrame {

	private JPanel contentPane;


	public End4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seek Emergency Medical Care Immediately");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 35));
		lblNewLabel.setBounds(62, 66, 731, 61);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnYourResultsDid = new JTextPane();
		txtpnYourResultsDid.setEditable(false);
		txtpnYourResultsDid.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		txtpnYourResultsDid.setText("You are displaying severe and possibly life threatening symptoms. Please seek emergency medical care to avoid any serious consequences.");
		txtpnYourResultsDid.setBounds(174, 218, 464, 94);
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


