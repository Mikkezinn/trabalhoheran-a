package model;

public class Moto extends Veiculo{
	
	protected int Cilindrada; 
	
	public Moto(String Marca, String Modelo, int Cilindrada) {
		super(Marca, Modelo); 
		this.Cilindrada = Cilindrada;
	}
	
	public void setCilindrada(int Cilindrada) { 
		this.Cilindrada = Cilindrada;
	}
	
	public int getCilindrada() { 
		return Cilindrada;
	}
}
