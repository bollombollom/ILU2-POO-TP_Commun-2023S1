package test_fonctionnel;

import control.ControlConnecterClient;
import control.ControlCreerClient;
import control.ControlReserverTable;
import frontiere.BoundaryConnecterClient;
import frontiere.BoundaryCreerClient;
import frontiere.BoundaryReserverTable;
import model.CarnetClientele;
import model.Restaurant;

public class TestReserverTable {
	public static void main(String[] args) {

		System.out.println("---------- CREATION CLIENT ----------");
		// Création carnetClient
		CarnetClientele carnetClientele = new CarnetClientele();
		//
		ControlCreerClient controlCreerClient = new ControlCreerClient(carnetClientele);
		BoundaryCreerClient boundaryCreerClient = new BoundaryCreerClient(controlCreerClient);
		boundaryCreerClient.creerClient();

		System.out.println("\n---------- CONNECTION CLIENT ----------");
		ControlConnecterClient controlConnecterClient = new ControlConnecterClient(carnetClientele);
		BoundaryConnecterClient boundaryConnecterClient = new BoundaryConnecterClient(controlConnecterClient);
		int numClient = boundaryConnecterClient.connecterClient();

		System.out.println("\n---------- RESERVER TABLE ----------");
		// Creation et configuration du restaurant
		Restaurant restaurant = new Restaurant();
		restaurant.ajouterTable(2);
		restaurant.ajouterTable(3);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(5);
		restaurant.ajouterTable(6);
		restaurant.ajouterTable(6);
		restaurant.ajouterTable(8);
		//
		ControlReserverTable controlReserverTable = new ControlReserverTable(restaurant, carnetClientele);
		BoundaryReserverTable boundaryReserverTable = new BoundaryReserverTable(controlReserverTable);
		boundaryReserverTable.reserverTable(numClient);

		// control des données
		System.out.println("---------- CONTROL DES DONNEES ----------");
		System.out.println(carnetClientele);

	}
}
