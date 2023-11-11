package model;

public class Restaurant implements IEtablissement<FormulaireRestaurant> {
	private CentraleReservation<Table, FormulaireRestaurant> centrale = new CentraleReservation<>(new Table[100]);

	// CLASSE INTERNE//////////////////////////////////////////////////////
	private static class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();

		public Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaireRestaurant) {
			int mois = formulaireRestaurant.getMois();
			int jour = formulaireRestaurant.getJour();
			int numService = formulaireRestaurant.getNumService();
			int nbPersonnes = formulaireRestaurant.getNombrePersonnes();
			if (nbPersonnes == nbChaises || nbPersonnes + 1 == nbChaises) {
				switch (numService) {
				case 1:
					return estLibre(formulaireRestaurant);
				case 2:
					return calendrierDeuxiemeService.estLibre(jour, mois);

				default:
					throw new IllegalArgumentException("Restaurant limité à deux services");
				}
			}
			return false;
		}

		@Override
		public Reservation reserver(FormulaireRestaurant formulaireRestaurant) {
			Reservation reservation = null;
			int mois = formulaireRestaurant.getMois();
			int jour = formulaireRestaurant.getJour();
			int numService = formulaireRestaurant.getNumService();

			boolean reservationOK = false;

			switch (numService) {
			case 1:
				reservationOK = calendrier.reserver(jour, mois);
				break;
			case 2:
				reservationOK = calendrierDeuxiemeService.reserver(jour, mois);
				break;
			default:
				throw new IllegalArgumentException("Restaurant limité à deux services");
			}

			if (reservationOK) {
				reservation = new ReservationRestaurant(jour, mois, numService, getIdentification());
			}

			return reservation;
		}
	}

	// FIN CLASSE INTERNE//////////////////////////////////////////////////
	public void ajouterTable(int nbChaise) {
		Table table = new Table(nbChaise);
		int nbEntite = centrale.ajouterEntite(table);
		table.setIdentification(nbEntite);
	}

	@Override
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilitees(formulaire);
	}

	@Override
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		return centrale.reserver(numEntite, formulaire);
	}
}
