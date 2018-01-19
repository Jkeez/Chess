
public class Pion extends Piece {

	private boolean premierCoup;
	
	public Pion(Color c, boolean b , Position p) {
		super("Pion", c, b,p);
		this.setPremierCoup(true);
		
	}

	@Override
	public boolean moveOK(Position from, Position to) {
		
		if (!(from.valide() && to.valide()))
			return false;
		
		
		
		if(Deplacements.verticale(from, to) ) {
			if(premierCoup) {
				if(Deplacements.ecart(from, to) == 1 || (Deplacements.ecart(from, to) == 2)){
					// voir si la case est occupée par un adva
					return true;
				}
			}
			else
				if(Deplacements.ecart(from, to) == 1)
					return true;
		}
		
		else if(true) {}
		
		return true;
		
	}

	public boolean isPremierCoup() {
		return premierCoup;
	}

	public void setPremierCoup(boolean premierCoup) {
		this.premierCoup = premierCoup;
	}
	
	public String toString()
	{
		if( this.isBlack() ) return "P"+"N" ; // Pion noir
		else return "P"+"B"; // Pion blanc
			
	}


}
