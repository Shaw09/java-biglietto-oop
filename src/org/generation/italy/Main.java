package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age, km;
		

		try {
			System.out.println("Quanti km devi percorrere?");
			km = scanner.nextInt();
			System.out.println("La tua età?");
			age = scanner.nextInt();
			
			Biglietto biglietto = new Biglietto(km, age);
			System.out.println(biglietto.calcolaPrezzo());
		
		} catch(Exception e) {
			System.out.println("Error, inserisci un nuovo input");
		}
		
		
		scanner.close();
	}

}
