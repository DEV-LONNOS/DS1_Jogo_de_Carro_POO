
public class Carro_de_Corrida extends Carro {
	//Declaração de atributos
	 int grid;
	 String marca;
	 String modelo;
	 int ano;
	 String tipo;
	 
	
	 //Construtor
	 public Carro_de_Corrida(String marca, String modelo, int ano, String tipo, int grid) {
		 super(marca, modelo, ano, tipo);

		this.grid = grid;
		
	}
}
