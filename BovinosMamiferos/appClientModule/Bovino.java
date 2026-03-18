
public class Bovino extends Mamifero {
	//Atributos específicos dos Bovinos
	public String raca; //Raça especifica do Bovino
	public double peso; // Numeros decimais, para peso
	public boolean temChifres; 
	public String producao; //Se produz Carne ou Leite
	
	public void pastar() {
		System.out.println("O bovino da raça" + raca + "está pastando!");
	}

}
