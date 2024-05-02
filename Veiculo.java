package model;

public class Veiculo {
	
	
	protected String Marca;
	protected String Modelo;
	
	public Veiculo(String Marca, String Modelo) {
		this.Marca = Marca;
		this.Modelo = Modelo;
	}
	
	public void setMarca(String Marca) { 
		this.Marca = Marca;
	}
	
	public String getMarca() { 
		return Marca;
	}
	
	public void setModelo(String Modelo) { 
		this.Modelo = Modelo;
	}
	
	public String getModelo() { 
		return Modelo;
	}
}
