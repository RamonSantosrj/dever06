package helpers;

import java.util.Scanner;

import javax.swing.JOptionPane;

import interfaces.IValidation;
import validations.CampoObrigatorioValidation;
import validations.EspacoVazioValidetion;
import validations.IdentificadorValidation;
import validations.MaximoDeCaracteresValidation;
import validations.MinimoDeCaracteresValidation;

public class AlunoHelper {

	public static String lerNome() throws Exception {

		String nome = JOptionPane.showInputDialog("enter studant name:");
		
		 IValidation campoObrigatorioIValidation = new CampoObrigatorioValidation();
		
		if(!campoObrigatorioIValidation.isValid(nome)) 
			throw new IllegalArgumentException("Required field");
		
		IValidation maximoDeCaracteresValidation = new MaximoDeCaracteresValidation();
		if(!maximoDeCaracteresValidation.isValid(nome))
			throw new IllegalArgumentException("maximum characteres reached");
		
		IValidation minimoDeCaracteresIValidation = new MinimoDeCaracteresValidation();
		if(!minimoDeCaracteresIValidation.isValid(nome))
			throw new IllegalArgumentException("Minimum Characteres reached");
		
		return nome;
		
	}

	public static String lerMatricula() {
		
		String matricula  = JOptionPane.showInputDialog("Enter Studant enrollment:");
		
		matricula.trim();
		
		IValidation campoObrigatorioIValidation = new CampoObrigatorioValidation();
		if(!campoObrigatorioIValidation.isValid(matricula)) 
			throw new IllegalArgumentException("Requerid field");
		
		IValidation espacoVazioValidation = new EspacoVazioValidetion();
		if(!espacoVazioValidation.isValid(matricula))
			throw new IllegalArgumentException("cannot contain empty space");
		
		IValidation maximoDeCaracteresValidation = new MaximoDeCaracteresValidation();
		if(!maximoDeCaracteresValidation.isValid(matricula))
			throw new IllegalArgumentException("maximum characteres reached");
		
		IValidation minimoDeCaracteresIValidation = new MinimoDeCaracteresValidation();
		if(!minimoDeCaracteresIValidation.isValid(matricula))
			throw new IllegalArgumentException("Minimum Characteres reached");
				
				
		return matricula;

	}

	public static String lerCpf() {
		
		
String cpf  = JOptionPane.showInputDialog("Enter Studant cpf:");
		
		
		IValidation campoObrigatorioIValidation = new CampoObrigatorioValidation();
		if(!campoObrigatorioIValidation.isValid(cpf)) 
			throw new IllegalArgumentException("Requerid field");
		
		IValidation espacoVazioValidation = new EspacoVazioValidetion();
		if(!espacoVazioValidation.isValid(cpf))
			throw new IllegalArgumentException("cannot contain empty space");
		
		IValidation maximoDeCaracteresValidation = new MaximoDeCaracteresValidation();
		if(!maximoDeCaracteresValidation.isValid(cpf))
			throw new IllegalArgumentException("maximum characteres reached");
		
		IValidation minimoDeCaracteresIValidation = new MinimoDeCaracteresValidation();
		if(!minimoDeCaracteresIValidation.isValid(cpf))
			throw new IllegalArgumentException("Minimum Characteres reached");
		return cpf;
	}
	
	
	public static Integer lerId() {
		
		
		Integer id = Integer.parseInt(JOptionPane.showInputDialog("Enter student id"));
		
		IValidation identificadorValidation = new IdentificadorValidation();
		if(!identificadorValidation.isValid(id))
			throw new IllegalArgumentException("invalid id");
		return id;
	}
	
	
	public static String lerOpcao() {
		Scanner ler = new Scanner(System.in);
		
		String opcao = ler.nextLine().trim();
		
		IValidation campoObrigatorioIValidation = new CampoObrigatorioValidation();
		if(!campoObrigatorioIValidation.isValid(opcao)) 
			throw new IllegalArgumentException("Requerid field");
		
		IValidation espacoVazioValidation = new EspacoVazioValidetion();
		if(!espacoVazioValidation.isValid(opcao))
			throw new IllegalArgumentException("cannot contain empty space");
		
		IValidation maximoDeCaracteresValidation = new MaximoDeCaracteresValidation();
		if(!maximoDeCaracteresValidation.isValid(opcao))
			throw new IllegalArgumentException("maximum characteres reached");
		
		IValidation minimoDeCaracteresIValidation = new MinimoDeCaracteresValidation();
		if(!minimoDeCaracteresIValidation.isValid(opcao))
			throw new IllegalArgumentException("Minimum Characteres reached");
		
		return opcao;  
	}
}
