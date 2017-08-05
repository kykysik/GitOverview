/**
 * Created by kykysik on 23.07.17.
 */
    import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

    public class Field {

        public static void createGUI() {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JFrame frame = new JFrame("Test frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());



            frame.getContentPane().add(panel);
            frame.setPreferredSize(new Dimension(500, 400));

            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createGUI();
                }
            });
        }
    }

