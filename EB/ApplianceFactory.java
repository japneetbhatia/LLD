public class ApplianceFactory {

        public static IElectricComponent getInstance(String appliance, int countOfAppliance ,int perDayUsage ){

            switch(appliance){

                case ApplianceConstants.FAN:
                    return new Fan(countOfAppliance,perDayUsage);

                case ApplianceConstants.LIGHT:
                    return new Light(countOfAppliance,perDayUsage);

                case ApplianceConstants.AC:
                    return new AC(countOfAppliance,perDayUsage);

                case ApplianceConstants.FRIDGE:
                    return new Fridge(countOfAppliance,perDayUsage) ;

                default :
                    return new IElectricComponent() {

                        @Override
                        public int claculateUnitForSingleDay() {
                            // TODO Auto-generated method stub
                            return countOfAppliance*perDayUsage;
                        }
                    };
            }

        }
    }