class Sedan  {
    int km;
    int baseCost = 80;
    int additionalDistanceCost = 12;
    int additionalCharge = 10;
    int totalCost = 0;

    Sedan(int km) {
        this.km = km;
    }

    void getCharges() {
        if(km <= 5) {
            System.out.print(baseCost);
        } else if(km > 5 && km <= 20){
            totalCost = (km - 5)*additionalDistanceCost + baseCost;
            System.out.print(totalCost);
        } else if(km > 20 && km <= 100) {
            totalCost += baseCost;
            km -= 5;
            totalCost += (15)*additionalDistanceCost;
            km -= 15;
            totalCost += (km)*additionalCharge;
            System.out.print(totalCost);
        }else {
            totalCost += baseCost;
            km -= 5;
            totalCost += (15)*additionalDistanceCost;
            km -= 15;
            totalCost += (100)*additionalCharge;
            km -= 100;
            totalCost += km * 10;
            totalCost -= baseCost;
            System.out.print(totalCost);
        }
    }
}