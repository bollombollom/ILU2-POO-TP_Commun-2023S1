package model;

public class ReservationHotel extends Reservation {

	private int nbLitSimple;
	private int nbLitDouble;
	private String identificationChambre;

	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, String identificationChambre) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.identificationChambre = identificationChambre;
	}

	@Override
	public String toString() {
		String chaine = super.toString();
		chaine += "Votre réservation concerne la chambre " + identificationChambre + " comportant ";
		if (nbLitDouble != 0) {
			chaine += nbLitDouble;
			if (nbLitDouble > 1) {
				chaine += " lits doubles ";
			} else {
				chaine += " lit double ";
			}
		}
		if (nbLitSimple != 0) {
			chaine += "et ";
		}
		if (nbLitSimple != 0) {
			chaine += nbLitSimple;
			if (nbLitSimple > 1) {
				chaine += " lits simples ";
			} else {
				chaine += " lit simple ";
			}
		}
		return chaine;
	}

}
