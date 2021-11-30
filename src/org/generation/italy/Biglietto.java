package org.generation.italy;

import java.math.BigDecimal;

public class Biglietto {
	
	///COSTANTI///
	
	static final BigDecimal COSTO_KM = new BigDecimal ("0.21");
	static final BigDecimal SCONTO_OVER = new BigDecimal ("0.6");
	static final BigDecimal SCONTO_UNDER = new BigDecimal ("0.8");
	
	///ATTRIBUTI///
	
	private int km;
	private int age;
	
	///COSTRUTTORE///
	
	public Biglietto(int km, int age) throws Exception {
	
		this.km = km;
		this.age = age;
		
		if(!isValidAge() || !isValidKm()) {
			throw new Exception("Inserisci un valore valido");
		}
		
//		if(isValidKm() && isValidAge()) {
//			this.km = km;
//			this.age = age;
//		} else {
//			throw new Exception("Inserisci un valore valido");
//		}
		
//		do {
//			this.km = km;
//			this.age = age;
//		} while (isValidKm() && isValidAge());
					
	}

	
	///METODI///
	
	//ValidKm
	
	private boolean isValidKm() {
		if(km <= 0 || km > 1000000) {
			return false;
		} else {
			return true;
		}
	}

	//ValidEta

	private boolean isValidAge() {
		if(age <= 0 || age > 150) {
			return false;
		} else {
			return true;
		}
	}
	
	private BigDecimal calcolaSconto() {
		
		if(age < 18) {
			return SCONTO_UNDER.multiply(COSTO_KM);
		} else if(age >= 65) {
			return SCONTO_OVER.multiply(COSTO_KM);
		} else {
			return COSTO_KM;
		}
	}
	
	public BigDecimal calcolaPrezzo() {
		return calcolaSconto().multiply(BigDecimal.valueOf(km));
	}
}

