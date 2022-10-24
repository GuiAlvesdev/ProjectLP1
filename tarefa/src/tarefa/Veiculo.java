package tarefa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Veiculo {

	private String fabricante;
	private String modelo;
	private String Placa;
	private String Cor;
	private String Ano;
	
	
	//construct
		public Veiculo(String fabricante, String modelo, String placa, String cor, String ano) {
			super();
			this.fabricante = fabricante;
			this.modelo = modelo;
			Placa = placa;
			Cor = cor;
			Ano = ano;
		}
	
	
	public Veiculo() {
		
	}


	
	public String salvar() {
		
		try {
			FileWriter fw = new FileWriter("cadastro.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("fabricante  " +this.fabricante);
			pw.flush();
			pw.close();
			fw.close();
			
		
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return "Carro Cadastrado!" ;
	}
	
	
	
	
	
	
	
	//getters and setters
	public String getFabricante() {
		return fabricante;
	}
	public  void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getAno() {
		return Ano;
	}
	public void setAno(String ano) {
		Ano = ano;
	}
	


//	@Override
//	public String toString() {
//		return "Carro [fabricante=" + fabricante + ", modelo=" + modelo + ", Placa=" + Placa + ", Cor=" + Cor + ", Ano="
//				+ Ano + "]";
//	}
	
	
	
	
	
	

}
