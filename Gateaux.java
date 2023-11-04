import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public abstract class Gateaux
{
    public Gateaux(String TypeGateau, String Gout, int stock) {
        this.TypeGateau=TypeGateau;
        this.Gout=Gout;
        this.stock=stock;
    }

    String TypeGateau = "Unkown"; //type de gateaux
    double PrixGateau=0.0; // prix du gateau
    String Gout="Unkown";// type de fond de tarte ou de creme
    int stock=0;

    public String getDescription() {return TypeGateau;}

    public abstract double cost();
    

    public static void menuGateaux(){
        System.out.println("Quel type de gateau voulez-vous?\n");
        Gateaux choux=new Choux();
        Gateaux tarte=new Tarte();

        afficheMenuGateaux();
        int rep=saisieEntier();
        switch(rep){
            case 1 : tarte(tarte);break;
            case 2 : choux(choux); break;
            case 3 : return; 
        }
    }

    private static void choux(Gateaux choux){
                menuCreme();
                int reponse=saisieEntier();
                switch(reponse){
                    case 1 : { 
                    choux=new Vanille((choux));
                    boolean quit = false;
                    do{
                    menuToppingChoux();
                    int choix=saisieEntier();
                    switch(choix){
                        case 1 : choux=new Chantilly(choux);break;
                        case 2 : choux=new Noisettes(choux);break;
                        case 3 : choux=new Amandes(choux);break;
                        case 4 : quit = true;
                    }
                } while(!quit);
                    printGateau(choux);}break;
                    
                case 2 : { 
                    choux=new Chocolat((choux));
                    boolean quit = false;
                    do{
                    menuToppingChoux();
                    int choix=saisieEntier();
                    switch(choix){
                        case 1 : choux=new Meringue(choux);break;
                        case 2 : choux=new Noisettes(choux);break;
                        case 3 : choux=new Amandes(choux);break;
                        case 4 : quit = true;
                    }
                } while(!quit);
                    printGateau(choux);}
    }
}

    private static void tarte(Gateaux tarte){
                menuFondDeTarte();
                int reponse=saisieEntier();
                switch(reponse){
                    case 1 : { 
                    tarte=new Pomme((tarte));
                    boolean quit = false;
                    do{
                    menuToppingTarte();
                    int choix=saisieEntier();
                    switch(choix){
                        case 1 : tarte=new Meringue(tarte);break;
                        case 2 : tarte=new Noisettes(tarte);break;
                        case 3 : tarte=new Amandes(tarte);break;
                        case 4 : quit = true;
                    }
                } while(!quit);
                    printGateau(tarte);}break;

                case 2 : { 
                    tarte=new Abricot((tarte));
                    boolean quit = false;
                    do{
                    menuToppingTarte();
                    int choix=saisieEntier();
                    switch(choix){
                        case 1 : tarte=new Meringue(tarte);break;
                        case 2 : tarte=new Noisettes(tarte);break;
                        case 3 : tarte=new Amandes(tarte);break;
                        case 4 : quit = true;
                    }
                } while(!quit);
                    printGateau(tarte);}
    }
}

    private static void printGateau(Gateaux c) {
        System.out.println("Description: " + c.getDescription() + "\nPrix: " + c.cost());
    }


    public static void menuFondDeTarte(){
        System.out.println("Choisissez ce que vous voulez dessus : \n");
        System.out.println("1 : Pommes ");
        System.out.println("2 : Abricots ");
    }

    public static void menuToppingTarte(){
        System.out.println("Choisissez ce que vous voulez comme toppings : \n");
        System.out.println("1 : Meringue ");
        System.out.println("2 : Noisettes ");
        System.out.println("3 : Amandes grillees ");
        System.out.println("4 : Rien d'autre");
    }

    public static void menuCreme(){
        System.out.println("Choisissez ce que vous voulez dessus : \n");
        System.out.println("1 : Vanille ");
        System.out.println("2 : Chocolat ");
    }

    public static void menuToppingChoux(){
        System.out.println("Choisissez ce que vous voulez comme toppings : \n");
        System.out.println("1 : Chantilly ");
        System.out.println("2 : Noisettes ");
        System.out.println("3 : Amandes grillees ");
        System.out.println("6 : Rien d'autre");
    }


    public String getType(){
        return TypeGateau;
    }

    public double getPrix(){
        return PrixGateau;
    }

    public void setType(String TypeGateau){
        this.TypeGateau=TypeGateau;
    }

    public void setPrix(double PrixGateau){
        this.PrixGateau=PrixGateau;
    }

    public static void afficheMenuGateaux(){
        System.out.println("1 : Tarte");
        System.out.println("2 : Choux");
        System.out.println("0 : Quitter\n");
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