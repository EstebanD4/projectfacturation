public class Particulier extends User {
    private String prenom;

    public Particulier(String identifiant, String motDePasse, String nom, String adresse, String email, String numeroTelephone, String prenom, String nomDeFamille) {
        super(identifiant, motDePasse, nom, adresse, email, numeroTelephone);
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
