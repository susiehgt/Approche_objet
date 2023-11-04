import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StockGateaux {
    
    String TypeGateau = "Unkown"; //type de gateaux
    String Gout="Unkown";// type de fond de tarte ou de creme
    int stock=0;// stock de gateaux

    public StockGateaux(String TypeGateau, String Gout, int stock){
        this.TypeGateau=TypeGateau;
        this.Gout=Gout;
        this.stock=stock;
    }

    public static void afficherStockGateaux(Vector<StockGateaux> stockGateaux){
    for (Iterator e= stockGateaux.iterator();e.hasNext();)
    {
    StockGateaux item = (StockGateaux) e.next();
    item.infoStockGateaux();
    }
}

    public static void find(Vector <StockGateaux> stockGateaux, String chaineGout){
	for (Iterator e=stockGateaux.iterator();e.hasNext();) {
		StockGateaux item = (StockGateaux)e.next();
		if (chaineGout.equals(item.getGoutGateau())){
            System.out.println("Combien de gateaux voulez-vous ajouter ? ");
            int rep=saisieEntier();
            item.remplir(stockGateaux,rep);
		}
	   }
    }

    public static void VenteGateau(Vector <StockGateaux> stockGateaux, String chaineGout){
	for (Iterator e=stockGateaux.iterator();e.hasNext();) {
		StockGateaux item = (StockGateaux)e.next();
		if (chaineGout.equals(item.getGoutGateau())){
            item.remplir(stockGateaux,-1);
		}
	   }
    }

    public void remplir(Vector<StockGateaux> stockGateaux, int quantite){
        stock+=quantite;
        System.out.println("Nouveau stock : "+ stock);
    }

    public void verificationStock(Vector<StockGateaux> stockGateaux){
        for (Iterator e= stockGateaux.iterator();e.hasNext();){
            StockGateaux item = (StockGateaux) e.next();
            int itemstock=item.getStock(stockGateaux);
            if (itemstock<10){
                item.remplir(stockGateaux, 10);
            }
        }
    }

    public int getStock(Vector<StockGateaux> stockGateaux){
        return stock;
    }

    public void setStock(int stock){
        this.stock=stock;
    }

    public String getTypeGateau(){
        return TypeGateau;
    }

    public void setTypeGateau(String TypeGateau){
        this.TypeGateau=TypeGateau;
    }

    public String getGoutGateau(){
        return Gout;
    }

    public void setGoutGateau(String Gout){
        this.Gout=Gout;
    }


    public void infoStockGateaux() {
        System.out.println("Type de gateau : "+ TypeGateau + "\nGout : "+ Gout + "\nStock : "+ stock + "\n");
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
