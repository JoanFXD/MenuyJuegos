import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuPrin::new);
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mi Ventana Swing");
            frame.setContentPane(new Triqui().getPanelPrincipal());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null); // Centra la ventana
            frame.setVisible(true);
        });

    }
}