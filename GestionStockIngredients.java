import java.util.*;
import java.io.*;

public class GestionStockIngredients
{
    public String Nom;
    Vector<Ingredient> ListeIngredients = new Vector<>();

    public GestionStockIngredients(String Nom)
    {
        this.Nom = Nom;
    }

    public static void AjoutIngredients(Vector<Ingredient> ListeIngredients)
    {
        Ingredient CremeVanille = new Ingredient("CremeVanille", 1.0, 5);
        ListeIngredients.addElement(CremeVanille);

        Ingredient CremeChoco = new Ingredient("CremeChoco", 1.0, 1);
        ListeIngredients.addElement(CremeChoco);

        Ingredient Chantilly = new Ingredient("Chantilly", 0.50, 3);
        ListeIngredients.addElement(Chantilly);

        Ingredient Noisette = new Ingredient("Noisette", 0.50, 3);
        ListeIngredients.addElement(Noisette);

        Ingredient Amande = new Ingredient("Amande", 0.50, 3);
        ListeIngredients.addElement(Amande);

        Ingredient Pomme = new Ingredient("Pomme", 3.00, 3);
        ListeIngredients.addElement(Pomme);

        Ingredient Abricot = new Ingredient("Abricot", 4.0, 3);
        ListeIngredients.addElement(Abricot);

        Ingredient Meringue = new Ingredient("Meringue", 2.0, 3);
        ListeIngredients.addElement(Meringue);

        System.out.println("Stock des ingredients pour les choux remplis!");
    }

    public static void AfficherIngredient(Vector<Ingredient> ListeIngredients)
    {
        System.out.println("Affichage de tous les ingredients disponibles");
        for (Iterator<Ingredient> e= ListeIngredients.iterator();e.hasNext();)
            {
            Ingredient item = (Ingredient) e.next();
            item.Affiche();
	    }
    }

    public void gererStock()
    {
        while(true)
	    {
		MenuGestion();
		int reponse = saisie_entier();
		switch (reponse)
		    {
		    case 1 : AjoutIngredients(ListeIngredients);break;
			case 2 : AfficherIngredient(ListeIngredients);break;
		    case 0 : return;
		    default:
			System.out.println("Option inexistante: veuillez recommencer");
		    }
	    }

    }

    public String getNomStock()
    {
        return Nom;
    }

    public static void MenuGestion()
    {
        System.out.println("Gestion des stocks");
        System.out.println("Que voulez-vous faire?");
        System.out.println("1 \t Remplir les ingredients du stock choux");
        System.out.println("2 \t Afficher les ingredients du stock choux");
        System.out.println("3 \t Remplir les ingredients du stock tarte");
        System.out.println("0 \t Sortir de la gestion des stocks");
    }

    public static int saisie_entier()
    {
	try
	    {
	    BufferedReader buff = new BufferedReader(
						     new InputStreamReader(System.in));
	    String chaine = buff.readLine();
	    int num= Integer.parseInt(chaine);
	    return num;
	    }
	catch(IOException e)
	    {
	    System.out.println("impossible de travailler"+e);
	    return -1;
	    }
    } 
}