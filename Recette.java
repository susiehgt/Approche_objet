import java.util.*;

public class Recette
{
    public String Type;
    public List<Ingredients> Ingredient = new ArrayList<Ingredients>();
    public Ingredient Topping;
    public Ingredient Gout;
    public Ingredient Supplement = null;

    public Recette(String Type, Ingredient Topping, Ingredient Gout, Ingredient Supplement)
    {
        this.Type = Type;
        this.Topping = Topping;
        this.Gout = Gout;
        this.Supplement = Supplement;
        RecetteAjout(Topping, Gout, Supplement);

    }
    
    public void RecetteAjout(Ingredient Topping, Ingredient Gout, Ingredient Supplement)
    {
        Ingredient.add(Topping);
        Ingredient.add(Gout);
        if (Supplement != null)
        {
            Ingredient.add(Supplement);
        }
    }

    public String getType()
    {
        return Type;
    }

    public List<Ingredients> getList()
    {
        return Ingredient;
    }
}
