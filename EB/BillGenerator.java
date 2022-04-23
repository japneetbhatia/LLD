import java.util.Scanner;
public class BillGenerator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        ApplianceFactory factory = new ApplianceFactory();
        int inputOfAppliance = 4; //scn.nextInt();
        String appliance="";
        int countOfAppliance;
        int perDayUsage;
        int unitsPerDay=0;
        for(int t=0 ; t<inputOfAppliance ;t ++){
            appliance = scn.next();
            countOfAppliance = scn.nextInt();
            perDayUsage = scn.nextInt();
            IElectricComponent electricComponent = factory.getInstance(appliance, countOfAppliance, perDayUsage);
            unitsPerDay += electricComponent.claculateUnitForSingleDay();
        }
        System.out.println("unitsPerDay = "+unitsPerDay);
        int unitsPerMonth = unitsPerDay * 30;
        System.out.println("unitsPerMonth = "+unitsPerMonth);

        PriceSlab slab= new PriceSlab();
        int totalBill = slab.calculateBill(unitsPerMonth);
        System.out.println("totalBill = "+totalBill);
    }

}