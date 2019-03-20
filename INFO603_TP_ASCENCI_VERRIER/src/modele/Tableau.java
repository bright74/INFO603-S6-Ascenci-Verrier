package modele;

import constantes.Constantes;

/**********************************************************
 * 
 * Tableau:
 * 
 * Représente un tableau d'entiers.
 * 
 *********************************************************/

public class Tableau {

	/**********************************************************
	 * 
	 * Attributs du tableau:
	 * - valeurs: une liste d'entiers
	 * 
	 *********************************************************/
	
	private int[] valeurs;
	
	/**********************************************************
	 * 
	 * Constructeur de Tableau:
	 * 
	 *********************************************************/
	
	public Tableau() {
		this(Constantes.DEFAULT_TABLEAU_SIZE);
	}
	
	public Tableau(int tailleTab) {
		setValeurs(new int[tailleTab]);
	}
	
	/**********************************************************
	 * 
	 * Getters/Setters:
	 * 
	 *********************************************************/
	
	public void setValeurs(int[] tabEntiers) {
		this.valeurs = tabEntiers;
	}
	
	public int[] getValeurs() {
		return this.valeurs;
	}
	
	/**********************************************************
	 * 
	 * Méthodes privées:
	 * 
	 *********************************************************/
	
	/**********************************************************
	 * 
	 * Méthodes publiques:
	 * 
	 *********************************************************/
	
	/*
	 * 
	 * Récupère la valeur du tableau à l'indice rang.
	 * 
	 * Retourne un entier.
	 * 
	 */
	
	public int getValueRang(int rang) {
		return this.valeurs[rang];
	}
	
	/*
	 * 
	 * Retourne l'état du tableau.
	 * 
	 * Retourne un String.
	 *
	 */
	
	public String toString() {
		String s = "";
		for (int i=0; i<Constantes.DEFAULT_TABLEAU_SIZE; i++) {
			s += getValueRang(i) + " ";
		}
		return s;
	}
	
}
