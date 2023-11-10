package fr.eni.quelmedecin.bo;

/**
 * Classe permettant de créer des instances de médecins
 */
public class MedecinGeneraliste {
 
	//Attributs d'instances 
	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	
	//ajout d'un attribut adresse
	private Adresse adresse;
	
	//Attributs de classe 
	
	private static int tarif = 25;
	
	
	//Constructeur qui initialise tous les attributs
	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
		setNom(nom);
		setPrenom(prenom);
		setNumeroDeTelephone(numeroDeTelephone);
		//initialise l'attribut adresse
		setAdresse(adresse);
	}
	
	//méthodes getters et setters

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public static int getTarif() {
		return tarif;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}
	
	
	//Genere getter et setter pour adresse
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	//affichage


	/**
	 *Méthode permettant d'afficher l'état d'un médecin 
	 */
	public void afficher() {
		System.out.println(nom + ' ' + prenom);
		System.out.println("Numero de téléphone : " + numeroDeTelephone);
		System.out.println("tTarif : "+ tarif + "€");
		//afficher l'adresse
		adresse.afficher();
		
	}

}
