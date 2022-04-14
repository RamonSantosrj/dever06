package principal;

import controller.AlunoController;
import helpers.AlunoHelper;

public class Program {

	public static void main(String[] args) {

		System.out.println("Choose the option you want?");
		System.out.println("1- register student");
		System.out.println("2- update student");
		System.out.println("3- delete student");
		System.out.println("4- consult student");
		System.out.println("\nenter the desired option:");

		
		try {

			switch (AlunoHelper.lerOpcao()) {
			case "1":
				AlunoController.register();
				break;
			case "2":
				AlunoController.update();
				break;
			case "3":
				AlunoController.delete();
				break;
			case "4":
				AlunoController.consult();
				break;
			default:
				System.out.println("option invalid");
				break;
			}
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("Error in system: " + e.getMessage());
		}
		

	}

}
