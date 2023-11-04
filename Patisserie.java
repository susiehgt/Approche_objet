import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Patisserie {


    public static void ajoutIngredients(Vector<Ingredients> ListeIngredients){
    
        Ingredients Pomme = new Ingredients("Pomme", "Fermier", 30, 2.0);
        ListeIngredients.addElement(Pomme);
        Ingredients Abricot = new Ingredients("Abricot", "Fermier", 30, 2.0);
        ListeIngredients.addElement(Abricot);
        Ingredients Vanille = new Ingredients("Vanille", "Fermier", 100, 0.5);
        ListeIngredients.addElement(Vanille);
        Ingredients Chocolat = new Ingredients("Chocolat", "Fermier", 100, 0.5);
        ListeIngredients.addElement(Chocolat);
        Ingredients Chantilly = new Ingredients("Chantilly", "Fermier", 100, 0.5);
        ListeIngredients.addElement(Chantilly);
        Ingredients Noisette = new Ingredients("Noisette", "Fermier", 200, 1.0);
        ListeIngredients.addElement(Noisette);
        Ingredients Amande = new Ingredients("Amande", "Fermier", 200, 1.0);
        ListeIngredients.addElement(Amande);

        }


	public static void AfficherIngredients(Vector<Ingredients> ListeIngredients)
    {
        System.out.println("Affichage de tous les ingredients");
        for (Iterator e= ListeIngredients.iterator();e.hasNext();)
            {
            Ingredients item = (Ingredients) e.next();
            item.infoIngredient();
            }
    }


    public static void AjoutIngrédient(Vector<Ingredients> ListeIngredients){
        System.out.println("Donnez le nom de l'ingrédient à ajouter");
        String repNom=saisieChaine();
        System.out.println("Donnez le fournisseur de l'ingrédient à ajouter");
        String repFournisseur=saisieChaine();
        System.out.println("Donnez le prix de l'ingrédient à ajouter");
        double repPrix=saisieEntier();
        System.out.println("Donnez le stock de l'ingrédient à ajouter");
        int repStock=saisieEntier();
        
        Ingredients newIngredient= new Ingredients(repNom, repFournisseur, repStock, repPrix);
        ListeIngredients.addElement(newIngredient);

    }

    public static String saisieChaine(){
	try {
	    BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
	    String chaine=buff.readLine();
	    return chaine;
	}
	catch (IOException e) {
	    System.out.println("impossible de travailler"+e);
	    return null;
	}
}
    
public static int saisieEntier(){
	try {
	    BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
	    String chaine = buff.readLine();
	    int num=Integer.parseInt(chaine);
	    return num;
	}
	catch (IOException e) {return 0;}
    }
}
