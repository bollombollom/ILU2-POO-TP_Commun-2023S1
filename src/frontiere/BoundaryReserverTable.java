package frontiere;

import java.util.Scanner;

import control.ControlReserverTable;

public class BoundaryReserverTable {
	private static final boolean DEBUG = true;

	private ControlReserverTable control;
	private Scanner scanner = new Scanner(System.in);

	public BoundaryReserverTable(ControlReserverTable control) {
		this.control = control;
	}

	public void reserverTable(int numClient) {
		System.out.println("Quand souhaitez vous reservez ?");
		System.out.println("Pour quel mois ? ");
		int mois = Mockup.giveValueIfDebug(5);
		System.out.println("Pour quel jour ? ");
		int jour = Mockup.giveValueIfDebug(19);
		System.out.println("Pour combien de personnes ?");
		int nombrePersonnes = Mockup.giveValueIfDebug(3);
		System.out.println("Pour quel service ?");
		int numService = Mockup.giveValueIfDebug(1);
		int[] proposition = control.trouverPossibilite(jour, mois, nombrePersonnes, numService);
		boolean finProposition = false;
		for (int i = 1; i < proposition.length && !finProposition; i++) {
			int numProposition = proposition[i];
			if (numProposition != 0) {
				System.out.println("Numéro de table : " + numProposition);
			} else {
				finProposition = true;
			}
		}
		System.out.println("Choisissez votre table");
		int numProposition = Mockup.giveValueIfDebug(3);
		control.reserver(numClient, numProposition, proposition[0]);
	}

}
