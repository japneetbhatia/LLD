public class Fan implements IElectricComponent{

    private int noOfComponents;
    private int perDayUsage;
    public Fan(int noOfComponents, int perDayUsage){
        this.noOfComponents=noOfComponents;
        this.perDayUsage=perDayUsage;               
    }

    public int claculateUnitForSingleDay(){
        return noOfComponents*perDayUsage*Unit.FAN.getValue();      
    }   
}