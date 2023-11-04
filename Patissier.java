import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Patissier {
    
    public String TypeGateau;
    private String Gout;
    private String Topping="Aucun";


    public Patissier(String TypeGateau, String Gout, String Topping){
        this.TypeGateau=TypeGateau;
        this.Gout=Gout;
        this.Topping=Topping;
    }

    public static void menuPatissier(){
        System.out.println("\nQuel gateau voulez-vous fabriquer? \n");
        System.out.println("1 : Tarte aux pommes\n");
        System.out.println("2 : Tarte aux abricots\n");
        System.out.println("3 : Choux à la vanille\n");
        System.out.println("4 : Choux au chocolat\n");
        System.out.println("5 : Gateau aux noisettes\n");
        System.out.println("0 : Quitter\n");
    }

    public String getTypeGateauPatissier(String TypeGateau){
        return TypeGateau;
    }

    public static void fabricationGateaux(){
        Patissier.menuPatissier();
        int rep=saisieEntier();
        switch(rep){
            case 1 : { 
                PatissierDirector director=new PatissierDirector();
                GateauxBuilder builder=new GateauxBuilder();
                director.fabriqueTartePomme(builder);
                Patissier gateau=builder.build();
                System.out.println("Fabrication de : \n"+gateau.TypeGateau); 
            }break;
            case 2 :  { 
                PatissierDirector director=new PatissierDirector();
                GateauxBuilder builder=new GateauxBuilder();
                director.fabriqueTarteAbricot(builder);
                Patissier gateau=builder.build();
                System.out.println("Fabrication de : \n"+gateau.TypeGateau);
            }break;
            case 3 :  { 
                PatissierDirector director=new PatissierDirector();
                GateauxBuilder builder=new GateauxBuilder();
                director.fabriqueChouxVanille(builder);
                Patissier gateau=builder.build();
                System.out.println("Fabrication de : \n"+gateau.TypeGateau);
            }break;
            case 4 :  { 
                PatissierDirector director=new PatissierDirector();
                GateauxBuilder builder=new GateauxBuilder();
                director.fabriqueChouxChocolat(builder);
                Patissier gateau=builder.build();
                System.out.println("Fabrication de : \n"+gateau.TypeGateau);
            }break;
            case 5 :  { 
                PatissierDirector director=new PatissierDirector();
                GateauxBuilder builder=new GateauxBuilder();
                director.fabriqueGateauNoisettes(builder);
                Patissier gateau=builder.build();
                System.out.println("Fabrication de : \n"+gateau.TypeGateau);
            }break;
            case 0 : return;
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
