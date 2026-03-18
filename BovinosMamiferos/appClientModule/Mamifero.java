
public class Mamifero {
	// Atributos de todos os Mamíferos
	public String nome; //Variável para texto
	public int idade; //Variável para numeros inteiros
	public char sexo; // 'M' para Macho, 'F' para fêmea
	public boolean temPelos; //Variável "Sim/Não"
	
	//O que todos os Mamíferos fazem
	public void amamentar() {
		if (this.sexo == 'F'){
		System.out.println(nome + " está amamentando seus filhotes");
		} else {
		System.out.println(nome + " é macho, portanto não amamenta.");
		}
	}	
}
