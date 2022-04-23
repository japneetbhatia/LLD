public class AC implements IElectricComponent{

    private int noOfComponents;
    private int perDayUsage;
    public AC(int noOfComponents, int perDayUsage){
        this.noOfComponents=noOfComponents;
        this.perDayUsage=perDayUsage;               
    }

    public int claculateUnitForSingleDay(){
        return noOfComponents*perDayUsage*Unit.AC.getValue();      
    }   
}