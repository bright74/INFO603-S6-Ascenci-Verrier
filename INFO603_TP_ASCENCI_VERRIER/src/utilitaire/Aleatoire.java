package utilitaire;

import java.util.Random;

/**********************************************************
 * 
 * Aleatoire:
 * 
 * Classe statique retournant des valeurs aléatoires.
 * 
 *********************************************************/

public class Aleatoire {

	/*
	 * 
	 * Retourne un entier aléatoire, compris dans un intervalle
	 * défini.
	 * 
	 * min: La borne minimale.
	 * max: La borne maximale.
	 * 
	 */
	
	public static int nbAleaRange(int min, int max) {
		return (int) (new Random().nextInt(max - min + 1) + min);
	}
	
}
