package fr.lendemain;

import java.util.Scanner;

public class Niveau {
	public static void niveauJeu() {
		System.out.println("bienvenu sur notre site d'education");
		System.out.println("Les differents niveaux du jeu \n 1:Addition et soustration de 1 à 20 \n "
				+ "2:Addition, soustration et multiplication 0 à 50 \n 3:toutes les operations de 0 à 100"
				+ "\n faites votre choix");
		Scanner scanner = new Scanner(System.in); 
	
		int choix = scanner.nextInt();
		switch (choix) {
		case 1:
			
			int[] nombres = niveau(0, 20);
			Operation.operationNiveau1(nombres[0], nombres[1]);
			break;
		/*case 2:
			
			 nombres = niveau(0, 50);
			Operation.operationNiveau2(nombres[0], nombres[1]);
			break;
		case 3:
			
			nombres = niveau(0, 100);
			Operation.operationNiveau3(nombres[0], nombres[1]);
			break;*/
		default:
			System.out.println("Désolé votre choix n'est pas dans la liste");
			break;
		}
			
	}

	public static int[] niveau(int min, int max) {
		int a = Utility.getNumber(min, max);
		int b = Utility.getNumber(min, max);
		int[] nombres = {a,b};
		return nombres;
	}
	
	
	
}
