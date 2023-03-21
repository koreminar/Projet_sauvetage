package jeu;

public class jeu_porte extends type_jeu {
	
	private int ident;

	public jeu_porte(String nom, type_jeu type, int ident) {
		super(nom, type);
		this.ident = ident;
	}

	public jeu_porte(String nom, type_jeu type) {
		super(nom, type);
	}
	
	public int getIdent() {
		return ident;
	}

	public void setIdent(int ident) {
		this.ident = ident;
	}

}
