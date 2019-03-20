package modele;

import constantes.Constantes;
import utilitaire.Aleatoire;

/**********************************************************
 * 
 * Tableau:
 * 
 * Représente un tableau d'entiers.
 * Les indices iront de 1 a n.
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
	
	/**********************************************************
	 * 
	 * Méthodes publiques:
	 * 
	 *********************************************************/
	
	/*
	 * 
	 * R�cup�re la valeur du tableau � l'indice rang.
	 * 
	 * Retourne un entier.
	 * 
	 */
	
	public int getValueRang(int rang) {
		return getValeurs()[rang];
	}
	
	/*
	 * 
	 * Met � jour la valeur du tableau � l'indice rang.
	 * 
	 */

	public void setValueRang (int rang, int valeur) {
		getValeurs()[rang] = valeur;
	}
	
	/*
	 * 
	 * G�n�re des valeurs al�atoires.
	 * 
	 */

	public void genereValeursAleatoires() {
		for(int i = Constantes.DEFAULT_FIRST_INDEX; i<getValeurs().length; i++) {
			setValueRang(i, Aleatoire.nbAleaRange(Constantes.DEFAULT_MIN_RANGE_VALUE, Constantes.DEFAULT_MAX_RANGE_VALUE));
			}
		}
	
		/*
		 * 
		 * Retourne l'�tat du tableau.
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
}
