public class Factory {
    
    public GateauxVitrine getTypeGateau(GateauType gateauType){
        switch (gateauType){
            case tarte: {
                return new TarteVitrine();
            }
            case choux:{
                return new ChouxVitrine();
            }
            default : return null;
        }
    }


}
