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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Question1 extends JFrame {

	private JPanel contentPane;
	private int total;
	private ButtonGroup buttons = new ButtonGroup();


	public Question1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel vaccine = new JLabel("What is your vaccination status?");
		vaccine.setFont(new Font("Bahnschrift", Font.PLAIN, 40));
		vaccine.setBounds(104, 21, 711, 105);
		contentPane.add(vaccine);
		
		JRadioButton vaccineCheck0 = new JRadioButton("Not Vaccinated");
		vaccineCheck0.setVerticalAlignment(SwingConstants.TOP);
		vaccineCheck0.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		vaccineCheck0.setBounds(117, 148, 153, 23);
		contentPane.add(vaccineCheck0);
		buttons.add(vaccineCheck0);
		
		JRadioButton vaccineCheck1 = new JRadioButton("1st Vaccine");
		vaccineCheck1.setVerticalAlignment(SwingConstants.TOP);
		vaccineCheck1.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		vaccineCheck1.setBounds(117, 202, 153, 23);
		contentPane.add(vaccineCheck1);
		buttons.add(vaccineCheck1);
		
		JRadioButton vaccineCheck2 = new JRadioButton("2nd Vaccine");
		vaccineCheck2.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		vaccineCheck2.setBounds(117, 255, 153, 23);
		contentPane.add(vaccineCheck2);
		buttons.add(vaccineCheck2);
		
		JRadioButton vaccineCheck3 = new JRadioButton("Booster Shot");
		vaccineCheck3.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		vaccineCheck3.setBounds(117, 310, 166, 23);
		contentPane.add(vaccineCheck3);
		buttons.add(vaccineCheck3);
		
		JButton continu = new JButton("Click to continue");
		continu.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		continu.setBounds(292, 449, 240, 47);
		getContentPane().add(continu);
			
		JLabel plsSelect = new JLabel("Please select an option.");
		plsSelect.setForeground(Color.RED);
		plsSelect.setBackground(Color.RED);
		plsSelect.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		plsSelect.setBounds(341, 508, 206, 23);
		plsSelect.setVisible(false);
		contentPane.add(plsSelect);
		
		continu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(!vaccineCheck0.isSelected() && !vaccineCheck1.isSelected() && !vaccineCheck2.isSelected() && !vaccineCheck3.isSelected())
				{
					plsSelect.setVisible(true);
				}
				else
				{
				if(vaccineCheck0.isSelected())
					total += 3;
				else if(vaccineCheck1.isSelected())
					total += 2;
				else if (vaccineCheck2.isSelected())
					total += 1;
				else
					total += 0;
				
				Question2 door = new Question2(total);
				door.setVisible(true);
				setVisible(false);
				}
			}
		});
	}
}
