/*
 * inf1b GettingStarted application
 *
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GettingStarted extends JFrame {

    public GettingStarted() {
        initUI();
    }

    private void initUI() {
        
        setTitle("Getting Started");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel msg = new JLabel();
        msg.setText("Well done! You are now running your \"first\" java program.");
        msg.setVerticalAlignment(SwingConstants.CENTER);
        msg.setHorizontalAlignment(SwingConstants.CENTER);


        this.getContentPane().add(msg);
     }
}
