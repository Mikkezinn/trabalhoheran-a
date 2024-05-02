package model;

public class Carro extends Veiculo {

	protected int numeroPortas; 
	
	public Carro(String Marca, String Modelo, int numeroPortas) {
		super(Marca, Modelo); 
		this.numeroPortas = numeroPortas;
	}
	
	public void setnumeroPortas(int numeroPortas) { 
		this.numeroPortas = numeroPortas;
	}
	
	public int getnumeroPortas() { 
		return numeroPortas;
	}
}
