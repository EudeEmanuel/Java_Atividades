package JeffMath.aulaForm;

import javax.swing.*;


import piriri.pororo.controllers.ClienteController;

public class CalcularSoma extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	JLabel lblN1, lblN2, lblAnswer, lblTitulo;
	 // JLabel serve para exibir textos na interface
	
	JTextField txtNumber1, txtNumber2, txtResult;
	 // JTextField cria campos de texto de uma linha
	
	JButton btnSomar, btnSair;
	 // JButton cria botões clicáveis


//Construtor da classe (executa quando a tela é criada)
public CalcularSoma() {

  // Define o título da janela
  setTitle("Calculadora Feliz :)");
  
  // Define o tamanho da janela (largura, altura)
  setSize(500, 400);
  
  //Centraliza a janela no meio da tela
  setLocationRelativeTo(null);
  
  //Define que o programa encerra ao fechar a janela
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  // Define layout nulo (permite posicionar componentes manualmente)
  setLayout(null);
  
  
//Cria o componente de texto
  lblTitulo = new JLabel("Calculadora Feliz");

  // Define a posição e tamanho do componente
  // (x, y, largura, altura)
  lblTitulo.setBounds(170, 10, 200, 30);

  // Adiciona o componente à janela
  add(lblTitulo);

  //Cria o rótulo "Valor"
  lblN1 = new JLabel("1° Valor: ");

  // Define posição do rótulo
  lblN1.setBounds(30, 50, 100, 25);

  // Adiciona na janela
  add(lblN1);

  // Cria o campo de texto para digitar o nome
  txtNumber1 = new JTextField();

  // Define posição do campo
  txtNumber1.setBounds(130, 50, 250, 25);

  // Adiciona o campo na tela
  add(txtNumber1);
  
//Cria o rótulo "Valor"
  lblN2 = new JLabel("2° Valor: ");

  // Define posição do rótulo
  lblN2.setBounds(30, 100, 100, 25);

  // Adiciona na janela
  add(lblN2);

  // Cria o campo de texto para digitar o nome
  txtNumber2 = new JTextField();

  // Define posição do campo
  txtNumber2.setBounds(130, 100, 250, 25);

  // Adiciona o campo na tela
  add(txtNumber2);
  
  
  lblAnswer = new JLabel ("Resultado: ");
  
  lblAnswer.setBounds(30, 150, 100, 25);
  
  add(lblAnswer);
  
  // Cria o campo de Resultado
  txtResult = new JTextField();
  
  // Define posição no Campo
  txtResult.setBounds(130, 150, 250, 25);
  
  // Adiciona o campo na tela
  add(txtResult);

  
  //Cria botão Somar
  btnSomar = new JButton("Somar");

  // Define posição
  btnSomar.setBounds(80, 320, 100, 30);

  // Adiciona na tela
  add(btnSomar);
  
//Cria botão sair
  btnSair = new JButton("Sair");

  // Define posição
  btnSair.setBounds(320, 320, 100, 30);

  // Adiciona na tela
  add(btnSair);
  
//Instanciando o controller
ClienteController controller = new ClienteController(
        txtNumber1,
        txtNumber2
);

// Associando os eventos aos botões
btnSomar.addActionListener(controller.acaoSomar());
btnSair.addActionListener(controller.acaoSair());
}




//Método principal que inicia o programa
public static void main(String[] args) {

  // Cria um objeto da tela
  CalcularSoma tela = new CalcularSoma();

  // Torna a janela visível
  tela.setVisible(true);
}
}