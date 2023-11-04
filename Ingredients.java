public class Ingredients
{

    private String Nom;
    private String Fournisseur;
    private int Stock;
    private Double Prix;

    public Ingredients(String Nom, String Fournisseur, int Stock, double Prix){
        this.Nom=Nom;
        this.Fournisseur=Fournisseur;
        this.Stock=Stock;
        this.Prix=Prix;
    }

    public String getNomIngredient(){
        return Nom;
    }

    public String getFournisseurIngredient(){
         return Fournisseur;
    }

    public double getPrixIngredient(){
         return Prix;
    }

    public int getStockIngredient(){
         return Stock;
    }

    public void infoIngredient() {
        System.out.println("Ingredient : "+ Nom + "\nFournisseur : "+ Fournisseur + "\nPrix : "+ Prix + "\nStock : " + Stock +"\n");
    }
}





