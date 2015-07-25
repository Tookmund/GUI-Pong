import javax.swing.JFrame;
public class main
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Pong");
      frame.setSize(1000,1000);
      frame.setLocation(100,50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PinballPanel());
      frame.setVisible(true);
   }
}