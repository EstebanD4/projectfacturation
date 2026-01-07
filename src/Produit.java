public class Produit {
    private String nomProduit;
    private  String categorie;
    private float prixHT;
    private int quantite;
    private String description;
    private float tva;
    private float prixTTC;

    public Produit()
    {
        this.nomProduit="none";
        this.categorie="none";
        this.prixHT= 0.0F;
        this.quantite=0;
        this.description="none";
        this.tva = 0.2F;
    }

    public Produit(String nomProduit, String categorie, float prixHT, int quantite, String description, float tva)
    {
        this.nomProduit = nomProduit;
        this.categorie = categorie;
        this.prixHT= prixHT;
        this.quantite = quantite;
        this.description=description;
        this.tva = tva;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public float getPrixHT() {
        return prixHT;
    }

    public  void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }

    public  int getQuantite() {
        return  quantite;
    }

    public  void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void  setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public float getTva() {
        return tva;
    }

    public  void setTva(float tva) {
        this.tva = tva;
    }
    
    public float calculPrixTTC()
    {
        return prixTTC = prixHT + (prixHT * tva);
    }


    public float getPrixTTC()
    {
        return prixTTC;
    }

    /*public  void setPrixTTC(float prixTTC) {
        this.prixTTC = prixTTC;
    }*/
}
