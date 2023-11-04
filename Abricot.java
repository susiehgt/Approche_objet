public class Abricot extends DecoratorIngredients{

    public Abricot(Gateaux decoratorGateaux){
        super(decoratorGateaux);
        }

       @Override 
       public double cost(){ return decoratorGateaux.cost() + 2;}

        @Override
        public String getDescription(){return decoratorGateaux.getDescription() + ", Abricot";}
    }
