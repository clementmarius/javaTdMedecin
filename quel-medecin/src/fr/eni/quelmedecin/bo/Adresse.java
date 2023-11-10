package fr.eni.quelmedecin.bo;

public class Adresse {
	
	
	//Attributs d'instances type chaine de caractères
private String complementaires;
private String complementNumeroRue;
private String rue;
private String ville;

//Attributs d'instances type entier
private int numeroVoie;
private int codePostal;

//constructeur qui initialise tous les attributs 
public Adresse(String complementaires,int numeroVoie, String complementNumeroRue, String rue, int codePostal, String ville ) {
	this.complementaires=complementaires;
	this.numeroVoie=numeroVoie;
	this.complementNumeroRue=complementNumeroRue;
	this.rue=rue;
	this.codePostal=codePostal;
	this.ville=ville;
}

//constructeur sans les mentions complémentaires initialisées à la valeur null 
public Adresse(int numeroVoie,String complementNumeroRue, String rue, int codePostal, String ville ) {
	this.numeroVoie=numeroVoie;
	this.complementNumeroRue=complementNumeroRue;
	this.rue=rue;
	this.codePostal=codePostal;
	this.ville=ville;
}

//Getter et Setter

public String getComplementaires() {
	return complementaires;
}

public void setComplementaires(String complementaires) {
	this.complementaires = complementaires;
}

public String getComplementNumeroRue() {
	return complementNumeroRue;
}

public void setComplementNumeroRue(String complementNumeroRue) {
	this.complementNumeroRue = complementNumeroRue;
}

public String getRue() {
	return rue;
}

public void setRue(String rue) {
	this.rue = rue;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public int getNumeroVoie() {
	return numeroVoie;
}

public void setNumeroVoie(int numeroVoie) {
	this.numeroVoie = numeroVoie;
}

public int getCodePostal() {
	return codePostal;
}

public void setCodePostal(int codePostal) {
	this.codePostal = codePostal;
}

//Methode afficher

public void afficher() {
	System.out.println(complementaires == null ? " " : complementaires);
	System.out.println(numeroVoie +(complementNumeroRue == null ? " " : complementNumeroRue) + " " + rue);
	System.out.println(String.format("%05d", codePostal) + " " + ville);
}


}
