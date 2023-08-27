/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescorebound;

import javax.swing.JOptionPane;

/**
 *
 * @author Nai
 */
public class Livescorebound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean liveScoreBean = new LiveScoreBean();

        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");

        liveScoreBean.addPropertyChangeListener(subscriber1);
        liveScoreBean.addPropertyChangeListener(subscriber2);

        while (true) {
            String input = JOptionPane.showInputDialog("Enter Score (or press Enter to exit): ");
            if (input.isEmpty()) {
                break;
            }
            liveScoreBean.setScoreLine(input);
        }
    }
    
}
