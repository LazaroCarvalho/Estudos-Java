package br.com.fpoo;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;	// Uma interface que "ouve", ou seja, espera o botão ser pressionado
import java.awt.event.ActionEvent;	//

public class Janela3 extends JFrame implements ActionListener{
	JButton btnMensagem1 = new JButton("Mensagem1");
	JButton btnMensagem2 = new JButton("Mensagem2");
	JButton btnSair = new JButton("Sair");
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == btnMensagem1) {
			JOptionPane.showMessageDialog(null, "Tratando eventos de botao");
		}
		else if (e.getSource() == btnMensagem2) {
			JOptionPane.showMessageDialog(null, "Segundo evento");
		}
		else {
			JOptionPane.showMessageDialog(null, "Saindo...");
			System.exit(0);
		}
	}
	
	public Janela3 () {
		
		btnMensagem1.addActionListener(this);
		btnMensagem2.addActionListener(this);
		btnSair.addActionListener(this);
		
		// Adicionando botões ao Frame.
		// Configurando as dimensões e posição dos botões
		setLayout(null);
		btnMensagem2.setBounds(75, 285, 100, 30);
		add(btnMensagem2);
		btnMensagem1.setBounds(200, 285, 100, 30);
		add(btnMensagem1);
		btnSair.setBounds(325, 285, 100, 30);
		add(btnSair);
		
		// Configurando o JFrame.
		setTitle("Registro de conta de usuário");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Janela3();
	}
	
}
