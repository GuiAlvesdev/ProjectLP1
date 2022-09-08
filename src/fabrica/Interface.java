package fabrica;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.JEditorPane;
import java.awt.Panel;
import java.awt.Canvas;
import javax.swing.ImageIcon;


public class Interface {

	private JFrame frame;
	private JTextField textFabricante;
	private JTextField textModelo;
	private JTextField textPlaca;
	private JTextField textCor;
	private JTextField textAno;

	/**
	 * Launch the application.
	 * 
	 *
	 */
	

	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\guilh\\Downloads\\carro-esporte.png"));
		frame.setBounds(100, 100, 751, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFabricante = new JLabel("Fabricante");
		lblFabricante.setBounds(33, 220, 83, 24);
		frame.getContentPane().add(lblFabricante);
		
		
		
		JButton btnAdicionarCarro = new JButton("Cadastrar");
		btnAdicionarCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Carro cadastro = new Carro();
				cadastro.setFabricante(textFabricante.getText()); 
				cadastro.setModelo(textModelo.getText()); 
				cadastro.setPlaca(textPlaca.getText()); 
				cadastro.setCor(textCor.getText());
				cadastro.setAno(textAno.getText());
				
				JOptionPane.showMessageDialog(null , cadastro.salvar());
				
				textFabricante.setText("");
				textModelo.setText("");
				textPlaca.setText("");
				textCor.setText("");
				textAno.setText("");
				
				
			}
		});
		
		
		btnAdicionarCarro.setBounds(309, 429, 107, 23);
		frame.getContentPane().add(btnAdicionarCarro);
		
		
		
		textFabricante = new JTextField();
		textFabricante.setBounds(126, 222, 193, 20);
		frame.getContentPane().add(textFabricante);
		textFabricante.setColumns(10);
		
		
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(393, 225, 78, 14);
		frame.getContentPane().add(lblModelo);
		
		
		
		textModelo = new JTextField();
		textModelo.setBounds(481, 222, 109, 20);
		frame.getContentPane().add(textModelo);
		textModelo.setColumns(10);
		
		
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlaca.setBounds(33, 284, 83, 14);
		frame.getContentPane().add(lblPlaca);
		
		
		
		textPlaca = new JTextField();
		textPlaca.setToolTipText("");
		textPlaca.setBounds(126, 281, 190, 20);
		frame.getContentPane().add(textPlaca);
		textPlaca.setColumns(10);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(393, 284, 78, 14);
		frame.getContentPane().add(lblCor);
		
		textCor = new JTextField();
		textCor.setBounds(481, 281, 109, 20);
		frame.getContentPane().add(textCor);
		textCor.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Carros");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel.setBounds(145, 11, 389, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel iconcar = new JLabel("");
		iconcar.setHorizontalAlignment(SwingConstants.CENTER);
		iconcar.setIcon(new ImageIcon("C:\\Users\\guilh\\Downloads\\carro.png"));
		iconcar.setBounds(232, 43, 253, 209);
		frame.getContentPane().add(iconcar);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(31, 355, 46, 14);
		frame.getContentPane().add(lblAno);
		
		textAno = new JTextField();
		textAno.setBounds(126, 352, 190, 20);
		frame.getContentPane().add(textAno);
		textAno.setColumns(10);
	}
}
