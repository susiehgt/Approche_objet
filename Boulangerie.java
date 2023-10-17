import java.io.*;
import java.util.*;

class Boulangerie
{
    public static void main (String []args) 
    {
        Vector <Gateaux> stockGateaux= new Vector <Gateaux>();

        while(true){
            afficheMenu();
            int rep=saisieEntier();
            switch(rep){
                case 1 : creerGateau();break;
                case 2 : gererIngredients();break;
                case 0 : System.exit();
		    default:
			System.out.println("Option inexistante: veuillez recommencer"); 
            }
        }

    }
}


public void afficheMenu(){
        System.out.println("Que voulez-vous faire ? \n");
        System.out.println("1 : Faire un gateau \n");
        System.out.println("0 : Quitter");
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