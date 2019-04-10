package main;

import constantes.Constantes;
import modele.Pile;
import lisibilite_code.ActionConsole;

public class MainConsole extends ActionConsole {
	
	public static void displayMenu() {
		ecrire_console(Constantes.SEPARATOR);
		ecrire_console("Manipulation de pile de type abstrait");
		ecrire_console("-1- Empiler un element");
		ecrire_console("-2- Depiler le dernier element (il sera supprime)");
		ecrire_console("-3- Recuperer la valeur du sommet");
		ecrire_console("-4- Verifier si la pile est vide");
		ecrire_console("-5- Quitter le programme");
	}
	
	public static void manageChoix() {
		int choix = 0;
		while (fini != true){
			displayMenu();
			switch (choix) {
			case 1 :
				String elem;
				ecrire_console("Rentrer l'element a empiler");
				empiler()				
				break;
			}
		}
	}
}
