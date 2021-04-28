import javax.swing.*;
import java.awt.*;

public class RegistrationGUI extends JFrame {
    public static int Height;
    public static int Width;

    private RegistrationPanel regPanel;
    public RegistrationGUI() {
        super("COVID-19 Vaccine Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
        regPanel = new RegistrationPanel(this);
        add(regPanel);
        pack();
        setVisible(true);
    }
    public void eligibilityScreening(){
        remove(regPanel);
        JPanel screeningPanel = new Screening();
        add(screeningPanel);
        setVisible(true);
        repaint();    
    }
    
    public static void main(String[] args) {
        RegistrationGUI registrationGUI = new RegistrationGUI();

    }
}
