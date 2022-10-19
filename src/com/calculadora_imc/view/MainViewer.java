package com.calculadora_imc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class MainViewer {

	private JFrame appFrame;
	private JTextField pesotextField;
	private JTextField alturatextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.appFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		appFrame = new JFrame();
		appFrame.setAlwaysOnTop(true);
		appFrame.setTitle("CALCULADORA IMC");
		appFrame.setBounds(100, 100, 300, 400);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA IMC");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 264, 32);
		appFrame.getContentPane().add(lblNewLabel);
		
		JLabel pesoLabel = new JLabel("Peso");
		pesoLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pesoLabel.setBounds(10, 66, 46, 14);
		appFrame.getContentPane().add(pesoLabel);
		
		pesotextField = new JTextField();
		pesotextField.setText("0.0");
		pesotextField.setHorizontalAlignment(SwingConstants.CENTER);
		pesotextField.setBounds(74, 60, 136, 30);
		appFrame.getContentPane().add(pesotextField);
		pesotextField.setColumns(10);
		
		JLabel alturaLabel_1 = new JLabel("Altura");
		alturaLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		alturaLabel_1.setBounds(10, 116, 46, 14);
		appFrame.getContentPane().add(alturaLabel_1);
		
		alturatextField = new JTextField();
		alturatextField.setHorizontalAlignment(SwingConstants.CENTER);
		alturatextField.setText("0.0");
		alturatextField.setColumns(10);
		alturatextField.setBounds(74, 110, 136, 30);
		appFrame.getContentPane().add(alturatextField);
		
		JButton calcularButton = new JButton("CALCULAR");
		calcularButton.setBounds(20, 151, 227, 38);
		appFrame.getContentPane().add(calcularButton);
		
		JTextPane resultPane = new JTextPane();
		resultPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		resultPane.setText("Resultado");
		resultPane.setBounds(19, 200, 228, 88);
		appFrame.getContentPane().add(resultPane);
	}
}
