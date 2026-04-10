import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = null;
        Professor professor = null;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU DO SISTEMA ---");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Exibir Aluno");
            System.out.println("4 - Exibir Professor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    aluno = new Aluno();
                    System.out.print("Nome do Aluno: ");
                    aluno.setNome(leitor.nextLine());
                    System.out.print("Idade: ");
                    aluno.setIdade(leitor.nextInt());
                    leitor.nextLine(); 
                    System.out.print("Matrícula: ");
                    aluno.setMatricula(leitor.nextLine());
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    professor = new Professor();
                    System.out.print("Nome do Professor: ");
                    professor.setNome(leitor.nextLine());
                    System.out.print("Idade: ");
                    professor.setIdade(leitor.nextInt());
                    leitor.nextLine();
                    System.out.print("Disciplina: ");
                    professor.setDisciplina(leitor.nextLine());
                    System.out.print("E-mail: ");
                    professor.setEmail(leitor.nextLine());
                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                case 3:
                    if (aluno != null) {
                        System.out.println("\n--- DADOS DO ALUNO ---");
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("Idade: " + aluno.getIdade());
                        System.out.println("Matrícula: " + aluno.getMatricula());
                    } else {
                        System.out.println("Nenhum aluno cadastrado.");
                    }
                    break;

                case 4:
                    if (professor != null) {
                        System.out.println("\n--- DADOS DO PROFESSOR ---");
                        System.out.println("Nome: " + professor.getNome());
                        System.out.println("Idade: " + professor.getIdade());
                        System.out.println("Disciplina: " + professor.getDisciplina());
                        System.out.println("E-mail: " + professor.getEmail());
                    } else {
                        System.out.println("Nenhum professor cadastrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}