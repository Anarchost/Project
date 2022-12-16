package calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class bmiCalc 
{	
		static JTextField heightField;
		static JTextField weightField;
		static JTextField bmiField;
		static JFrame frame;
		
		public static void main(String[] args)
		{
			frame = new JFrame("BMI Calculator");
			
			JLabel heightLabel = new JLabel("Height: ");
			JLabel weightLabel = new JLabel("Weight: ");
			JLabel bmiLabel = new JLabel("BMI: ");
			
			heightField = new JTextField(5);
			weightField = new JTextField(5);
			bmiField = new JTextField(5);
			bmiField.setEditable(false);
			
			JButton bmiButton = new JButton("Go!");
			bmiButton.addActionListener((e) -> calculate());
			
			JPanel panel = new JPanel();
			panel.add(heightLabel);
			panel.add(heightField);
			panel.add(weightLabel);
			panel.add(weightField);
			panel.add(bmiLabel);
			panel.add(bmiField);
			panel.add(bmiButton);
			
			frame.add(panel);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(420, 80);
			frame.setVisible(true);
			frame.setResizable(false);
		}
		
		public static void calculate()
		{
			int height = 0;
			int weight = 0;
			
			try
			{
				height = Integer.parseInt(heightField.getText());
				weight = Integer.parseInt(weightField.getText());
			}
			catch(NumberFormatException nfe)
			{
				heightField.setText("");
				weightField.setText("");
				JOptionPane.showMessageDialog(frame, "Illegal input", 
						"Input Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			
			double bmi = weight / ((height / 100.0) * (height / 100.0));
			String bmiStr = String.format("%.2f", bmi);
			bmiField.setText(bmiStr);
			
			String message;
			if(bmi < 18.5)
			{
				message = "You are underweight!";
			}
			else if(bmi >= 18.5 && bmi < 25)
			{
				message = "You are healthy!";
			}
			else if(bmi >= 25 && bmi < 30)
			{
				message = "You are overweight";
			}
			else
			{
				message = "You are obese!";
			}
			
			if(bmi > 30)
			{
				bmiField.setBackground(Color.RED);
			}
			
			JOptionPane.showMessageDialog(frame, message);
	}
}
