
class PatissierDirector
{
    String NomPatissier;
    String TypeGateau;

    public void fabriqueTartePomme (GateauxBuilder builder){
        builder.TypeGateau("Tarte aux pommes")
                .Gout("Pomme");
    }

        public void fabriqueTarteAbricot (GateauxBuilder builder){
        builder.TypeGateau("Tarte aux abricots")
                .Gout("Abricot");
    }

    public void fabriqueChouxVanille (GateauxBuilder builder){
        builder.TypeGateau("Choux à la vanille")
                .Gout("Vanille");
    }

    public void fabriqueChouxChocolat (GateauxBuilder builder){
        builder.TypeGateau("Choux au chocolat")
                .Gout("Chocolat");
    }

    public void fabriqueGateauNoisettes (GateauxBuilder builder){
        builder.TypeGateau("Gateaux aux noisettes")
                .Gout("Noisettes");
    }
}