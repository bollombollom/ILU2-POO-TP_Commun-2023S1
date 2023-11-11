package interface_noyau_fonctionnel;

import java.time.LocalDate;

public class InterfaceNoyauFonctionnel {

    public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
        return new String[]{"Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6"};
    }

    public void performReservation(LocalDate date, String time, int nbPersons, int numTable) {
        System.out.println(String.format("Reservation efféctuée %s %s %d %d", date.toString(), time, nbPersons, numTable));
    }

}
