package model;

// Q4
public class CentraleReservation<E extends EntiteReservable<F>, F extends Formulaire> {
	private E[] entites;
	private int nbEntites = 0;

	public CentraleReservation(E[] entites) {
		this.entites = entites;
	}

	public int ajouterEntite(E entite) {
		entites[nbEntites] = entite;
		nbEntites++;
		return nbEntites;
	}

	public int[] donnerPossibilitees(F formulaire) {
		int[] possibilites = new int[nbEntites];
		for (int i = 0, j = 0; i < nbEntites; i++) {
			if (entites[i].compatible(formulaire) && entites[i].estLibre(formulaire)) {
				possibilites[j] = (i + 1);
				j++; // remplir l'ensemble des possibilités
			}
		}
		return possibilites;
	}

	public Reservation reserver(int numEntite, F formulaire) {
		EntiteReservable<F> entite = entites[numEntite - 1];
		formulaire.setIdentificationEntite(entite.getIdentification());
		return entite.reserver(formulaire);
	}
}
