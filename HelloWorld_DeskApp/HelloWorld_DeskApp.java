import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;
public class HelloWorld_DeskApp{
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorld_DeskApp");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(600, 225));
                JLabel label = new JLabel("♥Hello World♥"
                		+ "리라의 새로운 프로그래밍 도전기", SwingConstants.CENTER);
                frame.getContentPane().add(label);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-600/2, dim.height/2-450/2);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}