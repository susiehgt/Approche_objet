import java.io.*;
import java.util.*;

class Boulangerie
{
    public static void main (String []args) {
   
        Vector <Ingredients> ListeIngredients = new Vector<>();

        Patisserie.ajoutIngredients(ListeIngredients);//On ajoute automatiquement tous les ingrédients dès le début

             while(true){
            afficheMenu();
            int rep=saisieEntier();
            switch(rep){
                case 1 : acheterGateau();break;
                case 2 : Patisserie.AfficherIngredients(ListeIngredients);break;
                case 3 : Patisserie.AjoutIngrédient(ListeIngredients);break;
                case 4 : PatissierFactory.fabricationGateauxFactory();break;
                case 0 : System.exit(0);
		    default:
			System.out.println("Option inexistante: veuillez recommencer"); 
            }
        }
    }

    public static void afficheMenu(){
        System.out.println("\nQue voulez-vous faire ? \n");
        System.out.println("1 : Acheter un gateau");
        System.out.println("2 : Voir tous les ingrédients");
        System.out.println("3 : Ajouter un ingrédient");
        System.out.println("4 : Fabriquer un gateau avec la méthode factory\n");
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


