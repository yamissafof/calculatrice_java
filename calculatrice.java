package Projet;

public class Calculatrice {

	public static void main(String[] args) {
		String Op;
		int Nb, Res;
		
		Op = "";
		
		while (!Op.equals("F")) {
			Res = Saisie.lire_int("Quel est le premier nombre ? ");
			Op = Saisie.lire_String("Quel est votre opérateur ? ");
			
			while (!Op.equals("F") && !Op.equals("C")) {
				Nb = Saisie.lire_int("Quel est votre deuxième nombre ? ");
				
				if (Op.equals("+")) Res += Nb;
				else if (Op.equals("-")) Res -= Nb;
				else if (Op.equals("*")) Res *= Nb;
				
				System.out.println("Votre résultat est " + Res);
				Op = Saisie.lire_String("Quel est l'opérateur suivant ? F pour quitter ou C pour recommencer avec un nouveau nombre.");
			}
		}
		System.out.println("Fin des calculs");
	}
}
