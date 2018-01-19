//import java.math.*;
public class Deplacements {

	public static boolean horizontale(Position from,Position to)
	{
		
		
		boolean res=false;	
	
		if( (Math.abs(to.getRint() - from.getRint())> 0 ) && (from.getC()==to.getC()))
		{
			res=true;
		}
		
		return res;
	}
	public static boolean verticale(Position from,Position to)
	{
		boolean res=false;
		
		if((to.getRint()==from.getRint() )&& (Math.abs(to.getC()-from.getC())>0) )
		{
			res=true;
		}
		
		return res;
	}
	
	public static boolean diagonale(Position from,Position to)
	{
		boolean res=false;
		
		if( (Math.abs(to.getRint() - from.getRint())> 0 ) && (Math.abs(to.getC()-from.getC())>0  )     )
		{
			res=true;
		}
		
		return res;
	}
	public static int ecart(Position from,Position to)
	{
		int res=0;
		if(Deplacements.verticale(from, to) && Deplacements.diagonale(from, to))
			res=Math.abs(to.getC()-from.getC())  ;
		else if (Deplacements.horizontale(from, to))
			res=Math.abs(to.getRint()-from.getRint())  ;
		
		return res;
	}
	
	
	
	
	
}
