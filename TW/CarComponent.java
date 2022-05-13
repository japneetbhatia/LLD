public interface CarComponent {
    int baseCharge;
    int nextDistanceCharge;
    int additionalCharge;
    int km;

    CarComponent(int baseCharge, int nextDistanceCharge, int additionalCharge, int km) {
        this.baseCharge = baseCharge;
        this.nextDistanceCharge = nextDistanceCharge;
        this.additionalCharge = additionalCharge;
        this.km = km;
    }
}