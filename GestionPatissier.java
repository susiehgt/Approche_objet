import java.util.*;
import java.io.*;

public class GestionPatissier
{
    public String Nom;
    Vector<Patissier> ListePatissiers = new Vector<>();
    Vector<Ingredient> LesIngredients = new Vector<>();
    Recette LarecetteChoux = new Recette(Nom, null, null, null);
    Recette LarecetteTarte = new Recette(Nom, null, null, null);

    public GestionPatissier(String Nom)
    {
        this.Nom = Nom;
    }

    public void gererPatissiers()
    {
        while(true)
	    {
		MenuGestion();
		int reponse = saisie_entier();
		switch (reponse)
		    {
		    case 1 : AjoutPatissiers(ListePatissiers);break;
			case 2 : AfficherPatissiers(ListePatissiers);break;
            case 3 : AjoutRecetteChoux(ListePatissiers, "Susie");break;
            case 4 : AjoutRecetteTarte(ListePatissiers, "Candice");break; 
		    case 0 : return;
		    default:
			System.out.println("Option inexistante: veuillez recommencer");
		    }
	    }

    }

    public static void AjoutPatissiers(Vector<Patissier> ListePatissiers)
    {
        Patissier unPatissier = new Patissier("Susie");
        ListePatissiers.addElement(unPatissier);

        Patissier unAutrePatissier = new Patissier("Candice");
        ListePatissiers.addElement(unAutrePatissier);

        System.out.println("Les patissiers ont ete ajoutes");
    }

    public static void AfficherPatissiers(Vector<Patissier> ListePatissiers)
    {
        System.out.println("Affichage de tous les patissiers");
        for (Iterator<Patissier> e= ListePatissiers.iterator();e.hasNext();)
            {
            Patissier item = (Patissier) e.next();
            item.Affiche();
	    }
    }

    public static void AccesPatissier(Vector<Patissier> ListePatissiers)
    {
        for (Iterator<Patissier> e= ListePatissiers.iterator();e.hasNext();)
            {
            Patissier item = (Patissier) e.next();
            item.getNom();
	    }
    }

    public static void AjoutRecetteChoux(Vector<Patissier> ListePatissiers, String NomPatissier)
    {
        for (Iterator<Patissier> e= ListePatissiers.iterator();e.hasNext();)
	    {
			Patissier item = (Patissier) e.next();
		if (NomPatissier.equals(item.getNom()
			      ))
		    {
			item.RecetteChoux(null, null, null);
		    }
	    }	
    }

    public static void AjoutRecetteTarte(Vector<Patissier> ListePatissiers, String NomPatissier)
    {
        for (Iterator<Patissier> e= ListePatissiers.iterator();e.hasNext();)
	    {
			Patissier item = (Patissier) e.next();
		if (NomPatissier.equals(item.getNom()
			      ))
		    {
			item.RecetteTarte(null, null, null);
		    }
	    }	
    }

    public Recette getRecetteChoux(Vector<Patissier> ListePatissiers, String NomPatissier)
    {
        for (Iterator<Patissier> e= ListePatissiers.iterator();e.hasNext();)
	    {
			Patissier item = (Patissier) e.next();
		    if (NomPatissier.equals(item.getNom()))
		    {
			LarecetteChoux = item.getRecetteChoux();
		    }
	    }
        return LarecetteChoux;
    }

    public Recette getRecetteTarte(Vector<Patissier> ListePatissiers, String NomPatissier)
    {
        for (Iterator<Patissier> e= ListePatissiers.iterator();e.hasNext();)
	    {
			Patissier item = (Patissier) e.next();
		    if (NomPatissier.equals(item.getNom()))
		    {
			LarecetteTarte = item.getRecetteChoux();
		    }
	    }
        return LarecetteTarte;
    }

    public String getNomRH()
    {
        return Nom;
    }

    public static void MenuGestion()
    {
        System.out.println("Gestion des patissiers");
        System.out.println("Que voulez-vous faire?");
        System.out.println("1 \t Creer les patissiers");
        System.out.println("2 \t Afficher les patissiers");
        System.out.println("3 \t Acceder a un patisser");
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