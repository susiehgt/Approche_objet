
public class Pomme extends DecoratorIngredients{

    public Pomme(Gateaux decoratorGateaux){
        super(decoratorGateaux);
        }

       @Override 
       public double cost(){ return decoratorGateaux.cost() + 2;}

        @Override
        public String getDescription(){return decoratorGateaux.getDescription() + ", Pomme";}
    }
