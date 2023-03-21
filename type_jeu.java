package jeu;

public class type_jeu {
	
	private String nom;
	private type_jeu type;
	
	
	public type_jeu(String nom, type_jeu type) {
		super();
		this.nom = nom;
		this.type = type;
	}

	//getters 
	public String getNom() {
		return nom;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}
	

	public type_jeu getType() {
		return type;
	}


	public void setType(type_jeu type) {
		this.type = type;
	}
	
	
	
	

}
