import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatissierFactory {
    

    static Factory factory=new Factory();

    public static void menuPatissier(){
        System.out.println("\nQuel gateau voulez-vous fabriquer? \n");
        System.out.println("1 : Tarte\n");
        System.out.println("2 : Choux\n");
        System.out.println("0 : Quitter\n");
    }

    public static void fabricationGateauxFactory(){
        menuPatissier();
        int rep=saisieEntier();
        switch(rep){
            case 1 : { 
                GateauxVitrine uneTarte=factory.getTypeGateau(GateauType.tarte);
                uneTarte.prepare();
            }break;
            case 2 :  { 
                GateauxVitrine unChoux=factory.getTypeGateau(GateauType.choux);
            }break;
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
