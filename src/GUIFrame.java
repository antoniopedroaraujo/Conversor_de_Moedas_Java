import javax.swing.*;
import java.awt.*;

public class GUIFrame extends JFrame {
    GUIFrame(){
        this.setTitle("Cofrinho Conversor de Moedas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1200,500);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("src/logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.pink);
    }

}
