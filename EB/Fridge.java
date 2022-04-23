public class Fridge implements IElectricComponent{

    private int noOfComponents;
    private int perDayUsage;
    public Fridge(int noOfComponents, int perDayUsage){
        this.noOfComponents=noOfComponents;
        this.perDayUsage=perDayUsage;               
    }

    public int claculateUnitForSingleDay(){
        return noOfComponents*perDayUsage*Unit.Fridge.getValue();      
    }   
}