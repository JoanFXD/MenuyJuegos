import javax.swing.*;
import java.awt.event.*;

public class Ahorcado {
    private JPanel pan;
    private JTextField txtPalabra;
    private JButton btnSetPalabra;
    private JLabel lblMostrar;
    private JTextField txtLetra;
    private JButton btnIntentar;
    private JLabel lblErrores;

    private String palabraSecreta = "";
    private char[] progreso;
    private int errores = 0;

    public Ahorcado() {

        btnSetPalabra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                palabraSecreta = txtPalabra.getText().toLowerCase();
                progreso = new char[palabraSecreta.length()];

                for (int i = 0; i < progreso.length; i++) {
                    progreso[i] = '_';
                }

                lblMostrar.setText(String.valueOf(progreso));
                txtPalabra.setText("");
                txtPalabra.setEnabled(false);
                btnSetPalabra.setEnabled(false);
            }
        });

        btnIntentar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String letra = txtLetra.getText().toLowerCase();
                txtLetra.setText("");

                if (letra.length() != 1) {
                    JOptionPane.showMessageDialog(pan, "Ingrese una sola letra");
                    return;
                }

                boolean acierto = false;

                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra.charAt(0)) {
                        progreso[i] = letra.charAt(0);
                        acierto = true;
                    }
                }

                if (!acierto) {
                    errores++;
                    lblErrores.setText("Errores: " + errores);

                    if (errores >= 6) {
                        JOptionPane.showMessageDialog(pan, "Perdiste! La palabra era: " + palabraSecreta);
                        reiniciar();
                    }
                }

                lblMostrar.setText(String.valueOf(progreso));

                if (String.valueOf(progreso).equals(palabraSecreta)) {
                    JOptionPane.showMessageDialog(pan, "Ganaste!");
                    reiniciar();
                }
            }
        });
    }

    private void reiniciar() {
        palabraSecreta = "";
        progreso = null;
        errores = 0;

        lblErrores.setText("Errores: 0");
        lblMostrar.setText("");

        txtPalabra.setEnabled(true);
        btnSetPalabra.setEnabled(true);
    }

    public JPanel getPanelPrincipal() {
        return pan;
    }
}
