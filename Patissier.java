import java.util.*;

class Patissier extends Patissiers
{   
    private String Nom;

    public String Type;
    public Ingredient Topping;
    public Ingredient Gout;
    public Ingredient Supplement = null;

    Vector<Recette> ListeRecette = new Vector<>();
    Recette recetteChoux = new Recette(Type, Topping, Gout, Supplement); // Pour contourner les problemes de static 
    Recette recetteTarte = new Recette(Type, Topping, Gout, Supplement);


    public Patissier()
    { 
        super();
    }

    public Patissier(String Nom)
    {
        this.Nom = Nom;
    }

    public String getNom()
    {
       return Nom;
    }

    public void Affiche()
    {
        System.out.println("Patissier : "+ Nom);
    }

    public Recette RecetteChoux(Ingredient Topping, Ingredient Gout, Ingredient Supplement)
    {
        recetteChoux.RecetteAjout(Topping, Gout, Supplement);
        return recetteChoux;
    }

    public Recette RecetteTarte(Ingredient Topping, Ingredient Gout, Ingredient Supplement)
    {
        recetteTarte.RecetteAjout(Topping, Gout, Supplement);
        return recetteTarte;
    }

    public Recette getRecetteChoux()
    {
        return recetteChoux;
    }

    public Recette getRecetteTarte()
    {
        return recetteTarte;
    }
}