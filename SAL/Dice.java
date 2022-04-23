class Dice {
    private int numberOfDice;

    Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    int rollDice() {
        int generatedNo = ((int) (Math.random()*(6*numberOfDice - 1*numberOfDice))) + 1;
        return generatedNo;
    }
}