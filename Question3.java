package shah;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class Question3 extends JFrame {

	private JPanel contentPane;
	private ButtonGroup buttons = new ButtonGroup();
	private int total;


	public Question3(int current) {
		total += current;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel vaccine = new JLabel("What is your level of exposure?");
		vaccine.setFont(new Font("Bahnschrift", Font.PLAIN, 40));
		vaccine.setBounds(111, 11, 711, 105);
		contentPane.add(vaccine);
		
		JRadioButton button1 = new JRadioButton("No contact/unsure");
		button1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		button1.setBounds(99, 140, 222, 23);
		contentPane.add(button1);
		buttons.add(button1);
		
		JRadioButton button2 = new JRadioButton("Exposure to someone who tested positive in the last 14 days with masks");
		button2.setBounds(98, 190, 613, 23);
		button2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		contentPane.add(button2);
		buttons.add(button2);
		
		JRadioButton button3 = new JRadioButton("Exposure to someone who tested positive in the last 14 days without masks");
		button3.setBounds(99, 249, 637, 23);
		button3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		contentPane.add(button3);
		buttons.add(button3);
		
		JRadioButton button4 = new JRadioButton("Close contact with someone who tested positive in the last 14 days");
		button4.setBounds(99, 299, 599, 23);
		button4.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		contentPane.add(button4);
		buttons.add(button4);
		
		JRadioButton button5 = new JRadioButton("Been coughed/sneezed on by someone who tested positive in the last 14 days");
		button5.setBounds(99, 353, 637, 23);
		button5.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		contentPane.add(button5);
		buttons.add(button5);
		
		JLabel plsSelect = new JLabel("Please select an option.");
		plsSelect.setForeground(Color.RED);
		plsSelect.setBackground(Color.RED);
		plsSelect.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		plsSelect.setBounds(341, 508, 206, 23);
		plsSelect.setVisible(false);
		contentPane.add(plsSelect);
		
		JButton continu = new JButton("Click to continue");
		continu.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		continu.setBounds(292, 449, 240, 47);
		getContentPane().add(continu);
		continu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(!button1.isSelected() && !button2.isSelected() && !button3.isSelected() && !button4.isSelected() && !button5.isSelected())
				{
					plsSelect.setVisible(true);
				}
				else
				{
				if(button5.isSelected())
					total += 5;
				else if(button4.isSelected())
					total += 4;
				else if(button3.isSelected())
					total += 3;
				else if(button2.isSelected())
					total += 2;
				else
					total += 0;
				
				if(total == 0)
				{
					End1 thing = new End1();
					thing.setVisible(true);
					setVisible(false);
				}
				else if (total >= 1 && total < 6)
				{
					End2 door = new End2();
					door.setVisible(true);
					setVisible(false);
				}
				else if (total >= 6 && total < 200)
				{
					End3 doorThing = new End3();
					doorThing.setVisible(true);
					setVisible(false);
				}
				else
				{
					End4 door1 = new End4();
					door1.setVisible(true);
					setVisible(false);
				}
			}
			}
		});
	}

}
