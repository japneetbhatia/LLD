class Mini  {
    int km;
    int baseCost = 50;
    int additionalDistanceCost = 10;
    int additionalCharge = 8;
    int totalCost = 0;

    Mini(int km) {
        this.km = km;
    }

    void getCharges() {
        if(km <= 3) {
            System.out.print("50");
        } else if(km > 3 && km <= 18){
            totalCost = (km - 3)*additionalDistanceCost + baseCost;
            System.out.print(totalCost);
        } else if(km > 18 && km <= 75) {
            totalCost += baseCost;
            km -= 3;
            totalCost += (15)*additionalDistanceCost;
            km -= 15;
            totalCost += (km)*additionalCharge;
            System.out.print(totalCost);
        }else {
            totalCost = km * 8;
            System.out.print(totalCost);
        }
    }
}