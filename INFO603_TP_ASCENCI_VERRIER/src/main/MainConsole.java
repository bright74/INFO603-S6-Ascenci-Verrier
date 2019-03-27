package main;

import lisibilite_code.ActionConsole;
import modele.Tableau;

/**********************************************************
 * 
 * MainConsole:
 * 
 * Interface sur console.
 * L'utilisateur peut manipuler un graphe orienté.
 * 
 *********************************************************/

public class MainConsole extends ActionConsole {
	
	private static Tableau t;

	public static void main(String[] args) {
		
		t = new Tableau();
		t.genereValeursAleatoires();
		
		ecrire_console(t.toString());
		
		t.triTerritoires();
		
		ecrire_console(t.toString());
	}

}
