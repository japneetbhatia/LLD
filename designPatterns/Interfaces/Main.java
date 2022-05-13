import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Taxcalculator tc = getCalculator();
        System.out.println(tc.calculateTax());
    }

    public static Taxcalculator getCalculator() {
        return new Taxcalculator2019();
    }
}