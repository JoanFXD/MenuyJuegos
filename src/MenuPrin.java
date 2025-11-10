import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuPrin extends JFrame{
    private JPanel Menuprincipal;
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
    public MenuPrin(){
        add(Menuprincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void triqui(){
        triquibutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

