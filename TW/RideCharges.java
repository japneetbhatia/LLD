import java.util.Scanner;

class RideCharges {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int km = scn.nextInt();          
        Mini mini1 = new Mini(km);
        Sedan sedan1 = new Sedan(km);
        SUV suv1 = new SUV(km);
        System.out.print("Mini: ");
        mini1.getCharges();
        System.out.print(" Sedan: ");
        sedan1.getCharges();
        System.out.print(" SUV: ");
        suv1.getCharges();
    }
}