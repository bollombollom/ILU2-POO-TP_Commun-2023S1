package model;

public class ReservationSpectacle extends Reservation {
	private int zone;
	private String identificationChaise;

	public ReservationSpectacle(int jour, int mois, int zone, String identificationChaise) {
		super(jour, mois);
		this.zone = zone;
		this.identificationChaise = identificationChaise;
	}

	@Override
	public String toString() {
		String chaine = super.toString();
		chaine += "Vous avez reservé l'emplacement " + identificationChaise + " se trouvant dans la zone " + zone + ".";
		return chaine;
	}
}
