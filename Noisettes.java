public class Noisettes extends DecoratorIngredients{

    public Noisettes (Gateaux decoratorGateaux){
        super(decoratorGateaux);
        }

       @Override 
       public double cost(){ return decoratorGateaux.cost() + 0.5;}

        @Override
        public String getDescription(){return decoratorGateaux.getDescription() + ", Noisettes";}
    }