package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tarefa.Fabrica;
import tarefa.Veiculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class CadastroVeiculo extends JFrame {

	private JPanel contentPane;
	private JTextField textFabricante;
	private JTextField textModelo;
	private JTextField textPlaca;
	private JTextField textCor;
	private JTextField textAno;

	Fabrica cv = new Fabrica();
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVeiculo frame = new CadastroVeiculo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroVeiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFabricante = new JLabel("fabricante");
		lblFabricante.setBounds(32, 32, 74, 14);
		contentPane.add(lblFabricante);
		
		JLabel lblModelo = new JLabel("modelo");
		lblModelo.setBounds(32, 87, 86, 14);
		contentPane.add(lblModelo);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(32, 136, 86, 14);
		contentPane.add(lblPlaca);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(32, 188, 86, 14);
		contentPane.add(lblCor);
		
		textFabricante = new JTextField();
		textFabricante.setBounds(116, 29, 86, 20);
		contentPane.add(textFabricante);
		textFabricante.setColumns(10);
		
		textModelo = new JTextField();
		textModelo.setBounds(116, 84, 86, 20);
		contentPane.add(textModelo);
		textModelo.setColumns(10);
		
		textPlaca = new JTextField();
		textPlaca.setBounds(116, 133, 86, 20);
		contentPane.add(textPlaca);
		textPlaca.setColumns(10);
		
		textCor = new JTextField();
		textCor.setBounds(116, 185, 86, 20);
		contentPane.add(textCor);
		textCor.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(32, 255, 46, 14);
		contentPane.add(lblAno);
		
		textAno = new JTextField();
		textAno.setBounds(116, 252, 86, 20);
		contentPane.add(textAno);
		textAno.setColumns(10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(242, 313, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fabrica carro = new Fabrica();
				carro.setFabricante(textFabricante.getText());
				carro.setModelo(textModelo.getText());
				carro.setPlaca(textPlaca.getText());
				carro.setCor(textCor.getText());
				carro.setAno(textAno.getText());
				JOptionPane.showMessageDialog(null , carro.salvar());
				System.out.println(carro);
				
					
				textFabricante.setText("");
				textModelo.setText("");
				textPlaca.setText("");
				textCor.setText("");
				textAno.setText("");
				textFabricante.requestFocus();
					
				
				
						
			
				
			}
			
		});
		
		btnSalvar.setBounds(116, 313, 89, 23);
		contentPane.add(btnSalvar);
	}
}
