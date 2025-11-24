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

    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuPrin");
        frame.setContentPane(new MenuPrin().Menuprincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void configBotonIcon(){
        ImageIcon iconoTriqui = new ImageIcon(getClass().getResource("resources/imagenes/unnamed.png"));
        Image imgTriqui = iconoTriqui.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        triquibutton.setIcon(new ImageIcon(imgTriqui));
    }
    public MenuPrin(){
        triquibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("Mi Ventana Swing");
                    frame.setContentPane(new Triqui().getPanelPrincipal());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null); // Centra la ventana
                    frame.setVisible(true);
                });

            }
        });

        calculadoraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        parejasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        ahorcadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("Mi Ventana Swing");
                    frame.setContentPane(new Ahorcado().getPanelPrincipal());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null); // Centra la ventana
                    frame.setVisible(true);
                });
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    };
    public JPanel getPanelPrincipal(){return Menuprincipal;}

    }

