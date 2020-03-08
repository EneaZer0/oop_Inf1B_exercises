import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Dalek1 {

    private double batteryCharge = 5.0; // instance variable

    public void batteryReCharge(double c) {
        // ADD CODE HERE
        this.batteryCharge = this.batteryCharge + c;
        System.out.println("Battery charge is: " + this.batteryCharge);
    }

    public void move(int distance) {
        // ADD CODE HERE
        double chargeLeft = this.batteryCharge;
        for (int i = 1; i < distance + 1; i++) {
            if (chargeLeft >= 0.5) {
                System.out.print("[" + i + "] ");
                chargeLeft = chargeLeft - 0.5;
                this.batteryCharge = chargeLeft;
            } else {
                System.out.print("Out of power!");
                this.batteryCharge = 0;
                break;
            }

        }
        System.out.print("\n");

    }

    public static void main(String[] args) {
        Dalek1 d = new Dalek1(); // start off with a well-charged battery
        d.move(11);              // move around and use up the charge
        d.batteryReCharge(2.5);  // get a new charge
        d.batteryReCharge(0.5);  // add a bit more
        d.move(5);               // move some more
        Dalek2 d1 = new Dalek2();
        String[] u1 = { "Exterminate, Exterminate!", "I obey!",
                "Exterminate, annihilate, DESTROY!", "You cannot escape.",
                "Daleks do not feel fear.", "The Daleks must survive!" };
        d1.setSayings(u1);

        System.out.println("\nDalek d1 says: ");
        for (int i = 0; i < 10; i++) {
            d1.speak();
        }

        System.out.println("\nDalek d2 says: ");
        Dalek2 d2 = new Dalek2();
        String[] u2 = { "I obey!" };
        d2.setSayings(u2);

        for (int i = 0; i < 10; i++) {
            d2.speak();
        }
    }

}