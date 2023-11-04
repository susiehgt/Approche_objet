public class Vanille extends DecoratorIngredients{

    public Vanille(Gateaux decoratorGateaux){
        super(decoratorGateaux);
        }

       @Override 
       public double cost(){ return decoratorGateaux.cost() + 1;}

        @Override
        public String getDescription(){return decoratorGateaux.getDescription() + ", Vanille";}
    }
