package org.generation.italy;

import java.math.BigDecimal;

public class Biglietto {
	
	///COSTANTI///
	
	static final BigDecimal COSTO_KM = new BigDecimal ("0.21");
	static final BigDecimal SCONTO_OVER = new BigDecimal ("0.4");
	static final BigDecimal SCONTO_UNDER = new BigDecimal ("0.2");
	
	///ATTRIBUTI///
	
	private int km;
	private int age;
	
	///COSTRUTTORE///
	
	public Biglietto(int km, int age) throws Exception {
	
		if(isValidKm() && isValidAge()) {
			this.km = km;
			this.age = age;
		} else {
			throw new Exception("Inserisci un valore valido");
		}
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
	
	private BigDecimal calcolaPrezzo() {
		return calcolaSconto().multiply(BigDecimal.valueOf(km));
	}
}

