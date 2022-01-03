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

public class End3 extends JFrame {

	private JPanel contentPane;


	public End3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Testing Strongly Recommended");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 50));
		lblNewLabel.setBounds(46, 42, 737, 61);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnYourResultsDid = new JTextPane();
		txtpnYourResultsDid.setEditable(false);
		txtpnYourResultsDid.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		txtpnYourResultsDid.setText("You should get officially tested, and quarantine until you stop feeling symptoms. If you test positive, reach out to people you have come into close contact recently and inform them. If your symptoms worsen to chest pain, trouble breathing, or fogginess/confusion, don't hesitate to seek emergency medical care.");
		txtpnYourResultsDid.setBounds(123, 168, 533, 170);
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
		
		JLabel lblNewLabel_1 = new JLabel("Click here to receive advice to help deal with your symptoms");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(34, 469, 414, 36);
		contentPane.add(lblNewLabel_1);
		
		JButton advice = new JButton("Advice");
		advice.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		advice.setBounds(110, 516, 89, 23);
		contentPane.add(advice);
		advice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Advice door = new Advice();
				door.setVisible(true);
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


