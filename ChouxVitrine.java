import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChouxVitrine implements GateauxVitrine {
    
    @Override
    public void prepare(){
        Gateaux choux=new Choux();
        Gateaux.menuCreme();
                int reponse=saisieEntier();
                switch(reponse){
                    case 1 : { 
                    choux=new Vanille((choux));
                    boolean quit = false;
                    do{
                    Gateaux.menuToppingChoux();
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
                        Gateaux.menuToppingChoux();
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


private static void printGateau(Gateaux c) {
    System.out.println("Description: " + c.getDescription() + "\nPrix: " + c.cost());
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
