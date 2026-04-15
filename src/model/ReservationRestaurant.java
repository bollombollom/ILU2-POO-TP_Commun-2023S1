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
		return String.format("%s\nTable %d pour le %s service.", super.toString(), numeroTable,
				numeroService == 1 ? "premier" : "deuxième");
		// ou par concaténation
		/*
		 * String chaine = super.toString(); chaine += "\nTable " + numeroTable +
		 * " pour le "; if (numeroService == 1) { chaine += "premier "; } else { chaine
		 * += "deuxième "; } return chaine + "service.";
		 */
	}

}
