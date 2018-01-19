public class Joueur {

	private String nom;

	private Color couleur;
	
	public Joueur(String n, Color c){
		this.nom=n;
		this.couleur=c;
	}
	
	public String getNom(){
		return this.nom;
	}
	public Color getCouleur(){
		return this.couleur;
	}
}
