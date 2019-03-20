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
	
	public static void displayMenu() {
		ecrire_console("--------------------------------------------------------");
		ecrire_console("--- Voulez-vous generer un tableau aleatoirement? (o/n)");
	}
	
	public static void handleCommand() {
		
		String choix = recupere_string();
		
		while ((choix != "o") && (choix != "n")) {
			switch(choix) {
			case "o" : 
				t.genereValeursAleatoires();
				break;
			case "n" :
				break;
			default :
				ecrire_console("CHOIX INVALIDE");
			}
		}
	}

	public static void main(String[] args) {
		
		t = new Tableau();
		displayMenu();
		handleCommand();
		//tri sequentielle
		//ecrire_console(t.toString());
	}

}