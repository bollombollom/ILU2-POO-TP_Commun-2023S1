package model;

public class ReservationRestaurant extends Reservation {

	private int numeroService;
	private int numeroTable;

	public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTable) {
		super(jour, mois);
		this.numeroService = numeroService;
		this.numeroTable = numeroTable;
	}

	@Override
	public String toString() {
		String chaine = super.toString();
		chaine += "Table " + numeroTable + " pour le ";
		if (numeroService == 1) {
			chaine += "premier ";
		} else {
			chaine += "deuxième ";
		}
		return chaine + "service.\n";
	}

}
