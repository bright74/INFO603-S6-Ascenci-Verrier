package modele;

import java.util.ArrayList;
import constantes.Constantes;

public class Pile<T> {
	
	final ArrayList<T> PILE_VIDE = null;
	
	private ArrayList<T> elements;
	
	private int tailleElems;
	
	private int tailleMax;
	
	public Pile() {
		this.setElements(PILE_VIDE);
		this.setTailleMax(Constantes.TAILLE_MAX_PILE);
	}
	
	public ArrayList<T> getElements() {
		return this.elements;
	}
	
	public int getTailleMax() {
		return this.tailleMax;
	}
	
	public int getTailleElems() {
		return this.tailleElems;
	}
	
	public void setElements(ArrayList<T> newElems) {
		this.elements = newElems;
	}
	
	public void setTailleMax(int newTMax) {
		this.tailleMax = newTMax;
	}
	
	public void setTailleElems(int newTElems) {
		this.tailleElems = newTElems;
	}
	
	public void Empiler(T element) {
		if (this.tailleElems < this.tailleMax) {
			this.elements.add(element);
			this.tailleElems++;
		}
	}
	
	public void Depiler(T element) {
		if (this.elements != PILE_VIDE){
			this.elements.set(this.tailleElems-1, null);
		}
	}
	
	public T Sommet() {
		T res = null;
		if (this.elements != PILE_VIDE){
			res =  this.elements.get(this.tailleElems-1);
		}
		return res;
	}
	
	public String toString() {
		int i = 0;
		String res = "";
		while (i != this.tailleElems) {
			res += this.elements.get(i);
			i++;
		}
		return res; 
	}
}