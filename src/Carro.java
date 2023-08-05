
public class Carro {
	//Declaracao dos atributos
	String marca;
	String modelo;
	int ano;
	String tipo;
	String velocidade;
	
	//Constructor
	public Carro(String marca, String modelo, int ano, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.tipo = tipo;
		
	}
	//Métodos
	public void ligar() {
		System.out.println("O carro está ligado!");
	}
	
	public void desligar() {
		System.out.println("O carro está desligado!");
	}


}
