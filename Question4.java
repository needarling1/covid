package shah;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class Question4 extends JFrame {

	private JPanel contentPane;
	private JCheckBox fevercheckbox;
	private JCheckBox chillscheckbox;
	private JCheckBox shortcheckbox;
	private JCheckBox fatiguecheckbox;
	private JCheckBox musclecheckbox;
	private JCheckBox headachecheckbox;
	private JCheckBox tastecheckbox;
	private JCheckBox smellcheckbox;
	private JCheckBox throatcheckbox;
	private JCheckBox congestioncheckbox;
	private JCheckBox nauseacheckbox;
	private JCheckBox diarrheacheckbox;
	private JCheckBox trouble;
	private JCheckBox chestPain;
	private JCheckBox confusion;
	private JCheckBox sleep;
	private JCheckBox paleSkin;
	private int points;

	

	public Question4(int current) {
		points += current;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 809, 616);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        fevercheckbox = new JCheckBox("Fever");
        fevercheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        fevercheckbox.setBounds(128, 178, 128, 23);
        contentPane.add(fevercheckbox);
        
        chillscheckbox = new JCheckBox("Chills");
        chillscheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        chillscheckbox.setBounds(128, 203, 128, 23);
        contentPane.add(chillscheckbox);
        
        shortcheckbox = new JCheckBox("Shortness of breath");
        shortcheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        shortcheckbox.setBounds(128, 228, 164, 23);
        contentPane.add(shortcheckbox);
        
        fatiguecheckbox = new JCheckBox("Fatigue");
        fatiguecheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        fatiguecheckbox.setBounds(128, 254, 128, 23);
        contentPane.add(fatiguecheckbox);
        
        musclecheckbox = new JCheckBox("Muscle/Body Aches");
        musclecheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        musclecheckbox.setBounds(128, 279, 164, 23);
        contentPane.add(musclecheckbox);
        
        headachecheckbox = new JCheckBox("Headache");
        headachecheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        headachecheckbox.setBounds(128, 302, 128, 23);
        contentPane.add(headachecheckbox);
        
        tastecheckbox = new JCheckBox("Loss of Taste");
        tastecheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        tastecheckbox.setBounds(449, 178, 128, 23);
        contentPane.add(tastecheckbox);
        
        smellcheckbox = new JCheckBox("Loss of Smell");
        smellcheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        smellcheckbox.setBounds(449, 203, 128, 23);
        contentPane.add(smellcheckbox);
        
        throatcheckbox = new JCheckBox("Sore Throat");
        throatcheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        throatcheckbox.setBounds(449, 228, 128, 23);
        contentPane.add(throatcheckbox);
        
        congestioncheckbox = new JCheckBox("Congestion or runny nose");
        congestioncheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        congestioncheckbox.setBounds(449, 254, 238, 23);
        contentPane.add(congestioncheckbox);
        
        nauseacheckbox = new JCheckBox("Nausea");
        nauseacheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        nauseacheckbox.setBounds(449, 279, 128, 23);
        contentPane.add(nauseacheckbox);
        
        diarrheacheckbox = new JCheckBox("Diarrhea");
        diarrheacheckbox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        diarrheacheckbox.setBounds(449, 302, 128, 23);
        contentPane.add(diarrheacheckbox);
        
        JLabel selcttext = new JLabel();
        selcttext.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
        selcttext.setText("Please check off the symptoms you are experiencing: ");
        selcttext.setBounds(96, 33, 635, 60);
        contentPane.add(selcttext);
        
        JButton continu = new JButton("Click to continue");
		continu.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		continu.setBounds(271, 453, 240, 47);
		getContentPane().add(continu);
		
		trouble = new JCheckBox("Trouble Breathing");
		trouble.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		trouble.setBounds(128, 343, 164, 23);
		contentPane.add(trouble);
		
		chestPain = new JCheckBox("Chest Pain");
		chestPain.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		chestPain.setBounds(128, 369, 164, 23);
		contentPane.add(chestPain);
		
		confusion = new JCheckBox("Confusion");
		confusion.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		confusion.setBounds(128, 395, 97, 23);
		contentPane.add(confusion);
		
		sleep = new JCheckBox("Trouble Staying Awake");
		sleep.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		sleep.setBounds(449, 343, 199, 23);
		contentPane.add(sleep);
		
		paleSkin = new JCheckBox("Pale/Blue Skin Tone");
		paleSkin.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		paleSkin.setBounds(449, 369, 164, 23);
		contentPane.add(paleSkin);
		
		continu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				calculatePoints();
				Question3 door = new Question3(points);
				door.setVisible(true);
				setVisible(false);
			}
		});
		
		
       
	}
	
	private void calculatePoints()
    {
        if (fevercheckbox.isSelected())
            points += 1;
        else if (chillscheckbox.isSelected())
            points += 1;
        else if (shortcheckbox.isSelected())
            points += 1;
        else if (fatiguecheckbox.isSelected())
            points += 1;
        else if (musclecheckbox.isSelected())
            points += 1;
        else if (headachecheckbox.isSelected())
            points += 1;
        else if (tastecheckbox.isSelected())
            points += 1;
        else if (smellcheckbox.isSelected())
            points += 1;
        else if (throatcheckbox.isSelected())
            points += 1;
        else if (congestioncheckbox.isSelected())
            points += 1;
        else if (nauseacheckbox.isSelected())
            points += 1;
        else if (diarrheacheckbox.isSelected())
            points += 1;
        else if (trouble.isSelected() || chestPain.isSelected() || confusion.isSelected() || sleep.isSelected() || paleSkin.isSelected())
        	points += 500;
    }
}
