package jeu;

public class jeu_reception extends type_jeu{

	private int ident;

	public jeu_reception(String nom, type_jeu type, int ident) {
		super(nom, type);
		this.ident = ident;
	}

	public jeu_reception(String nom, type_jeu type) {
		super(nom, type);

	}
	
	public int getIdent() {
		return ident;
	}
	
	public void setIdent(int ident) {
		this.ident = ident;
	}	

}
