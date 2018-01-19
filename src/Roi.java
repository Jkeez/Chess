
public class Roi extends Piece {

	
	public Roi() {
		super();
	}

	public Roi(Color c, boolean b, Position p) {
		super("Roi", c,b,p);
	}

	@Override
	public boolean moveOK(Position from, Position to) {
		return false;
	}
	public String toString()
	{
		if( this.isBlack() ) return "R"+"N" ; // Roi noir
		else return "R"+"B"; // Roi blanc
			
	}


}
