package com.huntermalm.math.apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Point;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Frame1 {

	private JFrame frmCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmCalculator.setLocationRelativeTo(null);
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setType(Type.UTILITY);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setResizable(false);
		frmCalculator.setBounds(100, 100, 330, 522);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JTextArea txtrTest = new JTextArea();
		txtrTest.setBounds(10, 29, 304, 101);
		frmCalculator.getContentPane().add(txtrTest);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "7");
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		btnNewButton.setBounds(10, 208, 68, 56);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "8");
			}
		});
		button.setBackground(Color.WHITE);
		button.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button.setBounds(88, 208, 68, 56);
		frmCalculator.getContentPane().add(button);
		
		JButton button_1 = new JButton("9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "9");
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_1.setBounds(166, 208, 68, 56);
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "-");
			}
		});
		button_2.setBackground(Color.WHITE);
		button_2.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_2.setBounds(246, 208, 68, 56);
		frmCalculator.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "4");
			}
		});
		button_3.setBackground(Color.WHITE);
		button_3.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_3.setBounds(10, 275, 68, 56);
		frmCalculator.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("*");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "*");
			}
		});
		button_4.setBackground(Color.WHITE);
		button_4.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_4.setBounds(246, 275, 68, 56);
		frmCalculator.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "6");
			}
		});
		button_5.setBackground(Color.WHITE);
		button_5.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_5.setBounds(166, 275, 68, 56);
		frmCalculator.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "5");
			}
		});
		button_6.setBackground(Color.WHITE);
		button_6.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_6.setBounds(88, 275, 68, 56);
		frmCalculator.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "1");
			}
		});
		button_7.setBackground(Color.WHITE);
		button_7.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_7.setBounds(10, 342, 68, 56);
		frmCalculator.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("/");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "/");
			}
		});
		button_8.setBackground(Color.WHITE);
		button_8.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_8.setBounds(246, 342, 68, 56);
		frmCalculator.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "3");
			}
		});
		button_9.setBackground(Color.WHITE);
		button_9.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_9.setBounds(166, 342, 68, 56);
		frmCalculator.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "2");
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_10.setBounds(88, 342, 68, 56);
		frmCalculator.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "0");
			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_11.setBounds(10, 409, 68, 56);
		frmCalculator.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result;
				
				
				txtrTest.setText(txtrTest.getText() + "\n");
				
			}
		});
		button_12.setBackground(Color.WHITE);
		button_12.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_12.setBounds(166, 409, 148, 56);
		frmCalculator.getContentPane().add(button_12);
		
		JButton button_14 = new JButton(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + ".");
			}
		});
		button_14.setBackground(Color.WHITE);
		button_14.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_14.setBounds(88, 409, 68, 56);
		frmCalculator.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("<-");
		button_15.setBackground(Color.WHITE);
		button_15.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_15.setBounds(88, 141, 68, 56);
		frmCalculator.getContentPane().add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.WHITE);
		btnC.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		btnC.setBounds(166, 141, 68, 56);
		frmCalculator.getContentPane().add(btnC);
		
		JButton button_17 = new JButton("+");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrTest.setText(txtrTest.getText() + "+");
			}
		});
		button_17.setBackground(Color.WHITE);
		button_17.setFont(new Font("Myriad Pro", Font.PLAIN, 32));
		button_17.setBounds(246, 141, 68, 56);
		frmCalculator.getContentPane().add(button_17);
		
	}
}
