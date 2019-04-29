package modele;

import java.util.ArrayList;

import constantes.Constantes;

public class Pile<T> {

	private ArrayList<T> elements;
	private int taille;
	private int nb_elements;
	
	public Pile( int nb ) {
		this.elements = new ArrayList<T>();
		this.taille = nb;
		this.nb_elements = 0;
	}
	
	public Pile() {
		this( Constantes.PILE_TAILLE_DEFAUT );
	}
	
	public boolean estVide() {
		return this.elements.isEmpty();
	}
	
	public boolean estPleine() {
		return this.nb_elements == taille;
	}
	
	public T sommet() {
		if( !estVide() ) {
			return this.elements.get( this.nb_elements-1 );
		}
		
		return null;
	}
	
	public void empiler( T element ) {
		if( !estPleine() ) {
			this.elements.add( element );
			this.nb_elements++;
		}
	}
	
	public void depile() {
		if( !estVide() ) {
			this.elements.remove( this.nb_elements - 1 );
			this.nb_elements--;
		}
	}
	
}
