import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TarteVitrine implements GateauxVitrine {
    
    @Override
    public void prepare(){
        Gateaux tarte=new Tarte();
        Gateaux.menuFondDeTarte();
        int reponse=saisieEntier();
        switch(reponse){
            case 1 : { 
            tarte=new Pomme((tarte));
            boolean quit = false;
            do{
            Gateaux.menuToppingTarte();
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
            Gateaux.menuToppingTarte();
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
