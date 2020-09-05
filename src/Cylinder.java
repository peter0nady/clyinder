import java.awt.*;
import javax.swing.*;

public class Cylinder extends JFrame {
  public static void main(String[] args) {
    JFrame frame = new Cylinder ();
    frame.setSize(300, 300);
    
    frame.setTitle("Cylinder");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }

  public Cylinder () {
      setLayout(new GridLayout(2,2,5,5));
    add(new CylinderPanel());
  }
}

class CylinderPanel extends JPanel {
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw top oval
    g.drawOval(40, 20, getWidth() - 40 * 2, 40);

    // Draw bottom oval
    g.drawArc(40, getHeight() - 60, getWidth() - 40 * 2, 40, 0, -180);
    g.drawArc(40, getHeight() - 60, getWidth() - 40 * 2, 40, 0, 30);
    g.drawArc(40, getHeight() - 60, getWidth() - 40 * 2, 40, 60, 15);
    g.drawArc(40, getHeight() - 60, getWidth() - 40 * 2, 40, 90, 15);
    g.drawArc(40, getHeight() - 60, getWidth() - 40 * 2, 40, 120, 15);
    g.drawArc(40, getHeight() - 60, getWidth() - 40 * 2, 40, 160, 20);

    // Draw two lines
    g.drawLine(40, 40, 40, getHeight() - 40);
    g.drawLine(getWidth() - 40, 40, getWidth() - 40, getHeight() - 40);
  }

  public Dimension getPreferredSize() {
    return new Dimension(200, 200);
  }
}
