package utilitaire;

import java.util.Random;

/**********************************************************
 * 
 * Aleatoire:
 * 
 * Classe statique retournant des valeurs al�atoires.
 * 
 *********************************************************/

public class Aleatoire {

	/*
	 * 
	 * Retourne un entier al�atoire, compris dans un intervalle
	 * d�fini.
	 * 
	 * min: La borne minimale.
	 * max: La borne maximale.
	 * 
	 */

	public static int nbAleaRange(int min, int max) {
		return (int) (new Random().nextInt(max - min + 1) + min);
	}

}