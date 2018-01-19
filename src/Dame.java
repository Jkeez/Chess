
public class Dame extends Piece {

	public Dame() {
		super();
	}

	public Dame(Color c, boolean b, Position p) {
		super("Dame", c,b,p);
	}

	@Override
	public boolean moveOK(Position from, Position to) {
		return false;
	}
	
	public String toString()
	{
		if( this.isBlack() ) return "D"+"N" ; // Dame noir
		else return "D"+"B"; // Dame blanc
			
	}


	
}
