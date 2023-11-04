import java.util.*;

public class Vendeur{

    private int currentStock;
    private List<GateauxVendus> gateaux=new ArrayList<>();


    public void Achat(GateauxVendus gateaux){
        this.gateaux.add(gateaux);

    }

    public void Vendu(GateauxVendus gateaux){
        this.gateaux.remove(gateaux);
    }

    public void setStock(int stock){
        this.currentStock=stock-1;

        for (GateauxVendus gateaux : this.gateaux){
            GateauxVendus.update(this.currentStock);
        }
    }

}


