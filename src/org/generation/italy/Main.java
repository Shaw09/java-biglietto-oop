package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age, km;
		boolean flessibile; 
		

		try {
			System.out.println("Quanti km devi percorrere?");
			km = scanner.nextInt();
			System.out.println("La tua età?");
			age = scanner.nextInt();
			System.out.println("Biglietto flessibile? Immetti True per Si, o False per No");
			flessibile = scanner.nextBoolean();
			
			Biglietto biglietto = new Biglietto(km, age, flessibile);
			System.out.println(biglietto.calcolaPrezzo());
			System.out.println(biglietto.calcolaDataScadenza());
		} catch(Exception e) {
			System.out.println("Error, inserisci un nuovo input");
		}
		
		
		scanner.close();
	}

}
