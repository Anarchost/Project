package calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JTextField;



import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class Calc 
{
	protected static final String Calcwindow = null;
	protected static final int WindowConstants = 0;
	private JFrame frame;
	private JTextField textField;
	
	double intI;
	double intII;
	double total;
	
	String action;
	String answer;

	/**
	 * Spustenie apky
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Vytvorenie apky
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Programovanie tlacidiel framov atd...
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField.setBounds(10, 34, 464, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(10, 95, 70, 40);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(10, 146, 70, 40);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(10, 197, 70, 40);
		frame.getContentPane().add(btn3);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(90, 146, 70, 40);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(90, 95, 70, 40);
		frame.getContentPane().add(btn4);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(90, 197, 70, 40);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(167, 95, 70, 40);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(167, 146, 70, 40);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(167, 197, 70, 40);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(90, 248, 70, 40);
		frame.getContentPane().add(btn0);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				intI = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "+";
			}
		});
		btnAdd.setBounds(260, 95, 70, 40);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				intI = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "-";
			}
		});
		btnSub.setBounds(260, 146, 70, 40);
		frame.getContentPane().add(btnSub);
		
		JButton btnTim = new JButton("*");
		btnTim.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				intI = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "*";
			}
		});
		btnTim.setBounds(260, 197, 70, 40);
		frame.getContentPane().add(btnTim);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				intI = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "/";
			}
		});
		btnDiv.setBounds(260, 248, 70, 40);
		frame.getContentPane().add(btnDiv);
		
		JButton btnEql = new JButton("=");
		btnEql.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				intII = Double.parseDouble(textField.getText());
				if(action == "+")
				{
					total = intI + intII;
					answer = String.format("%.1f + %.1f = %.2f", intI, intII, total);
					textField.setText(answer);
				}
				else if (action == "-")
				{
					total = intI - intII;
					answer = String.format("%.1f - %.1f = %.2f", intI, intII, total);
					textField.setText(answer);
				}
				else if (action == "*")
				{
					total = intI * intII;
					answer = String.format("%.1f * %.1f = %.2f", intI, intII, total);
					textField.setText(answer);
				}
				else if (action == "/")
				{
					total = intI / intII;
					answer = String.format("%.1f / %.1f = %.2f", intI, intII, total);
					textField.setText(answer);
				}
			}
		});
		btnEql.setBounds(260, 297, 70, 40);
		frame.getContentPane().add(btnEql);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setBounds(167, 248, 70, 40);
		frame.getContentPane().add(btnDot);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
			}
		});
		btnC.setBounds(352, 95, 105, 40);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String bcks = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bcks = str.toString();
					textField.setText(bcks);
				}
			}
		});
		btnB.setBounds(352, 146, 105, 40);
		frame.getContentPane().add(btnB);
		
		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar (menubar);
		
		JMenu file = new JMenu("File");
		menubar.add(file);
		JMenuItem bmi = new JMenuItem("BMI Calculator");
		bmi.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bmiCalc.main(null);
				frame.setVisible(false);
			}
		});
		file.add(bmi);
		
		JMenu help = new JMenu("Help");
		menubar.add(help);
		JMenuItem about = new JMenuItem("About");
		help.add(about);
		
	}
}