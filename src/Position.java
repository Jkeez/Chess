
public class Position {

	private int r;
	private char c;
	private int cModifier;
	private int rModifier;
	
	public Position() {
		
	}
	public Position(char c,int r){
		
		this.setC(c);
		this.setcModifier(charToInt(c));

		this.setR(r);
		this.setrModifier(intToInt(r));
		
	
	}

	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
	
	public static int intToInt(int i) {
		
		switch(i) {
			case 1:
				return 7;
				
			case 2:
				return 6;
				
			case 3:
				return 5;
			case 4:
				return 4;
			case 5:
				return 3;
			case 6:
				return 2;
			case 7:
				return 1;
			case 8:
				return 0;	
				
			default:
				return -1;
		}
		 
	}
	public int charToInt(char c) {
		
		switch(c) {
			case 'a':
				return 0;
				
			case 'b':
				return 1;
				
			case 'c':
				return 2;
			case 'd':
				return 3;
			case 'e':
				return 4;
			case 'f':
				return 5;
			case 'g':
				return 6;
			case 'h':
				return 7;	
				
			default:
				return -1;
				
		}
	}
		public boolean valide()

		{
			boolean res=false;
			
			if( (this.getR()>0 && this.getR()<9) && (this.getC()>0 && this.getC()< 9) )
			{
				res=true;
			}
			return res;
		}
		public int getcModifier() {
			return cModifier;
		}
		public void setcModifier(int cModifier) {
			this.cModifier = cModifier;
		}
		public int getrModifier() {
			return rModifier;
		}
		public void setrModifier(int rModifier) {
			this.rModifier = rModifier;
		}
		
		
}
	

