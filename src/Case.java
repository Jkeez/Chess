
public class Case {

	private boolean estVide;
	private Position position;
	private Color couleur;
	private Piece piece;
	
	public Case(boolean vide, char r, int c, Color col){
		this.estVide=vide;
		this.position = new Position(r,c);
		this.couleur = col;
		this.piece = null;
	}
	
	public Case(boolean vide, char r, int c, Color col, Piece piece){
		this.estVide=vide;
		this.position = new Position(r,c);
		this.couleur = col;
		this.piece = piece;
	}

	
	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public boolean getEstVide() {
		return estVide;
	}

	public void setEstVide(boolean estVide) {
		this.estVide = estVide;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	
}
