import java.util.Vector;
import database.Connexion;
import database.Requete;

public class Main
{
    public static void main(String[] args)
    {
        // ***** [CLIENT] *****
        Client client1 = new Client("Alice", "Smith", "alicesmith@gmail.com", "9876543210");
        Client client2 = new Client("Bob", "Johnson", "bobjohnson@gmail.com", "8765432109");

        Vector<Client> clientVec = new Vector();
        clientVec.add(client1);
        clientVec.add(client2);

        // ***** [PRODUIT] *****
        Produit produit1 = new Produit("Ordinateur", "Electronique", 1000.0F, 5, "Ordinateur Gamer", 0.2F);
        Produit produit2 = new Produit("Switch", "Electronique", 750.0F, 5, "Switch 2GB/s", 0.2F);

        // ***** [FACTURE] *****
        Facture facture1 = new Facture("00001", "EntrepriseA", "Alice", "07-01-2026", produit1.getPrixHT(), produit1.calculPrixTTC());
        Facture facture2 = new Facture("00002", "EntrepriseB", "Bob", "07-01-2026", produit2.getPrixHT(), produit2.calculPrixTTC());

        Vector<Facture> factureVec = new Vector();
        factureVec.add(facture1);
        factureVec.add(facture2);

        // ***** [CONNEXION] *****
        Connexion connect = new Connexion();

        // ***** [REQUETE] *****
        Requete req = new Requete();

        System.out.println("Bienvenue sur la page client de notre application!");
        System.out.println("Information Client:");
        System.out.println();
        System.out.println("Nombre de clients: " + clientVec.size());

        for (int i = 0; i < clientVec.size(); i++ )
        {
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Client " + (i+1));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Nom: " + clientVec.get(i).getLastName());
            System.out.println("Prenom: " + clientVec.get(i).getFirstName());
            System.out.println("Email: " + clientVec.get(i).getEmail());
            System.out.println("Num de tel: " + clientVec.get(i).getPhoneNumber());
        }

        for (int i = 0; i < factureVec.size(); i++ )
        {
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Facture " + (i+1));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Numéro Facture: " + factureVec.get(i).getNumeroFacture());
            System.out.println("Nom Entreprise: " + factureVec.get(i).getNomEntreprise());
            System.out.println("Nom Client: " + factureVec.get(i).getNomClient());
            System.out.println("Date : " + factureVec.get(i).getDate());
            System.out.println("Prix HT: " + factureVec.get(i).getPrixHT());
            System.out.println("Prix TTC: " + factureVec.get(i).getPrixTTC());
        }


        connect.connect();
        Vector<Vector<String>> resultat;

        resultat = connect.sendRequest(req.selectRequest("client"));
        for (int i = 0; i < resultat.size(); i++)
        {
            System.out.println("Résultat de la requête " + (i+1) + ": " + resultat.get(i));
        }
        System.out.println(resultat.get(0).get(2));

        resultat.clear();

        resultat = connect.sendRequest(req.selectRequest("entreprise"));
        for (int i = 0; i < resultat.size(); i++)
        {
            System.out.println("Résultat de la requête " + (i+1) + ": " + resultat.get(i));
        }
        System.out.println(resultat.get(0).get(2));

        resultat.clear();

        resultat = connect.sendRequest(req.selectRequest("facture"));
        for (int i = 0; i < resultat.size(); i++)
        {
            System.out.println("Résultat de la requête " + (i+1) + ": " + resultat.get(i));
        }
        System.out.println(resultat.get(0).get(2));

        resultat.clear();

        resultat = connect.sendRequest(req.selectFactureByClient("facture", "1"));
        for (int i = 0; i < resultat.size(); i++)
        {
            System.out.println("Résultat de la requête " + (i+1) + ": " + resultat.get(i));
        }

        resultat.clear();

        resultat = connect.sendRequest(req.getClient("client", "1"));
        System.out.println("Résultat de la requête pour le client 1: " + resultat.get(0));

        connect.close();
    }
}