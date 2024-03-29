package fr.lendemain;

import java.util.Scanner;

public class Operation {
	public static int operationNiveau1( int a, int b) {
		System.out.println("La liste des operations \n 1:Addition\n 2:Soustration \n faites votre choix");
		Scanner scanner = new Scanner(System.in);
		int choix  = scanner.nextInt();
		int nombreDeTantative = 5;
		switch (choix) {
		case 1:
			Utility.operationSomme( a, b, nombreDeTantative);
			break;
		case 2:
			Utility.operationSoustration(a, b, nombreDeTantative);
			break;
		default:
			System.out.println("Désolé votre choix n'est pas dans la liste");
			nombreDeTantative--;
			break;
		}
		return choix;
	}

	
	/*public static int operationNiveau2(int a, int b) {
		System.out.println("La liste des operations \n 1:Addition\n 2:Soustration \n 3:Multiplication "
			+" \n faites votre choix");
		
		Scanner scanner = new Scanner(System.in);
		int choix  = scanner.nextInt();
		switch (choix) {
		case 1:
			Utility.operationSomme( a, b);
			break;
		case 2:
			Utility.operationSoustration(a, b);
			break;
		case 3:
			Utility.operationMultiplication(a, b);
			break;
		default:
			System.out.println("Désolé votre choix n'est pas dans la liste");
			break;
		}
		return choix;
	}
	
	public static int operationNiveau3( int a, int b) {
		System.out.println("La liste des operations \n 1:Addition\n 2:Soustration \n 3:Multiplication "
				+ "\n 4:Division \n faites votre choix");
		Scanner scanner = new Scanner(System.in);
		int choix  = scanner.nextInt();
		switch (choix) {
		case 1:
			Utility.operationSomme( a, b);
			break;
		case 2:
			Utility.operationSoustration(a, b);
			break;
		case 3:
			Utility.operationMultiplication(a, b);
			break;
		case 4:
			Utility.operationQuotient(a, b);
			break;
		default:
			System.out.println("Désolé votre choix n'est pas dans la liste");
			break;
		}
		return choix;
	}*/
}
