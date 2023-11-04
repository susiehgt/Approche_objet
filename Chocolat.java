public class Chocolat extends DecoratorIngredients{

    public Chocolat(Gateaux decoratorGateaux){
        super(decoratorGateaux);
        }

       @Override 
       public double cost(){ return decoratorGateaux.cost() + 1;}

        @Override
        public String getDescription(){return decoratorGateaux.getDescription() + ", Chocolat";}
    }
