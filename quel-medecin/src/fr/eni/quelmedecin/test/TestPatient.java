package fr.eni.quelmedecin.test;

import java.time.LocalDate;

import fr.eni.quelmedecin.bo.Patient;

public class TestPatient {

	public static void main(String[] args) {
		System.out.println("__________________________ Patient _______________________________");
		/*Patient hillary = new Patient();
		/*hillary.setNom("Vambuce");
		hillary.setPrenom("Hillary");
		hillary.setNumeroDeTelephone("0123456789");
		hillary.setSexe('F');
		hillary.setNumSecu(287060244010154l);
		hillary.setDateNaissance(LocalDate.of(1987, 6, 2));
		hillary.setCommentaires("Allergie aux arachides");*/
		/*Patient ines = new Patient();
		/*ines.setNom("Perret");
		ines.setPrenom("Inès");
		ines.setNumeroDeTelephone("0698745123");
		ines.setSexe('F');
		ines.setNumSecu(245021067034521l);
		ines.setDateNaissance(LocalDate.of(1945, 2, 10));
		ines.setCommentaires(null);*/
		
		/*Patient adhemar = new Patient();
		/*adhemar.setNom("Pamamobe");
		adhemar.setPrenom("Adhémar");
		adhemar.setNumeroDeTelephone("0753428619");
		adhemar.setSexe('M');
		adhemar.setNumSecu(192112192020142l);
		adhemar.setDateNaissance(LocalDate.of(1992, 11, 21));
		adhemar.setCommentaires(null);*/
		
		//Création d'une instance de patient
		
		Patient p1 = new Patient("Vambuce", "Hillary", "0123456789", 'F',
				287060244010154l, LocalDate.of(1987, 6, 2), "Allergie aux arachides");
		p1.afficher();
		Patient p2 = new Patient("Perret", "Inès", "0753428619", 'M',
				245021067034521l, LocalDate.of(1945, 2, 10), null);
		
		Patient p3 = new Patient("Pamamobe", "Adhémar", "0698745123", 'F',
				192112192020142l, LocalDate.of(1992, 11, 21), null);
		
		
		System.out.println("------------------------------------------------------------------");
		p2.afficher();
		System.out.println("------------------------------------------------------------------");
		p3.afficher();
		

	}
}
