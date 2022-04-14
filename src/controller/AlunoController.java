package controller;

import entities.Aluno;
import helpers.AlunoHelper;
import interfaces.IAlunoRepository;
import repositories.AlunoRepository;

public class AlunoController {

	public static void register() {
		try {
			System.out.println("\tstudent registration \n");

			Aluno aluno = new Aluno();
			
			aluno.setNome(AlunoHelper.lerNome());
			aluno.setMatricula(AlunoHelper.lerMatricula());
			aluno.setCpf(AlunoHelper.lerCpf());

			IAlunoRepository alunoRepository = new AlunoRepository();
			alunoRepository.create(aluno);

			System.out.println("\tstudent sucessfully register ");

		} catch (Exception e) {
			System.out.println("an error occurred when register student: " + e.getMessage());
		}

	}

	public static void update() {
		try {
		System.out.println("update student data");
		
		Integer id = AlunoHelper.lerId();
		
		IAlunoRepository alunoRepository = new AlunoRepository();
		
		Aluno aluno = alunoRepository.findById(id);
		
		if(aluno != null) {
		
		aluno.setNome(AlunoHelper.lerNome());
		aluno.setMatricula(AlunoHelper.lerMatricula());
		aluno.setCpf(AlunoHelper.lerCpf());
		
		alunoRepository.update(aluno);
		System.out.println("student sucessfully updated ");
		}
		
		}catch (Exception e) {
			System.out.println("Error when update aluno: " + e.getMessage());
		}
		
	}

	public static void delete() {
		try {
			System.out.println("delete student data");
			
			Integer id = AlunoHelper.lerId();
			
			IAlunoRepository alunoRepository = new AlunoRepository();
			
			Aluno aluno = alunoRepository.findById(id);
			
			if(aluno != null) {
			
			alunoRepository.delete(aluno);
				
			System.out.println("student successfully deleted");
			}
			
		} catch (Exception e) {
			System.out.println("Error when deleted student : " + e.getMessage());
		}
	}
	
	
	public static void consult() {
		
		try {
		System.out.println("consult student data");
		
		
		IAlunoRepository alunoRepository = new AlunoRepository();
		
		for(Aluno aluno : alunoRepository.findAll()) {
			System.out.println(aluno.toString());
		}
		}catch (Exception e) {
			System.out.println("error when listing students : " + e.getMessage());		}
	}
	

}
