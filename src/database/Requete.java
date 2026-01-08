package database;

public class Requete
{
    private String requete;

    public Requete()
    {
        this.requete = "";
    }

    public String selectRequest(String table)
    {
        System.out.println("Table : " + table);
        return this.requete = "SELECT * FROM " + table + ";";
    }

    public String selectFactureByClient(String table, String idClient)
    {
        System.out.println("Table : " + table);
        return this.requete = "SELECT * FROM " + table + " WHERE idClient = '" + idClient + "';";
    }

    public String getClient(String table, String idClient)
    {
        System.out.println("Table : " + table);
        return this.requete = "SELECT 'Prenom' FROM " + table + " WHERE idClient = '" + idClient + "';";
    }
}
