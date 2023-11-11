/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import java.awt.EventQueue;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import presentation.FrameReservation;

public class DialogReservation {

	private FrameReservation frameReservation;
	private InterfaceNoyauFonctionnel inf;

	private LocalDate date;
	private String time;
	private int nbPersons;
	private int numTable = -1;

	public DialogReservation(InterfaceNoyauFonctionnel inf) {
		this.inf = inf;
	}

	public void initDialog() {
		frameReservation = new FrameReservation();
		frameReservation.initFrame();
		frameReservation.setDialog(this);
		frameReservation.setVisible(true);
	}

	public void handleDateSelectedEvent(LocalDate date) {
		this.date = date;
		frameReservation.enableHeure();
	}

	public void handleTimeSelectedEvent(String time) {
		this.time = time;
		frameReservation.enableNombrePersonnes();
	}

	public void handleNumOfPersonsSelectedEvent(int nbPersons) {
		this.nbPersons = nbPersons;
		frameReservation.enableTableSelection();
	}

	public void handleTableSelectedEvent(int numTable) {
		this.numTable = numTable;
		frameReservation.enableValider();
	}

	public void handleCancelEvent() {
		date = null;
		time = "";
		nbPersons = 0;
		numTable = -1;
		frameReservation.raz();

	}

	public void handleValidationEvent() {
		inf.performReservation(date, time, nbPersons, numTable);
		JOptionPane.showMessageDialog(frameReservation,
				String.format("Réservation effectuée pour le %s%n à %s pour %d personnes %nà la table %d",
						date.toString(), time, nbPersons, numTable));
		frameReservation.raz();
	}

	public String[] getTables() {
		return inf.trouverTableDisponible(date.getDayOfMonth(), date.getMonthValue(), nbPersons, time);
	}

	public static void main(String[] args) {
		DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
		EventQueue.invokeLater(() -> {
			dialog.initDialog();
		});
	}

}
