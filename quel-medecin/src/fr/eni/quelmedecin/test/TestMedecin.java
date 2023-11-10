package fr.eni.quelmedecin.test;

import fr.eni.quelmedecin.bo.MedecinGeneraliste;

public class TestMedecin {

	public static void main(String[] args) {
		System.out.println("__________________________ Médecins ______________________________");
		/*MedecinGeneraliste melanie = new MedecinGeneraliste();
		melanie.setNom("Malalaniche");
		melanie.setPrenom("Mélanie");
		melanie.setNumeroDeTelephone("02.28.03.17.28");*/
		
		/*MedecinGeneraliste edmond = new MedecinGeneraliste();
		edmond.setNom("Bosapin");
		edmond.setPrenom("Edmond");
		edmond.setNumeroDeTelephone("+33 2 17 18 19 20");*/
		
		/*MedecinGeneraliste djemila = new MedecinGeneraliste();
		djemila.setNom("Table");
		djemila.setPrenom("Djémila");
		djemila.setNumeroDeTelephone("03-04-05-06-07");*/
		
		MedecinGeneraliste m1 = new MedecinGeneraliste("Mélanie", "Malalaniche", "02.28.03.17.28", 0);
		m1.afficher();
		
		MedecinGeneraliste m2 = new MedecinGeneraliste("Edmond", "Bosapin", "+33 2 17 18 19 20", 0);
		m2.afficher();
		
		MedecinGeneraliste m3 = new MedecinGeneraliste("Djémila", "Table", "03-04-05-06-07", 0);
		m3.afficher();
		
		System.out.println("------------------------------------------------------------------");
		m2.afficher();
		System.out.println("------------------------------------------------------------------");
		m3.afficher();

		System.out.println("--------------- Changement du numéro de ce médecin ---------------");
		m3.setNumeroDeTelephone("07-06-05-04-03");
		System.out.printf("Nouveau numéro du Dr %s : %s%n", m3.getNom(), m3.getNumeroDeTelephone());
		
		System.out.println("-------------- Changement du prix de la consultation -------------");
		MedecinGeneraliste.setTarif(23);
		m1.afficher();
		System.out.println("------------------------------------------------------------------");
		m2.afficher();
		System.out.println("------------------------------------------------------------------");
		m3.afficher();
	}
}
