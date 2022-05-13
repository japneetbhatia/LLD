class SUV  {
    int km;
    int baseCost = 100;
    int additionalDistanceCost = 15;
    int additionalCharge = 12;
    int totalCost = 0;

    SUV(int km) {
        this.km = km;
    }

    void getCharges() {
        if(km <= 5) {
            System.out.print(baseCost);
        } else if(km > 5 && km <= 20){
            totalCost = (km - 5)*additionalDistanceCost + baseCost;
            System.out.print(totalCost);
        } else if(km > 20) {
            totalCost += baseCost;
            km -= 5;
            totalCost += (15)*additionalDistanceCost;
            km -= 15;
            totalCost += (km)*additionalCharge;
            System.out.print(totalCost);
        }else {
            System.out.print(totalCost);
        }
    }
}