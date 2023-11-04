public class GateauxBuilder {
    
    private String TypeGateau;
    private String Gout;
    private String Topping="Aucun";

    public GateauxBuilder TypeGateau(String TypeGateau){
        this.TypeGateau=TypeGateau;
        return this;
    }

    public GateauxBuilder Gout(String Gout){
        this.Gout=Gout;
        return this;
    }

    public GateauxBuilder Topping(String Topping){
        this.Topping=Topping;
        return this;
    }

    public Patissier build(){
        return new Patissier(TypeGateau, Gout,Topping);
    }

}
