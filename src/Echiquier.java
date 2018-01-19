
public class Echiquier {
	
	private Case[][] tabCase;
	
	
	
	public Echiquier()
	{
		this.tabCase = new Case[8][8];
		
		Piece[] noires = {} ;
		
		char[] lettre = {'a','b','c','d','e','f','g','h' } ;
		int [] num = {8,7,6,5,4,3,2,1} ;
		for (int i=0; i<8 ; i++)
		{
			for ( int j=0; j<8; j++ )
			{
				if ((j+i)%2 == 0)
					this.tabCase[i][j]= new Case(true, lettre[j], num[i] ,Color.Black);
				else
					this.tabCase[i][j]= new Case(true, lettre[j], num[i],Color.White);
				
			}
		}
		
		
		// mis en place des pieces noires
		this.tabCase[0][0].setPiece( new Tour(Color.Black, false, new Position('a',8)) );
		
		this.tabCase[0][1].setPiece( new Cavalier(Color.Black, false, new Position('b',8)) );
		
		this.tabCase[0][2].setPiece( new Fou(Color.Black, false, new Position('c',8)) );

		this.tabCase[0][3].setPiece( new Dame(Color.Black, false, new Position('d',8)) );
		
		this.tabCase[0][4].setPiece( new Roi(Color.Black, false, new Position('e',8)) );
		
		this.tabCase[0][5].setPiece( new Fou(Color.Black, false, new Position('f',8)) );
		
		this.tabCase[0][6].setPiece( new Cavalier(Color.Black, false, new Position('g',8)) );
		
		this.tabCase[0][7].setPiece( new Tour(Color.Black, false, new Position('h',8)) );
		
		for(int i=0; i<8; i++)
			this.tabCase[1][i].setPiece( new Pion(Color.Black, false, new Position(lettre[i],7)) );
			
		// mis en place des pieces blanches
		this.tabCase[7][0].setPiece( new Tour(Color.White, false, new Position('a',1)) );
		
		this.tabCase[7][1].setPiece( new Cavalier(Color.White, false, new Position('b',1)) );
		
		this.tabCase[7][2].setPiece( new Fou(Color.White, false, new Position('c',1)) );

		this.tabCase[7][3].setPiece( new Dame(Color.White, false, new Position('d',1)) );
		
		this.tabCase[7][4].setPiece( new Roi(Color.White, false, new Position('e',1)) );
		
		this.tabCase[7][5].setPiece( new Fou(Color.White, false, new Position('f',1)) );
		
		this.tabCase[7][6].setPiece( new Cavalier(Color.White, false, new Position('g',1)) );

		this.tabCase[7][7].setPiece( new Tour(Color.White, false, new Position('h',1)) );
		
		for(int i=0; i<8; i++)
			this.tabCase[6][i].setPiece( new Pion(Color.White, false, new Position(lettre[i],2)) );
		

	}
	
	public Case getCase(Position pos)
	{
		
		
		return this.tabCase[pos.getrModifier()][pos.getcModifier()] ;
	}
	
	/*
	public Piece getRoiBlanc()
	{
		
		for( int i=0; i<8; i++ )
		{
			for(int j=0; j<8; j++ )
			{
				if ( this.tabCase[i][j].getPiece().getNom().equals("Roi") && this.tabCase[i][j].getPiece().isBlack() ) return this.tabCase[i][j].getPiece() ;
					
			}
		}
		return null ;
		
	}
	public Piece getRoiNoir()
	{
		
		for( int i=0; i<8; i++ )
		{
			for(int j=0; j<8; j++ )
			{
				if ( this.tabCase[i][j].getPiece().getNom().equals("Roi")  && this.tabCase[i][j].getPiece().isWhite() ) return this.tabCase[i][j].getPiece() ;
					
			}
		}
		return null ;
		
	}
	*/
	public void afficher() 
	{
		int taille = 8 ;
			for( int i=0; i< taille ; i++ )
			{
				for(int j=0; j< taille;j++ )
				{
					if(  this.tabCase[i][j].getPiece() != null )
						System.out.print( this.tabCase[i][j].getPiece().toString()  ) ;
					else
						{System.out.print("CV"); }
					System.out.print("|");
				}
				
		
				System.out.println();
				

			}
			
			System.out.println();
	}

	public Case[][] getTabCase() {
		return tabCase;
	}
}
