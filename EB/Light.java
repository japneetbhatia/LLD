public class Light implements IElectricComponent{

    private int noOfComponents;
    private int perDayUsage;
    public Light(int noOfComponents, int perDayUsage){
        this.noOfComponents=noOfComponents;
        this.perDayUsage=perDayUsage;               
    }

    public int claculateUnitForSingleDay(){
        return noOfComponents*perDayUsage*Unit.LIGHT.getValue();      
    }   
}