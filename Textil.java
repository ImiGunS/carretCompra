package com.company;

/**
 * El nostre producte.
 *
 * @author Marc Soltero
 * @version 1.1
 * @since 21/02/2022
 */

public class Textil extends Producte {
	private String composicio;
	private String codificacio;

	public Textil(float preu, String nom, String codi, String compo) {
		super(preu, nom, codi);
		composicio = compo;
		codificacio = preu + codi;
	}

	/**
	 * Obtenim la composició del producte
	 *
	 * @return composicio
	 */

	public String getComposicio() {
		return composicio;
	}

	/**
	 * Obtenim la composició del producte
	 *
	 * @param composicio string
	 *
	 */

	public void setComposicio(String composicio) {
		this.composicio = composicio;
	}

	@Override

	/**
	 * Concatena el nom i el preu del producte
	 *
	 * @return string
	 */

	public String toString() {
		return new String(getNom() + " " + getPreu());
	}


	/**
	 * Agafa el codi del Producte
	 *
	 * @return codificacio
	 * TODO: Funció no implementada i sense acabar
	 */

	public String getCode (){
		return codificacio;
	}

}
