package fr.eni.quelmedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient {

	// attributs d'instance
	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private char sexe;
	private long numSecu;
	private LocalDate dateNaissance;
	private String commentaires;
	// ajout d'un attribut adresse
	private Adresse adresse;

	// Constructeur par defaut
	public Patient() {

	}

	// Constructeur qui initialise tous les attributs
	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu,
			LocalDate dateNaissance, String commentaires, Adresse adresse) {
		setNom(nom);
		setPrenom(prenom);
		setNumeroDeTelephone(numeroDeTelephone);
		setSexe(sexe);
		setNumSecu(numSecu);
		setDateNaissance(dateNaissance);
		setCommentaires(commentaires);
		setAdresse(adresse);
	}

	// génération accesseurs/mutateurs (getter and setter) générer avec eclipse
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public long getNumSecu() {
		return numSecu;
	}

	public void setNumSecu(long numSecu) {
		this.numSecu = numSecu;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	
	


	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	// méthode d'instance
	public void afficher() {
		System.out.println(nom + ' ' + prenom);
		System.out.println("Numero de téléphone : " + numeroDeTelephone);
		if (this.sexe == 'F')
			System.out.println("Sexe : Féminin");
		else {
			System.out.println("Sexe : Masculin");
		}
		System.out.println("Numéro de sécurité : " + numSecu);
		System.out.println("Date de naissance : " + dateFormateur(dateNaissance));

		if (this.commentaires == null) {
			System.out.println("Commentaires : [aucun commentaire]");
		} else {
			System.out.println("Commentaires : " + commentaires);
		}
		adresse.afficher();
		
	}

	private String dateFormateur(LocalDate date) {
		DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("d MMM yyyy");
		String dateFormater = date.format(customFormatter);

		return dateFormater;
	}
}