package br.com.fpoo;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.text.DecimalFormat;

public class ConsultarImc extends JFrame implements ActionListener{
	// Objeto DecimalFormat
	DecimalFormat formatar = new DecimalFormat("#00.00");
	
	// OBJETOS Button
	JButton btnCalcularImc = new JButton("Calcular o IMC");
	JButton btnSair = new JButton("SAIR");
	
	// Objetos JLabel
	JLabel lblTitulo = new JLabel("CALCULADORA IMC");
	JLabel lblPeso = new JLabel("Peso:");
	JLabel lblAltura = new JLabel("Altura:");
	
	// Objetos JTextTextField
	JTextField txtPeso = new JTextField();
	JTextField txtAltura = new JTextField();
	
	// Objetos Font
	Font fontes = new Font("Arial", Font.BOLD, 20);
	
	// Constructor
	public ConsultarImc() {
		// setLayout
		setLayout(null);
		
		// Adicionando os eventos aos Botões
		btnCalcularImc.addActionListener(this);
		btnSair.addActionListener(this);
		
		// Interface Gráfica
		setTitle("Calculadora de IMC");
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// Botões
		btnCalcularImc.setBounds(250, 350, 130, 40); // Dimensionando Botões
		btnSair.setBounds(420, 350, 130, 40);
		add(btnCalcularImc); // Adicionando os botões
		add(btnSair);
		
		// Labels
		lblTitulo.setBounds(315, 5, 200, 200);	// Dimensionando Label
		lblTitulo.setFont(fontes);
		lblTitulo.setForeground(Color.RED);
		add(lblTitulo);	// Adicionando Label
		
		lblPeso.setBounds(270, 150, 80, 80);
		lblPeso.setForeground(Color.BLUE);
		add(lblPeso);
		
		lblAltura.setBounds(267, 210, 80, 80);
		lblAltura.setForeground(Color.BLUE);
		add(lblAltura);
		
		// Text Fields
		txtPeso.setBounds(310, 177, 200, 25);
		add(txtPeso);
		
		txtAltura.setBounds(309, 240, 201, 25);
		add(txtAltura);
	}
	
	// Método main.
	public static void main(String[] args) {
		new ConsultarImc();
	}
	
	// Método da Interface ActionListener
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCalcularImc) {	// Se o botão clicado for o Calcular Imc, executa-se este if.
			if (!(txtPeso.getText().trim().equals("") || txtAltura.getText().trim().equals(""))) {	// Verificando se o campo digitado está vazio ou espaçado.
				double peso = Double.parseDouble(txtPeso.getText().trim());	// Armazenando os valores do peso e da altura em variáveis.
				double altura = Double.parseDouble(txtAltura.getText().trim());
				CalculoImc imc = new CalculoImc(peso, altura);	
				
				JOptionPane.showMessageDialog(null, "IMC: " + formatar.format(imc.calculoImc()) + "\nEstado: " + imc.classificacaoImc());
			}
		}
		else {	// Se os valores digitados nos campos forem espaços ou estiverem vazios, este ELSE é executado.
			JOptionPane.showMessageDialog(null, "Saindo...");
			System.exit(0);
		}
	}
	
}
