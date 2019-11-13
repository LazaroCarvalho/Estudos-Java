package br.com.fpoo;

import javax.swing.JFrame;

public class Janela extends JFrame { 
		public Janela() {
			// Título da janela
			setTitle("Primeira janela");
			// Tamanho da janela (largura, altura)
			setSize(1000,800);
			// Centralizar a janela
			setLocationRelativeTo(null);
			// Visibilidade da janela (True or false)
			setVisible(true);
			// Impedir que a janela seja maximizada
			setResizable(false);
			// Para fechar a janela corretamente
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public static void main(String[] args) {
			new Janela();
		}
}
