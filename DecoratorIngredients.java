public abstract class DecoratorIngredients extends Gateaux
{
    protected Gateaux decoratorGateaux;
    
    public DecoratorIngredients(Gateaux decoratorGateaux){
        this.decoratorGateaux=decoratorGateaux;
    }

    public String getDescription(){
        return decoratorGateaux.getDescription();
    }

    public double cost(){
        return decoratorGateaux.cost();
    }

}





