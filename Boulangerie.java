import java.util.*;
import java.io.*;

public class Boulangerie
{
    public static void main(String args[])
    {
		Vector<GestionStockIngredients> ListeIngredients = new Vector<>();
        Vector<Ingredient> LesIngredients = new Vector<>();
        Vector<GestionPatissier> ListePatissiers = new Vector<>();
        TarteComposite tarte = new TarteComposite(); // Pour contourner les problemes de static
        ChouxComposite choux = new ChouxComposite();

		String Nom_Stock = "StockBoulangerie";
        String Nom_RH = "RHBoulangerie";

        while(true)
	    {
		MenuBoulangerie();
		int reponse = saisie_entier();
		switch (reponse)
		    {
		    case 1 : creerStock(ListeIngredients,Nom_Stock);break;
            case 2 : accesStock(ListeIngredients,Nom_Stock);break;
            case 3 : creerPatissiers(ListePatissiers, Nom_RH);break;
            case 4 : accesRH(ListePatissiers, Nom_RH);break;
			case 5 : tarte.addIngredients(LesIngredients);break;
            case 6 : choux.addIngredients(LesIngredients);break;
		    case 0 : System.exit(0);
		    default:
			System.out.println("Option inexistante: veuillez recommencer");
		    }
	    }
    }

    public static void MenuBoulangerie()
    {
        System.out.println("Que voulez-vous faire?");
        System.out.println("1 \t Creer et acceder au stock");
        System.out.println("2 \t Acceder au stock");
        System.out.println("3 \t Creation du gestionnaire des patissiers");
        System.out.println("4 \t Acceder a la gestion des patissiers");
		System.out.println("5 \t Creer des Tartes");
        System.out.println("6 \t Creer des Choux");
        System.out.println("0 \t Sortir du programme");
    }

    public static void creerStock(Vector <GestionStockIngredients> ListeIngredients,String NomDuStock)
    {
	GestionStockIngredients item = null;
	item = new GestionStockIngredients(NomDuStock);
	if (item != null)
	ListeIngredients.addElement(item);
    }

	public static void accesStock(Vector <GestionStockIngredients> ListeIngredients, String NomDuStock)
    {
	for (Iterator<GestionStockIngredients> e= ListeIngredients.iterator();e.hasNext();)
	    {
			GestionStockIngredients item = (GestionStockIngredients) e.next();
		if (NomDuStock.equals(item.getNomStock()
			      ))
		    {
			item.gererStock();
		    }
	    }	
    }

    public static void creerPatissiers(Vector <GestionPatissier> ListePatissiers,String Nom_RH)
    {
        GestionPatissier item = null;
        item = new GestionPatissier(Nom_RH);
        if (item != null)
        ListePatissiers.addElement(item);
    }

	public static void accesRH(Vector <GestionPatissier> ListePatissiers, String Nom_RH)
    {
	for (Iterator<GestionPatissier> e= ListePatissiers.iterator();e.hasNext();)
	    {
			GestionPatissier item = (GestionPatissier) e.next();
		if (Nom_RH.equals(item.getNomRH()))
		    {
			    item.gererPatissiers();
		    }
	    }	
    }

    public static String saisie_chaine()
    {
	try
        {
	    BufferedReader buff = new BufferedReader(
				new InputStreamReader(System.in));
	    String chaine=buff.readLine();
	    return chaine;
	}
	catch(IOException e)
        {
	    System.out.println("Impossible de travailler" + e);
	    return null;
	}
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