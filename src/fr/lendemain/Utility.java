package fr.lendemain;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	public static int somme(int nombre1,int  nombre2) {
		int somme;
		somme = nombre1 + nombre2;
		return  somme;
	}
	
	public static int soustration(int nombre1,int  nombre2) {
		int somme;
		somme = nombre1 - nombre2;
		return  somme;
	}
	
	
	public static int multiplication(int nombre1,int  nombre2) {
		int produit;
		produit = nombre1*nombre2;
		return  produit;
	}
	
	public static double quotient(int nombre1,int  nombre2) {
		int quotient;
		quotient = nombre1/nombre2;
		return  quotient;
	}
	
	public static int scanf() {
		System.out.println(":");
		Scanner scanner = new Scanner(System.in);
		int nombre;
		nombre = scanner.nextInt();
		return  nombre ;
	}	
	
	public static int getNumber(int min, int max) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(max - min) + min;
		return randomNumber ;
	}
	
	public static void operationSomme(int a, int b, int nombreDeTantative) {
		int addition = Utility.somme(a, b);
		while(nombreDeTantative>0) {
		System.out.println("quel est le resultat de cette operation: "+ a +"+"+ b + "=" );
		int resultat = Utility.scanf();
		if (addition == resultat) {
			System.out.println("bravo " + a +"+"+ b + "="+ addition);
			nombreDeTantative++;
		}else{
			System.out.println("ce n'est pas le bon resultat");
			nombreDeTantative--;
		}
		}
	}
	
	public static void operationSoustration(int a, int b, int nombreDeTantative) {
		int soustration = Utility.soustration(a, b);
		System.out.println("quel est le resultat de cette operation: "+ a +"-"+ b + "=" );
	    int resultat = Utility.scanf();
		if (soustration == resultat) {
			System.out.println("bravo " + a +"-"+ b + "="+ soustration);
			nombreDeTantative++;
		}else{
			System.out.println("ce n'est pas le bon resultat");
			nombreDeTantative--;
		}
	}
	
	public static void operationMultiplication(int a, int b, int nombreDeTantative) {
		int multiplication = Utility.multiplication(a, b);
		System.out.println("quel est le resultat de cette operation: "+ a +"x"+ b + "=" );
	    int resultat = Utility.scanf();
		if (multiplication == resultat) {
			System.out.println("bravo " + a +"x"+ b + "="+ multiplication);
			nombreDeTantative++;
		}else{
			System.out.println("ce n'est pas le bon resultat");
			nombreDeTantative--;
		}
	}
	
	public static void operationQuotient(int a, int b, int nombreDeTantative) {
		double quotient = Utility.quotient(a, b);
		System.out.println("quel est le resultat de cette operation: "+ a +"/"+ b + "=" );
	    double resultat = Utility.scanf();
		if (quotient == resultat) {
			System.out.println("bravo " + a +"/"+ b + "="+ quotient);
			nombreDeTantative++;
		}else{
			System.out.println("ce n'est pas le bon resultat");
			nombreDeTantative--;
		}
	}	
}
