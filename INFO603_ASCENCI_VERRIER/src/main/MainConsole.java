package main;

import constantes.Constantes;
import modele.Pile;
import lisibilite.ActionsConsole;

 public class MainConsole extends ActionsConsole {
	 
	 private static boolean ended = false;
	 private static Pile<Integer> p;
	 
	 private static void configMain() {
		 
	 }
	 
	 private static void testsMain() {
		 p = new Pile<Integer>();
		 
		 p.empile(10);
		 p.empile(50);
		 p.empile(3);
		 
		 ecrire_console(p.toString());
		 
		 p.depile();
		 
		 ecrire_console(p.toString());
		 
		 p.depile();
		 
		 ecrire_console(p.toString());
	 }
	 
	 private static void displayState() {
		 
	 }
	 
 	 private static void displayMenu() {
		 ecrire_console(Constantes.CONSOLE_SEPARATEUR);
		 ecrire_console("Manipulation de pile de type abstrait");
		 ecrire_console("-1- Empiler un element");
		 ecrire_console("-2- Depiler le dernier element (il sera supprime)");
		 ecrire_console("-3- Recuperer la valeur du sommet");
		 ecrire_console("-4- Verifier si la pile est vide");
		 ecrire_console("-5- Quitter le programme");
	 }

 	 private static void handleCommand() {
		 
	 }
 	 
 	 public static void main(String[] args) {
 		 /* configuration */
 		 configMain();
 		 
 		 /* tests */
 		 testsMain();
 		 
 		 /* affiche l'état de l'application */
 		 displayState();
 		 
 		 /* coeur du programme */
// 		 while( !ended ) {
// 			 
// 			 /* affiche le menu */
// 			 displayMenu();
// 			 
// 			 /* récupère et traite le choix de l'utilisateur */
// 			 handleCommand();
// 			 
// 			 /* affiche l'état de l'application */
// 			 displayState();
// 		 }
 		 
 	 }
}