// Classe que cria Janela com elementos gráficos

/********************************************************
 * Atividade Tela de Cadastro de Alunos                 *
 *                                                      *
 * # Criar JFrame, JLabel, JTextField, JComboBox,       *
 *         JRadioButton e JButtons                      *                                                   
 *                                                      *
 * # O Botão Cadastrar somente poderá funcionar se      *
 *   todos os campos estiverem preenchidos e algum sexo *
 *   selecionado;                                       *
 *                                                      *
 * # Se o JComboBox estiver marcado, campo "aapm" do    *
 *   banco de dados recebe "sim", caso contrário "não"; *
 *                                                      *
 * # Após um aluno ter sido cadrastrado, deve aparecer  *
 *   uma caixa de diálogo indicando o sucesso da        *
 *   operação, e todos os campos ficarem vazios.        * 
 *                                                      *
 * # A data de nascimento deverá ser composta pela      *
 *   concatenação dos campos dia, mês e ano utilizando  *
 *   o caracter barra [/] como separador.               *
 *                                                      *                                                      
 ********************************************************/

package org.com.db.janelas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.com.db.alunos.Aluno;
import org.com.db.dao.AlunoDAO;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class JanelaAluno extends JFrame implements ActionListener {

	// Criar objetos JLabels
	JLabel lblNome = new JLabel("Nome:");
	JLabel lblCurso = new JLabel("Curso");
	JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
	JLabel lblDia = new JLabel("Dia");
	JLabel lblMes = new JLabel("Mês");
	JLabel lblAno = new JLabel("Ano");

	// Criar objetos JText Fields
	JTextField txtNome = new JTextField();
	JTextField txtCurso = new JTextField();
	JTextField txtDia = new JTextField();
	JTextField txtMes = new JTextField();
	JTextField txtAno = new JTextField();

	// Criar objetos JButtons
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnSair = new JButton("Sair");

	// Criar objetos JCheckboxes
	JCheckBox cbxAapm = new JCheckBox("AAPM", false);

	// Criar objetos JRadioButton
	JRadioButton jrbMasculino = new JRadioButton("Masculino");
	JRadioButton jrbFeminino = new JRadioButton("Feminino");

	// Grupo para RadioButton [Necessário para relacionar os botões]
	ButtonGroup btgSexo = new ButtonGroup();

	public JanelaAluno() {

		// Anular o layout padrão
		setLayout(null);

		// Informar ao método ActionLinstener qual classe irá tratar os eventos de botão
		btnCadastrar.addActionListener(this);
		btnSair.addActionListener(this);

		// JLabel
		lblNome.setBounds(180, 10, 50, 50);
		lblCurso.setBounds(180, 50, 50, 50);
		lblDataDeNascimento.setBounds(180, 90, 115, 50);
		lblDia.setBounds(180, 130, 30, 50);
		lblMes.setBounds(240, 130, 30, 50);
		lblAno.setBounds(305, 130, 30, 50);
		add(lblNome);
		add(lblCurso);
		add(lblDataDeNascimento);
		add(lblDia);
		add(lblMes);
		add(lblAno);

		// JTextField
		txtNome.setBounds(225, 25, 150, 25);
		txtCurso.setBounds(225, 65, 150, 25);
		txtDia.setBounds(205, 146, 20, 20);
		txtMes.setBounds(270, 146, 20, 20);
		txtAno.setBounds(330, 146, 35, 20);
		add(txtNome);
		add(txtCurso);
		add(txtDia);
		add(txtMes);
		add(txtAno);

		// JButton
		btnCadastrar.setBounds(160, 250, 140, 30);
		btnSair.setBounds(310, 250, 140, 30);
		add(btnCadastrar);
		add(btnSair);

		// RadioButton
		jrbMasculino.setBounds(175, 180, 100, 20);
		jrbFeminino.setBounds(175, 200, 100, 20);
		add(jrbMasculino);
		add(jrbFeminino);

		// Adicionando RadioButton ao Grupo ButtonGroup
		btgSexo.add(jrbMasculino);
		btgSexo.add(jrbFeminino);

		// CheckBox
		cbxAapm.setBounds(380, 190, 100, 20);
		add(cbxAapm);

		// JFrame
		setTitle("Cadastro de Alunos");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCadastrar) {

			Aluno aluno = new Aluno();
			AlunoDAO banco = new AlunoDAO();

			String nome = txtNome.getText().trim();
			String curso = txtCurso.getText().trim();
			String dia = txtDia.getText().trim();
			String mes = txtMes.getText().trim();
			String ano = txtAno.getText().trim();
			boolean masculino = !(jrbFeminino.isSelected());
			boolean feminino = !(jrbMasculino.isSelected());

			if (!(nome.equals("") || curso.equals("") || dia.equals("") || mes.equals("") || ano.equals("")	//Verificando se algum dos campos digitados está vazio.
				|| masculino && feminino)) {
				aluno.setNome(txtNome.getText().trim());
				aluno.setCurso(txtCurso.getText().trim());

				String diaDoNascimento = txtDia.getText().trim();
				String mesDoNascimento = txtMes.getText().trim();
				String anoDoNascimento = txtAno.getText().trim();
				aluno.setDataDeNascimento(diaDoNascimento + "/" + mesDoNascimento + "/" + anoDoNascimento);

				if (cbxAapm.isSelected()) {
					aluno.setAapm("sim");
				} else {
					aluno.setAapm("não");
				}

				if (jrbFeminino.isSelected()) {
					aluno.setSexo("feminino");
				} else {
					aluno.setSexo("masculino");
				}

				banco.setAluno(aluno);

				// Método AlunoDAO.gravar() retorna "true" se dados gravados com sucesso.
				if (banco.gravar()) {
					txtNome.setText("");
					txtCurso.setText("");
					txtDia.setText("");
					txtMes.setText("");
					txtAno.setText("");
					cbxAapm.setSelected(false);
					jrbFeminino.setSelected(false);
					jrbMasculino.setSelected(false);

					JOptionPane.showMessageDialog(null, "Aluno cadastrado!");
				} else {
					JOptionPane.showMessageDialog(null, "Falha ao enviar dados para o banco!");
				}
			} else {	// Se algum campo estiver vazio, este else será executado

			}
		} else {
			JOptionPane.showMessageDialog(null, "Saindo...");
			System.exit(0);
		}
	}
}
