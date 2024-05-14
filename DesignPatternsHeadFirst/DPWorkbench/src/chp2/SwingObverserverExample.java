package chp2;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObverserverExample {
    JFrame frame;

    public SwingObverserverExample() {

    }

    public void run() {
        SwingObverserverExample example = new SwingObverserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame("My JFrame");
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event -> System.out.println("Come on, do it!"));

        frame.add(button);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    // Classes used for button
    class AngelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Come on, do it!");
        }
    }

}
