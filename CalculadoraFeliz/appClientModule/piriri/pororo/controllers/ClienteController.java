package piriri.pororo.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ClienteController {
	
	private JTextField txtNumber1;
	private JTextField txtNumber2;
    private JTextField txtResult;


	public ClienteController(
	JTextField txtNumber1,
	JTextField txtNumber2
	) {
		
	this.txtNumber1 = txtNumber1;
    this.txtNumber2 = txtNumber2;
	}


	public ActionListener acaoSomar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int N1 = Integer.parseInt(txtNumber1.getText());
                int N2 = Integer.parseInt(txtNumber2.getText());
                int Resultado = N1 + N2;
                
                txtResult.setText(Integer.toString(Resultado));
            }
        };             
	}
	public ActionListener acaoSair() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
    }
}