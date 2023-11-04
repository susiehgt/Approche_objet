import java.util.*;

class TarteComposite extends Ingredients
{
    static double PrixTotal;
    static double PrixTarteBase = 10.00;
    static List<Ingredient> CompositionTarte = new ArrayList<Ingredient>();
    Vector<Ingredient> ListeIngredients = new Vector<>();
    //Vector <Patissier> ListePatissiers = new Vector<>();

    public double getPrix()
    {
        PrixTotal = PrixTarteBase;
        for (Ingredient c : CompositionTarte)
        {
            PrixTotal = PrixTotal + c.getPrix();
        }
        return PrixTotal;
    }

    public void addIngredients(Vector<Ingredient> ListeIngredients)
    {
        AjoutIngredients(ListeIngredients);
        for (Iterator<Ingredient> e= ListeIngredients.iterator();e.hasNext();)
            {
            Ingredient item = (Ingredient) e.next();
            item.Affiche();
            CompositionTarte.add(item);
            getPrix();
            Affiche();
            }
    }

    public void Affiche()
    {
        System.out.println("Prix = " + PrixTotal);
    }

    public static void AjoutIngredients(Vector<Ingredient> ListeIngredients)
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
