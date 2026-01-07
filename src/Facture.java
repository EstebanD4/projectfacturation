import java.util.Date;

public class Facture
{
    private String numeroFacture;
    private String nomEntreprise;
    private String nomClient;
    private String date;
    private float prixHT;
    private float prixTTC;

    public Facture()
    {
        this.numeroFacture = "";
        this.nomEntreprise = "";
        this.nomClient = "";
        this.date = "";
        this.prixHT = 0.0F;
        this.prixTTC = 0.0F;
    }

    public Facture(String numFacture, String nomEntreprise, String nomClient, String date, float prixHT, float prixTTC)
    {
        this.numeroFacture = numFacture;
        this.nomEntreprise = nomEntreprise;
        this.nomClient = nomClient;
        this.date = date;
        this.prixHT = prixHT;
        this.prixTTC = prixTTC;
    }

    public String getNumeroFacture()
    {
        return numeroFacture;
    }
    public void setNumeroFacture(String numFacture)
    {
        this.numeroFacture = numFacture;
    }

    public String getNomEntreprise()
    {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise)
    {
        this.nomEntreprise = nomEntreprise;
    }

    public String getNomClient()
    {
        return nomClient;
    }

    public void setNomClient(String nomClient)
    {
        this.nomClient = nomClient;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public float getPrixHT()
    {
        return prixHT;
    }

    public void setPrixHT(float prix)
    {
        this.prixHT = prix;
    }

    public float getPrixTTC()
    {
        return prixTTC;
    }

    public void setPrixTTC(float prix)
    {
        this.prixHT = prix;
    }
}
