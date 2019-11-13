// Classe que recebe um nome e uma idade por meio de uma interface gráfica. Depois, envia uma mensagem de boas-vindas.
package br.com.fpoo;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;	// Classe para estilização das fontes.
import java.awt.Color;	// Classe para inserir cores nas fontes.

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaSono extends JFrame implements ActionListener{
	
	// Objetos dos Botões
	JButton btnMensagem1 = new JButton("Mensagem 1");
	JButton btnMensagem2 = new JButton("Mensagem 2");
	JButton btnX = new JButton("X");
	
	// Objetos Label [ Rótulo ]
	JLabel lblNome = new JLabel("Nome");
	JLabel lblIdade = new JLabel("Idade");
	JLabel lblTitulo = new JLabel("Criando uma conta!");
	
	// Objetos TextFiel [Campos de texto]
	JTextField txtNome = new JTextField();
	JTextField txtIdade = new JTextField();
	
	// Objetos Font [Fonte dos textos]
	Font grande = new Font("Verdana", Font.BOLD, 25);
	
	/***** CONSTRUTOR *****/
	public JanelaSono () {

		btnMensagem1.addActionListener(this);
		btnMensagem2.addActionListener(this);
		btnX.addActionListener(this);
		
		// setLayout
		setLayout(null);
		
		// Labels
		lblNome.setBounds(150, 100, 100, 30);	// Dimensões e posições das Labels.
		lblIdade.setBounds(150, 140, 100, 30);
		lblTitulo.setBounds(115, 20, 300, 40);
		
		// Fontes/Cores das labels
		lblNome.setForeground(Color.BLUE);
		lblIdade.setForeground(Color.BLUE);
		lblTitulo.setFont(grande);
		lblTitulo.setForeground(Color.RED);
		
		add(lblNome);
		add(lblIdade);
		add(lblTitulo);
		
		// TextField
		txtNome.setBounds(200, 100, 100, 30);
		txtIdade.setBounds(200, 140, 100, 30);
		add(txtNome);
		add(txtIdade);
		
		// INTERFACE
		setTitle("Janela do Sono");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		// Botões
		btnMensagem1.setBounds(125, 285, 100, 30);
		add(btnMensagem1);
		btnMensagem2.setBounds(275, 285, 100, 30);
		add(btnMensagem2);
		btnX.setBounds(450, 0, 50, 30);
		add(btnX);
		
	}
	
	/***** MÉTODO DA INTERFACE ActionListener *****/
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == btnMensagem1) {
			String nome = txtNome.getText().trim();
			JOptionPane.showMessageDialog(null, "Boas vindas, " + nome);
		}
		else if (e.getSource() == btnMensagem2) {
			if (!(txtIdade.getText().trim().equals(""))) { // Se o campo preenchido pelo usuário for válido, este if se executará.
				int idade = Integer.parseInt(txtIdade.getText().trim());
				int anoNascimento = 2019 - idade;
				JOptionPane.showMessageDialog(null, txtIdade.getText() + ", Você nasceu em " + anoNascimento);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Saindo...");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new JanelaSono();
	}
}
