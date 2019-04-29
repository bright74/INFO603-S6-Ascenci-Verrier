package main;

import constantes.Constantes;
import modele.Pile;
import lisibilite_code.ActionConsole;

public class MainPileInt extends ActionConsole {
	
	private static Pile<Integer> p = new Pile<Integer>();
		
	private static boolean continuer = true;
	
	public static void displayStatePile() {
		ecrire_console(p.toString());
	}
	
	public static void displayMenu() {
		ecrire_console(Constantes.SEPARATOR);
		ecrire_console("Manipulation de pile de type abstrait");
		ecrire_console("-1- Empiler un element");
		ecrire_console("-2- Depiler le dernier element (il sera supprime)");
		ecrire_console("-3- Quitter le programme");
	}
	
	public static void handleEmpiler() {
		ecrire_console("Element a rajouter :");
		p.empiler(recupere_int());
	}
	
	public static void handleDepiler() {
		p.depiler();
	}
	
	public static void handleQuitter() {
		continuer = false;
	}
	
	public static Pile handleCommand() {
		ecrire_console("Choix de commande (1-3) :");
		
		int choix = recupere_int();
		

		while(!(choix >= 1 && choix <= 3)) {
			ecrire_console("La commande saisie doit etre comprise entre 1 et 3.");
			choix = recupere_int();
		}
		
		switch (choix) {
			case 1 :
				
				handleEmpiler();
				break;
				
			case 2 :
				
				handleDepiler();
				break;
				
			case 3 :
				handleQuitter();
				break;
				
			default :
				
				ecrire_console("ERREUR");
				break;
				
			}
		return p;
	}
	
	public static void main (String[] args) {
		
		while (continuer) {
			displayMenu();
			handleCommand();
			displayStatePile();
		}
	}
}
