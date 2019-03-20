package modele;

import constantes.Constantes;
import utilitaire.Aleatoire;

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
	
	public int getValueRang (int rang) {
		return getValeurs()[rang];
	}
	
	/*
	 * 
	 * Met à jour la valeur du tableau à l'indice rang.
	 * 
	 */
	
	public void setValueRang (int rang, int valeur) {
		getValeurs()[rang] = valeur;
	}
	
	/*
	 * 
	 * Génère des valeurs aléatoires.
	 * 
	 */
	
	public void genereValeursAleatoires() {
		for(int i=0; i<getValeurs().length; i++) {
			setValueRang(i, Aleatoire.nbAleaRange(Constantes.DEFAULT_MIN_RANGE_VALUE, Constantes.DEFAULT_MAX_RANGE_VALUE));
		}
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
