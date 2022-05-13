import java.util.*;
import java.io.*;

enum Mobile {
    APPLE(200), SONY(40), SAMSUNG(60);
    int price;
    Mobile() {
        this.price = 20;
    }
    Mobile(int p) {
        this.price = p;
    }
    int getPrice() {
        return price;
    }
}

public class enumExample {
    
    public static void main(String[] args) {
        Mobile m = Mobile.APPLE;
        switch(m) {
            case APPLE : System.out.print(m.getPrice());
                          break;
            case SONY : System.out.print("SONY");
                          break;
            case SAMSUNG : System.out.print("SAMSUNG");
                          break;
            default : System.out.print("SOP");
        }
    }
}