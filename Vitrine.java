public abstract class Vitrine {
    
    public GateauxVitrine achatGateau(){
        GateauxVitrine gateau=creerGateau();
        gateau.prepare();
        return gateau;
    } 

    public abstract GateauxVitrine creerGateau();
}
