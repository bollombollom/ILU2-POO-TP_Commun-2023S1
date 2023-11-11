package model;

// Q2 : Reservation est un bean, abstrait
public abstract class Reservation {

	private int jour;
	private int mois;

	public Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	@Override
	public String toString() {
		return "Le " + jour + "/" + mois + " ";
	}

}
