public interface IElectricComponent {
    public enum Unit{
           FAN(4), LIGHT(2), AC(10) , FRIDGE(8);
           private int value;
           private Unit(int value) {
                this.value = value;
           }
           public int getValue(){
            return value;
           }
    }
    public int claculateUnitForSingleDay();
}