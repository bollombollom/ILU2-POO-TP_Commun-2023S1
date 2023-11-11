package model;

public abstract class EntiteReservable<F extends Formulaire> {
	protected CalendrierAnnuel calendrier = new CalendrierAnnuel();
	protected int identification;

	public boolean estLibre(F formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrier.estLibre(jour, mois);
	}

	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}

	public abstract Reservation reserver(F formulaire);

	public abstract boolean compatible(F formulaire);
}
