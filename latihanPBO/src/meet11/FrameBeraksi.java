package meet11;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author sye
 */
public class FrameBeraksi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Beraksi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel emptyLabel = new JLabel("Frame Beraksi");
        frame.getContentPane().add(emptyLabel);
        
        frame.setSize(400,200);
        frame.setVisible(true);
    }
}
