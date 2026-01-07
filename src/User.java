public class User
{
    private String identifiant;
    private String motDePasse;
    private String nom;
    private String adresse;
    private String email;
    private String numeroTelephone;

    public User(String identifiant, String motDePasse, String nom, String adresse, String email, String numeroTelephone)
    {
        this.identifiant = "none";
        this.motDePasse = "none";
        this.nom = "none";
        this.adresse = "none";
        this.email = "none";
        this.numeroTelephone = "none";

    }
    public String getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumeroTelephone() {
        return numeroTelephone;
    }
    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}