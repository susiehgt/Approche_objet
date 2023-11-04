import java.io.*;
import java.util.*;

class Boulangerie
{
    public static void main (String []args) {
   
        Vector <Ingredients> ListeIngredients = new Vector<>();
        Vector <StockGateaux> stockGateaux = new Vector<>();

        Patisserie.ajoutIngredients(ListeIngredients);//On ajoute automatiquement tous les ingrédients dès le début
        stockMatinGateaux(stockGateaux);//On a un stock de base tous les matins de gateaux
        

        while(true){
            afficheMenu();
            int rep=saisieEntier();
            switch(rep){
                case 1 : acheterGateau();break; //achat d'un gateau par le client
                case 2 : Patisserie.AfficherIngredients(ListeIngredients);break;
                case 3 : Patisserie.AjoutIngrédient(ListeIngredients);break;
                case 4 : Patissier.fabricationGateaux();break;
                case 5 : StockGateaux.afficherStockGateaux(stockGateaux);break;
                case 6 : System.out.println("Donnez le gout de votre gateau : "); String gout=saisieChaine();StockGateaux.find(stockGateaux,gout);break;
                case 0 : System.exit(0);
		    default:
			System.out.println("Option inexistante: veuillez recommencer"); 
            }
        }
    }


    public  static void stockMatinGateaux(Vector<StockGateaux> stockGateaux){
        StockGateaux newGateauP=new StockGateaux("Tarte","Pommes",10);
        stockGateaux.addElement(newGateauP);
        StockGateaux newGateauA=new StockGateaux("Tarte","Abricots",10);
        stockGateaux.addElement(newGateauA);
        StockGateaux newGateauV=new StockGateaux("Choux","Vanille",50);
        stockGateaux.addElement(newGateauV);
        StockGateaux newGateauC=new StockGateaux("Choux","Chocolat",50);
        stockGateaux.addElement(newGateauC);
    }

    public static void afficheMenu(){
        System.out.println("\nQue voulez-vous faire ? \n");
        System.out.println("1 : Acheter un gateau");
        System.out.println("2 : Voir tous les ingrédients");
        System.out.println("3 : Ajouter un ingrédient");
        System.out.println("4 : Fabriquer un gateau avec la méthode builder");
        System.out.println("5 : Afficher le stock ");
        System.out.println("6 : Remplir le stock \n");
        System.out.println("0 : Quitter\n");
    }

    public static void acheterGateau(){
        Gateaux.menuGateaux();
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


