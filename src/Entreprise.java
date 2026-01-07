public class Entreprise extends User
{
    private String nomEntreprise;
    private String NumSiret;
    private String RaisonSociale;

    public Entreprise(String identifiant, String motDePasse, String nom, String adresse, String email, String numeroTelephone, String nomEntreprise) {
        super(identifiant, motDePasse, nom, adresse, email, numeroTelephone);
        this.nomEntreprise = "nomEntreprise";
        this.NumSiret = "78467169500095";
        this.RaisonSociale = "none";
    }


    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getNumSiret() {
        return NumSiret;
    }

    public void setNumSiret(String numSiret) {
        this.NumSiret = numSiret;
    }

    public String getRaisonSociale() {
        return RaisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.RaisonSociale = raisonSociale;
    }

}
