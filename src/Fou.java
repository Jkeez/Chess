
public class Fou extends Piece {

	
	public Fou() {
		super();
	}

	public Fou(Color c, boolean b, Position p) {
		super("Fou", c,b,p);
	}

	@Override
	public boolean moveOK(Position from, Position to) {
		// TODO Auto-generated method stub
		return false;
	}
	public String toString()
	{
		if( this.isBlack() ) return "F"+"N" ; // Fou noir
		else return "F"+"B"; // Fou blanc
			
	}

}
