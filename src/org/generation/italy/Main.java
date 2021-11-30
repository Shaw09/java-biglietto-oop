package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age, km;
		System.out.println("How many kilometers do you want to do?\n km:");
		km = scanner.nextInt();
		System.out.println("\nHow old are you?\n Age:");
		age = scanner.nextInt();
		
		try {
			Biglietto biglietto = new Biglietto(km, age);
		} catch(Exception e) {
			System.out.println("Error, inserisci un nuovo input");
		}
		
		
		scanner.close();
	}

}
