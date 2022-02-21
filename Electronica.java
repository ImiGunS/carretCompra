package com.company;

/**
 * El nostre producte.
 *
 * @author Marc Soltero
 * @version 1.1
 * @since 21/02/2022
 */

public class Electronica extends Producte {
	private int dies_garantia;

	public Electronica(float preu, String nom, String codi, int diesg) {
		super(preu, nom, codi);
		dies_garantia = diesg;
	}

	@Override

	/**
	 * Agafa el preu del Producte
	 *
	 * @return preu
	 */

	public float getPreu() {
		float preu = super.getPreu();
		return (float) (preu + preu*(dies_garantia/365)*0.1);
	}


	@Override

	/**
	 * Concatena nom i preu producte.
	 *
	 * @return concatenacio
	 */

	public String toString() {
		return getNom() + "," + getPreu();
	}
	
	
	

}
