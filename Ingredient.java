class Ingredient extends Ingredients
{   
    private String Type;
    private double Prix;
    private int Quantite;

    public Ingredient()
    { 
        super();
    }

    public Ingredient(String Type, double Prix, int Quantite)
    {
        this.Type = Type;
        this.Prix = Prix;
        this.Quantite = Quantite;
    }

    public double getPrix()
    {
       return Prix;
    }

    public String getType()
    {
       return Type;
    }

    public int getQuantite()
    {
       return Quantite;
    }

    public void Affiche()
    {
        System.out.println(Type + "\n Prix = " + Prix + "\n Quantite = " + Quantite);
    }
}