public class Main {
    public static void main(String[] args) {
        
        //Classe Mamíferos
        Mamifero m1 = new Mamifero();
        m1.nome = "Cavalo";
        m1.idade = 15;
        m1.sexo = 'M';
        m1.temPelos = true;
        
        System.out.println("Dados do Mamífero");
        System.out.println("Nome: " + m1.nome);
        System.out.println("Idade: " + m1.idade);
        m1.amamentar();
        
        System.out.println("\n---------------\n");
        
        //Classe Bovinos
        Bovino boi = new Bovino();
        boi.nome = "Belinha";    
        boi.sexo = 'F';          
        boi.raca = "Holandesa"; 
        boi.peso = 650.8;      
        boi.producao = "Leite";
        
        System.out.println("DADOS DO BOVINO");
        System.out.println("Nome: " + boi.nome);
        System.out.println("Raça: " + boi.raca);
        System.out.println("Peso: " + boi.peso + "kg");
        System.out.println("Produção: " + boi.producao);
        
        boi.amamentar();
        boi.pastar();    
        
    } 
}