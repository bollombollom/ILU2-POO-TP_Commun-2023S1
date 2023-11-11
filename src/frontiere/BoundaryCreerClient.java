package frontiere;

import java.util.Scanner;

import control.ControlCreerClient;

public class BoundaryCreerClient {
	private ControlCreerClient controlCreerClient;
	private Scanner scanner = new Scanner(System.in);

	public BoundaryCreerClient(ControlCreerClient controlCreerClient) {
		this.controlCreerClient = controlCreerClient;
	}

	// TODO : remplacer mockup par scanner.next()
	public void creerClient() {
		System.out.println("Nom : ");
		String nom = Mockup.giveValueIfDebug("nom");
		System.out.println("Prénom : ");
		String prenom = Mockup.giveValueIfDebug("prenom");
		System.out.println("Adresse mail : ");
		String adresseMail = Mockup.giveValueIfDebug("mail");
		System.out.println("Mot de Passe : ");
		String mdp = Mockup.giveValueIfDebug("pwd");
		controlCreerClient.creerClient(nom, prenom, adresseMail, mdp);
	}
}