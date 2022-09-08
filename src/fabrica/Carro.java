package fabrica;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Carro {

	//Atributos da classe
	private String fabricante;
	private String modelo;
	private String Placa;
	private String Cor;
	private String Ano;
	
	
	// METODO PARA GRAVAR NO ARQUIVO
	public String salvar() {
		
		try {
			FileWriter fw = new FileWriter("cadastro.csv", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("fabricante  " +this.fabricante);
			pw.println("modelo  " +this.modelo);
			pw.println("Placa  " +this.Placa);
			pw.println("Cor  " +this.Cor);
			pw.println("Ano  " +this.Ano);
			pw.flush();
			pw.close();
			fw.close();
			
		
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return "Carro Cadastrado!" ;
	}
	


	// METODOS GETTERS E SETTERS
	public String getFabricante() {
		return fabricante;
	}



	public void setFabricante(String fabricante) {
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



	public void setPlaca(String Placa) {
		this.Placa = Placa;
	}



	public String getCor() {
		return Cor;
	}



	public void setCor(String Cor) {
		this.Cor = Cor;
	}



	public String getAno() {
		return Ano;
	}



	public void setAno(String ano) {
		Ano = ano;
	}

	
	
	
}
