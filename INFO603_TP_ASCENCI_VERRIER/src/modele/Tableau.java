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
		
		/* L'indice doit être suffisament grand */
		if (index > Constantes.DEFAULT_FIRST_INDEX) {
			
			/* T[1..i-1] trié */
			triInsertionSequentielleRec(index - 1);
			
			k = index - 1;
			x = getValeurRang(index);
			
			/* Pour tout e appartenant à T[k..i-1], e > x */
			while (k >= Constantes.DEFAULT_FIRST_INDEX && getValeurs()[k] > x) {
				getValeurs()[k+1] = getValeurs()[k];
				k--;
			}
			/* Si k < 1 alors pour tout e appartenant à T[1..i], e > x
			 * Ou si t[k] <= x alors pour tout e appartenant à T[k+1..i], e > x 
			 */
			
			/* T[1..i] trié */
			getValeurs()[k+1] = x;
			
		}
	}
	
	/*
	 * 
	 * Trouve l'indice de la valeur minimale dans une zone du tableau donnée.
	 * 
	 * Retourne un entier.
	 * 
	 */
	
	private int getIndValeurMin(int indexMin, int indexMax) {
		int valMini = getValeurRang(indexMin);
		int indMini = indexMin;
		
		for(int i=indexMin+1; i<indexMax; i++) {
			if(valMini > getValeurRang(i)) {
				valMini = getValeurRang(i);
				indMini = i;
			}
		}
		
		return indMini;
	}
	
	/*
	 * 
	 * Trouve l'indice de la valeur maximale dans une zone du tableau donnée.
	 * 
	 * Retourne un entier.
	 * 
	 */
	
	private int getIndValeurMax(int indexMin, int indexMax) {
		int valMax = getValeurRang(indexMin);
		int indMax = indexMin;
		
		for(int i=indexMin+1; i<indexMax; i++) {
			if(valMax < getValeurRang(i)) {
				valMax = getValeurRang(i);
				indMax = i;
			}
		}
		
		return indMax;
	}
	
	/*
	 * 
	 * Echange la valeur de deux cases du tableau aux indices donnés.
	 * 
	 */
	
	private void echange(int index1, int index2) {
		int sauv = getValeurRang(index1);
		setValeurRang(index1, getValeurRang(index2));
		setValeurRang(index2, sauv);
		System.out.println(toString());
	}
	
	/**********************************************************
	 * 
	 * Méthodes publiques:
	 * 
	 *********************************************************/
	
	/*
	 * 
	 * Calcule la taille du Tableau.
	 * 
	 * Retourne un entier.
	 * 
	 */
	
	public int getTaille() {
		return getValeurs().length;
	}
	
	/*
	 * 
	 * Récupère la valeur du tableau à l'indice rang.
	 * 
	 * Retourne un entier.
	 * 
	 */
	
	public int getValeurRang (int rang) {
		return getValeurs()[rang];
	}
	
	/*
	 * 
	 * Met à jour la valeur du tableau à l'indice rang.
	 * 
	 */
	
	public void setValeurRang (int rang, int valeur) {
		getValeurs()[rang] = valeur;
	}
	
	/*
	 * 
	 * Génère des valeurs aléatoires.
	 * 
	 */
	
	public void genereValeursAleatoires() {
		for(int i = Constantes.DEFAULT_FIRST_INDEX; i<getTaille(); i++) {
			setValeurRang(i, Aleatoire.nbAleaRange(Constantes.DEFAULT_MIN_RANGE_VALUE, Constantes.DEFAULT_MAX_RANGE_VALUE));
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
		String s = "[ ";
		for (int i = Constantes.DEFAULT_FIRST_INDEX; i<getTaille(); i++) {
			s += getValeurRang(i) + " ";
		}
		return s + "]";
	}
	
	/**********************************************************
	 * 
	 * Exercice 1: Sémantique axiomatique du tri par insertion séquentielle
	 * 
	 *********************************************************/
	
	/*
	 * 
	 * Trie les valeurs du tableau.
	 * 
	 */
	
	public void triInsertionSequentielle() {
		triInsertionSequentielleRec(getTaille() - 1);
	}
	
	/**********************************************************
	 * 
	 * Exercice 2: Un algorithme de tri très simple
	 * 
	 *********************************************************/
	
	/*
	 * 
	 * Trie les valeurs du tableau.
	 * 
	 */
	
	public void triTerritoires() {
		int i,a,b;
		
		a = Constantes.DEFAULT_FIRST_INDEX;
		b = getTaille()-1;
		i = Constantes.DEFAULT_FIRST_INDEX;
		
		while(a < b) {
			echange(a, getIndValeurMin(a,b));
			echange(b, getIndValeurMax(a,b));
			a++;
			b--;
			i++;
		}
	}
	
}
