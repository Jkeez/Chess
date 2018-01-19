
public abstract class Piece
{
	protected String nom;
	protected Color couleur;
	protected boolean mange = false;
	protected Position position;
	private static boolean roiMange=false;


	public Piece() {
		
	}
	public Piece(String n,Color c)
	{
		this.nom=n;
		this.couleur=c;
	}
	public Piece(String nom, Color couleur, boolean mange, Position position) {
		
		this.nom = nom;
		this.couleur = couleur;
		this.mange = mange;
		this.setPosition(position);
	}
	
	public boolean seDeplacer(Position to , Echiquier e, Piece pdepart, Piece parrivee ) {
		
		Position tmp;
		
		System.out.println("dans se deplacer");
	////	System.out.println("position this position : " + pdepart.getC() + n.getR());
	//	System.out.println("position to : " + to.getC() + to.getR());

		System.out.println(pdepart);
		System.out.println(parrivee);

		if ( parrivee == null ) {
			System.out.println("premiere condition");	
			e.getCase(to).setPiece(pdepart);
			tmp = pdepart.getPosition();
			pdepart.setPosition(to);
			
			
			
			//Case[][] tab = e.getTabCase();
			
		//	tab[tmp.getCint()][tmp.getRint()]=null;
			e.getCase(tmp).setPiece(null);
			
			return true;

		}
		if ( parrivee != null ) {
			System.out.println("seconde conditions");

			if ( parrivee.getCouleur() != pdepart.getCouleur() )
			{
				
				parrivee.setPosition(null);
				parrivee.mange = true;
				if (parrivee.nom=="Roi")
					this.roiMange =true;
				
				e.getCase(pdepart.position).setPiece(null);
				
				e.getCase(to).setPiece(pdepart);

				return true;
			}
			else
			{
				return false;
			}
			
		}
		return true;
	}
	
	
	public static boolean isRoiMange() {
		return roiMange;
	}
	public static void setRoiMange(boolean roiMange) {
		Piece.roiMange = roiMange;
	}
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}



	public Color getCouleur() {
		return couleur;
	}



	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}



	public boolean isWhite(){
		return this.couleur==Color.White;
	}
	public boolean isBlack(){
		return this.couleur==Color.Black;
	}
	public boolean PositionOK(Position from,Position to)
	{
		return from.valide() && to.valide();
			
	}
	
	
	public abstract boolean moveOK(Position from,Position to);
	
	
	public Position getPosition() {
		return position;
	}
	
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
}
