import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Dalek2 {

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

    private ArrayList<String> list = new ArrayList<>();

    /** ________FUNCTION TO SAVE THE QUOTES IN LIST _________ */
    public void setSayings(String[] list_of_quotes) {
        for (int i = 0; i < list_of_quotes.length; i++) {
            this.list.add(list_of_quotes[i]);
        }

    }

    public void speak() {
        if (list.size() != 0) {
            int quote_number = (int)(Math.random() * list.size());
            String quote = this.list.get(quote_number);
            System.out.println(quote);
        } else {
            System.out.printf("No utterances installed!");
        }
    }

    public static void main(String[] args) {

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




