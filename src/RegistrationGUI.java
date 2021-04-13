import javax.swing.*;
import java.awt.*;

public class RegistrationGUI extends JFrame {
    public static int Height;
    public static int Width;

    private RegistrationPanel regPanel;
    public RegistrationGUI() {
        super("COVID-19 Vaccine Registration");
        //Height = 400; I dont think we need to set height/width since we are using pack() ?
        //Width = 600;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //getContentPane().setPreferredSize(new Dimension(Width, Height)); same for this, i think pack() will handle that? 
        RegistrationPanel regPanel = new RegistrationPanel(this);
        add(regPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        RegistrationGUI registrationGUI = new RegistrationGUI();

    }
}
