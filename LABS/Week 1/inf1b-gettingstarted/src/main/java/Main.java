/*
 * inf1b GettingStarted main program
 *
 */
import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {

            GettingStarted gs = new GettingStarted();
            gs.setVisible(true);
        });        
    }
}
