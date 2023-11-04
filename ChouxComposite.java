import java.util.*;

class ChouxComposite extends Ingredients
{
    static double PrixTotal;
    static double PrixChouxBase = 1.00;
    static List<Ingredient> CompositionChoux = new ArrayList<Ingredient>();
    Vector<Ingredient> ListeIngredients = new Vector<>();
    //Vector <Patissier> ListePatissiers = new Vector<>();

    public double getPrix()
    {
        PrixTotal = PrixChouxBase;
        for (Ingredient c : CompositionChoux)
        {
            PrixTotal = PrixTotal + c.getPrix();
        }
        return PrixTotal;
    }

    public void addIngredients(Vector<Ingredient> ListeIngredients)// Partie qui ajoute les ingredients au choux suivant le modele composite
    {
        AjoutIngredients(ListeIngredients);
        for (Iterator<Ingredient> e= ListeIngredients.iterator();e.hasNext();)
            {
            Ingredient item = (Ingredient) e.next();
            item.Affiche();
            CompositionChoux.add(item);
            getPrix();
            Affiche();
            }
    }

    public void Affiche()
    {
        System.out.println("Prix = " + PrixTotal);
    }

    public static void AjoutIngredients(Vector<Ingredient> ListeIngredients) // A supprimer remplace l'accès au vecteur ingrédient
    {
        Ingredient CremeVanille = new Ingredient("CremeVanille", 1.0, 5);
        ListeIngredients.addElement(CremeVanille);

        Ingredient CremeChoco = new Ingredient("CremeChoco", 1.0, 1);
        ListeIngredients.addElement(CremeChoco);

        Ingredient Chantilly = new Ingredient("Chantilly", 0.50, 3);
        ListeIngredients.addElement(Chantilly);

        System.out.println("Stock des ingredients pour les choux remplis!");
    }

}
