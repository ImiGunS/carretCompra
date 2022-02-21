package com.company;


/**
 * El nostre producte.
 *
 * @author Marc Soltero
 * @version 1.1
 * @since 21/02/2022
 */

public abstract class Producte {
	private float preu;
	private String nom;
	private String codibarres;
	
	public Producte(float preu, String nom, String codi) {
		this.preu = preu;
		this.nom = nom;
		codibarres = codi;
	}


	/**
	 * Agafa el preu del Producte
	 *
	 * @return preu
	 */

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCodibarres() {
		return codibarres;
	}
	public void setCodibarres(String codibarres) {
		this.codibarres = codibarres;
	}

	@Override

	/**
	 * Agafa l'objecte Producte i mira si son iguals
	 * @param obj Object
	 * @return bool
	 *
	 * REFACT: en comptes d'asignar el boolean a una variable i després retornar la variable, es retorna el boolean instead
	 */
	public boolean equals(Object obj) {
		boolean son_iguals;
		if(obj == null) {
			return false;
		}
		else {
			Producte p = (Producte) obj;
			if (codibarres.equals(p.getCodibarres()) && getPreu() == p.getPreu()) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	@Override

	/**
	 * Crea codi de barres.
	 *
	 * @return codi
	 */

	public int hashCode() {
		int codi = codibarres.hashCode();
		return codi;
	}
	
	
	

}
