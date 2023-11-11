package model;

// TP5-6 b Q1
public class CalendrierAnnuel {
	// classe interne
	private static class Mois {
		String nom;
		boolean[] jours;

		private Mois(String nom, int nbJours) {
			jours = new boolean[nbJours];
			this.nom = nom;
		}

		// attention les jours se comptent 1, 2, ..., 31 !
		private boolean estLibre(int jour) {
			return !jours[jour - 1];
		}

		private void reserver(int jour) {
			if (jour <= 0 || jour > jours.length || jours[jour - 1]) {
				throw new IllegalStateException("Problème sur la réservation du jour " + jour);
			}
			jours[jour - 1] = true;
		}
	}

	private Mois[] calendrier = new Mois[12];

	public CalendrierAnnuel() {
		calendrier[0] = new Mois("janvier", 31);
		calendrier[1] = new Mois("février", 28);
		calendrier[2] = new Mois("mars", 31);
		calendrier[3] = new Mois("avril", 30);
		calendrier[4] = new Mois("mai", 31);
		calendrier[5] = new Mois("juin", 30);
		calendrier[6] = new Mois("juillet", 31);
		calendrier[7] = new Mois("aout", 31);
		calendrier[8] = new Mois("septembre", 30);
		calendrier[9] = new Mois("octobre", 31);
		calendrier[10] = new Mois("novembre", 30);
		calendrier[11] = new Mois("décembre", 31);
	}

	public boolean estLibre(int jour, int mois) {
		return calendrier[mois - 1].estLibre(jour);
	}

	public boolean reserver(int jour, int mois) {
		boolean libre = calendrier[mois - 1].estLibre(jour);
		if (libre) {
			calendrier[mois - 1].reserver(jour);
		}
		return libre;
	}
}
