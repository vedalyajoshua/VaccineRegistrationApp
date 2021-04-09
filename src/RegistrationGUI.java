import javax.swing.*;
import java.awt.*;

public class RegistrationGUI extends JFrame {
    public static int Height;
    public static int Width;

    private RegistrationPanel regPanel;
    public RegistrationGUI() {
        super("COVID-19 Vaccine Registration");
        Height = 400;
        Width = 600;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setPreferredSize(new Dimension(Width, Height));
        pack();
        regPanel = new RegistrationPanel(this);
        add(regPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        RegistrationGUI registrationGUI = new RegistrationGUI();

    }
}
