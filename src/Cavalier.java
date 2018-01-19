
public class Cavalier extends Piece {

	public Cavalier() {
		super();
	}

	public Cavalier(Color c, boolean b, Position p) {
		super("Cavalier", c,b,p);
	}

	@Override
	public boolean moveOK(Position from, Position to) {
		boolean res=false;
		if( !this.PositionOK(from, to))
		{
			res=false;
		}
		
		
		return res;
	}
	
	public String toString()
	{
		if( this.isBlack() ) return "C"+"N" ; // Cavalier noir
		else return "C"+"B"; // Cav blanc
			
	}


}
