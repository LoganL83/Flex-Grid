package testfilm;

public class Application {

	public static void main(String[] args) {

		Horreur scary = new Horreur();
		scary.setNom("La maison des horreurs ");
		scary.setAnnee(1950);
		scary.setDuree(120);
		scary.setCouleur(false);
		scary.setProduction("Horror Production");
		scary.setRestrictionAge(18);
		scary.setNote(14);

		System.out.println("Le film " + scary.getNom() + "sorti en " + scary.getAnnee() + " a une duree de "
				+ scary.getDuree() + " min.");

		Comedie comedy = new Comedie();
		comedy.setNom("Laught");
		comedy.setComedieAction(true);
		comedy.setAnnee(2018);
		comedy.setDuree(160);
		comedy.setCouleur(true);
		comedy.setProduction("Rire Prod");
		comedy.setNote(15);

		System.out.println("Le film " + comedy.getNom() + " sorti en " + comedy.getAnnee() + " a reçu la note de "
				+ comedy.getNote() + ".");

		SF sciencefiction = new SF();
		sciencefiction.setNom("L'autre univers");
		sciencefiction.setGenre("Post-apocalyptique");
		sciencefiction.setAnnee(2000);
		sciencefiction.setDuree(100);
		sciencefiction.setCouleur(true);
		sciencefiction.setProduction("SFX");
		sciencefiction.setNote(16);

		System.out.println("Le film " + sciencefiction.getNom() + " de genre " + sciencefiction.getGenre()
				+ " a été produit par " + sciencefiction.getProduction() + " en " + sciencefiction.getAnnee());
	}

}
