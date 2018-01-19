
public class Tour extends Piece {

	
	public Tour(Color c, boolean b, Position p) {
		super("Tour", c,b,p);
	}

	@Override
	public boolean moveOK(Position from, Position to) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString()
	{
		if( this.isBlack() ) return "T"+"N" ; // Tour noir
		else return "T"+"B"; // Tour blanc
			
	}


}
