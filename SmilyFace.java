import java.awt.*;
import java.awt.event.*;

public class SmilyFace extends Frame {
  public SmilyFace() {
    setTitle("Smily Face");
    setSize(300, 300);
     addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

  public void paint(Graphics g) {
    
    g.setColor(Color.yellow);
    
    g.fillOval(50, 50, 200, 200);
    // Set the color to black
    g.setColor(Color.black);
    // Draw two ovals for the eyes
    g.drawOval(190, 100, 30, 30);
    g.drawOval(190, 100, 30, 30);
    
    g.drawArc(100, 150, 100, 50, 180, 180);
  }

  public static void main(String[] args) {
 
    SmilyFace sf = new SmilyFace();
    sf.setVisible(true);
  }
}