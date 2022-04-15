package gestion_notes;

import aiac.gi18.java.complexe.Complexe;

public class etudiant implements Comparable<etudiant> {
	
	private int id;
	private String nom;
	private double note;
	
	public etudiant(int id , String nom) {
		this.id=id;
		this.nom=nom;
		this.note=10.0;
		
		
	}
	
	public String toString(){
		return this.nom + " : " + this.note;
	}
	
	public boolean equals(Object obj) {
		if (! (obj instanceof etudiant) ){
			return false;
		}
	    return	((etudiant)obj).id==this.id;
	}

	@Override
	public int compareTo(etudiant o) {
		
		if(this.id==o.id) return 0;
		if(this.id>o.id) return 1;
		return -1;
	}
    
}
