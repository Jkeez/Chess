import java.util.Scanner;

public class EvolveChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Echiquier echiquier;
		echiquier = new Echiquier() ;
		echiquier.afficher();
		
		int aQuiLeTour=0;
		
		int rdepart, rarrivee;
		String cdepart, carrivee;
		Position depart, arrivee;
		
		Joueur j1 = new Joueur("amal",Color.Black);
		Joueur j2 = new Joueur("moussa",Color.White);
		do {
			
			
			System.out.println("PION A DEPLACER");
			System.out.println("entrez une lettre (rangée)");
			Scanner sc = new Scanner(System.in);
			cdepart= sc.next();

			System.out.println("entrez un chiffre (colonne)");
			rdepart= sc.nextInt(); 
			
			//rdepart = Position.intToInt(rdepart);
			
			depart = new Position(cdepart.charAt(0), rdepart);
			
			System.out.println("POSITION ARRIVEE");
			System.out.println("entrez une lettre (rangée)");
			carrivee= sc.next();
			System.out.println("entrez un chiffre (colonne)");
			rarrivee= sc.nextInt();
			
		//	rarrivee = Position.intToInt(rarrivee);

			arrivee = new Position(carrivee.charAt(0), rarrivee);
			
			Piece pdepart = echiquier.getCase(depart).getPiece();
			Piece parrivee = echiquier.getCase(arrivee).getPiece();
			
			System.out.println(echiquier.getCase(depart).getPiece());
			System.out.println(echiquier.getCase(arrivee).getPiece());

			boolean a = echiquier.getCase(depart).getPiece().seDeplacer(arrivee, echiquier, pdepart, parrivee);
			
			
			System.out.println("Deplacement : " + a);
			aQuiLeTour++;
			echiquier.afficher();
			
			
			

			
			
		} while(!Piece.isRoiMange());
		
	}

}
