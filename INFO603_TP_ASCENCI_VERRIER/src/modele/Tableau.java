package modele;

import constantes.Constantes;
import utilitaire.Aleatoire;

/**********************************************************
 * 
 * Tableau:
 * 
 * Représente un tableau d'entiers.
 * Les indices iront de 1 à n.
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
		setValeurs(new int[tailleTab + Constantes.DEFAULT_FIRST_INDEX]);
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
	
	/*
	 * 
	 * Procédure récursive appelée par la méthode
	 * triInsertionSequentielle.
	 * 
	 */
	
	private void triInsertionSequentielleRec(int index) {
		int x, k;
		
		if (index > Constantes.DEFAULT_FIRST_INDEX) {
			
			triInsertionSequentielleRec(index - 1);
			
			k = index - 1;
			x = getValueRang(index);
			
			while (k >= Constantes.DEFAULT_FIRST_INDEX && getValeurs()[k] > x) {
				getValeurs()[k+1] = getValeurs()[k];
				k--;
			}
			
			getValeurs()[k+1] = x;
			
		}
	}
	
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
		for(int i = Constantes.DEFAULT_FIRST_INDEX; i<getValeurs().length; i++) {
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
		for (int i = Constantes.DEFAULT_FIRST_INDEX; i<getValeurs().length; i++) {
			s += getValueRang(i) + " ";
		}
		return s;
	}
	
	/**********************************************************
	 * 
	 * Exercice 1: Sémantique axiomatique du tri par insertion séquentielle
	 * 
	 * 
	 * 
	 *********************************************************/
	
	public void triInsertionSequentielle() {
		triInsertionSequentielleRec(getValeurs().length - 1);
	}
	
}
