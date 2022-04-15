package gestion_notes;

import java.util.ArrayList;


public class ListEtudiants extends ArrayList<etudiant> {
	
	@Override
	public boolean add(etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}

}
