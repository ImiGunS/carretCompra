package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * El nostre producte.
 *
 * @author Marc Soltero
 * @version 1.1
 * @since 21/02/2022
 */

public class Alimentacio extends Producte {
	
	private LocalDate d;

	/**
	 * Obtenim data caducitat del producte
	 *
	 * @param preu float
	 * @param nom string
	 * @param codi string
	 * @param datac LocalDate
	 */

	public Alimentacio(float preu, String nom, String codi, LocalDate datac) {
		super(preu, nom, codi);
		d = datac; //obtenim la data de caducitat
	}

	@Override

	/**
	 * Obtenim el preu final del producte
	 *
	 * @param preu float
	 * @param long dif
	 * @return preu
	 */

	public float getPreu() {
		float preu = super.getPreu();
		long dif;
		dif = ChronoUnit.DAYS.between(d,LocalDate.now());
		preu = preu - (float) (preu*(1/(dif+1)) + (preu*(0.1)));
		//System.out.println("preu:" + preu);
		return preu;
	}


	@Override

	/**
	 * Concatena el nom amb el preu
	 *
	 * @return string
	 */

	public String toString() {
		return new String(getNom() + " " + getPreu());
	}
	


}
