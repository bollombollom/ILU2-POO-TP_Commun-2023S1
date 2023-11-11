package frontiere;

import java.util.Scanner;

import control.ControlConnecterClient;

public class BoundaryConnecterClient {
	private ControlConnecterClient controlConnecterClient;
	private Scanner scanner = new Scanner(System.in);

	public BoundaryConnecterClient(ControlConnecterClient controlConnecterClient) {
		this.controlConnecterClient = controlConnecterClient;
	}

	// TODO: remplacer Mockup par scanner.next()
	public int connecterClient() {
		System.out.println("Adresse mail : ");
		String adresseMail = Mockup.giveValueIfDebug("mail");
		System.out.println("Mot de passe : ");
		String mdp = Mockup.giveValueIfDebug("pwd");
		int numClient = controlConnecterClient.connecterClient(adresseMail, mdp);
		if (numClient != -1) {
			System.out.println("Vous êtes connecté");
		} else {
			System.out.println("Votre mail ou votre mot de passe est erroné");
		}
		return numClient;
	}
}