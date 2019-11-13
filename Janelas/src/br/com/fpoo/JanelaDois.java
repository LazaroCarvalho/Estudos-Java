package br.com.fpoo;

import javax.swing.JFrame;
import javax.swing.JButton;

public class JanelaDois extends JFrame{
	
	JButton btnAvancar = new JButton("Avançar");
	JButton btnSair = new JButton("Sair");
	
	public JanelaDois() {
		// Botão [JButton]
		setLayout(null);
		// [x, y, comprimento, altura]
		btnAvancar.setBounds(75, 285, 100, 30);
		btnSair.setBounds(325, 285, 100, 30);
		// Adicionar botão ao frame
		getContentPane().add(btnAvancar);
		add(btnSair);
		
		// JFrame
		setTitle("Segunda Janela");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaDois();
	}
}
