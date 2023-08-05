
public class App {

	public static void main(String[] args) {
		App aplicacao = new App();
		Pessoa humano = new Pessoa("Zezinho", 40, "Operador de estoque");
		Piloto f1 = new Piloto("Juninho", 23, "Corredor");
		Carro car = new Carro("Chevrolet", "Onix", 2021, "Operacional");
		Carro_de_Corrida run = new Carro_de_Corrida("Ferrari","SF-23", 2023, "Corredor", 44);
		run.ligar();
		run.desligar();
		
	}

}
