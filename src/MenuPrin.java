import javax.swing.*;
import java.awt.*;

public class MenuPrin {
    private JButton triquibutton;
    private JButton calculadoraButton;
    private JButton parejasButton;
    private JButton ahorcadoButton;
    private JLabel tituloprin;
    private JButton salir;
    public void configBotonIcon(){
        ImageIcon iconoTriqui = new ImageIcon(getClass().getResource("resources/imagenes/unnamed.png"));
        Image imgTriqui = iconoTriqui.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        triquibutton.setIcon(new ImageIcon(imgTriqui));
    }
}

