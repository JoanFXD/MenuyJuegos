import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Parejas {
    private JPanel pan;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;

    private JButton[] botones;

    private String[] palabras = {
            "Perro", "Perro",
            "Gato", "Gato",
            "Pajaro", "Pajaro",
            "Pinguino", "Pinguino",
            "Pato", "Pato",
            "Ornitorrinco", "Ornitorrinco"
    };

    private JButton primero = null;
    private JButton segundo = null;

    public Parejas() {
        botones = new JButton[]{
                button1, button2, button3, button4,
                button5, button6, button7, button8,
                button9, button10, button11, button12
        };

        iniciar();
    }

    private void iniciar() {
        ArrayList<String> lista = new ArrayList<>();
        Collections.addAll(lista, palabras);
        Collections.shuffle(lista);

        for (int i = 0; i < 12; i++) {
            botones[i].putClientProperty("valor", lista.get(i));
            botones[i].setText("");
            for (var al : botones[i].getActionListeners()) {
                botones[i].removeActionListener(al);
            }
            botones[i].addActionListener(e -> click((JButton) e.getSource()));
        }

        primero = null;
        segundo = null;
    }

    private void click(JButton b) {
        if (primero != null && segundo != null) {
            primero.setText("");
            segundo.setText("");
            primero = null;
            segundo = null;
        }

        String palabra = (String) b.getClientProperty("valor");

        if (b.getText().equals(palabra)) return;

        b.setText(palabra);

        if (primero == null) {
            primero = b;
        } else if (segundo == null && b != primero) {
            segundo = b;

            if (primero.getClientProperty("valor").equals(segundo.getClientProperty("valor"))) {
                primero = null;
                segundo = null;
                verificarVictoria();
            }
        }
    }

    private void verificarVictoria() {
        for (JButton boton : botones) {
            if (boton.getText().equals("")) return;
        }

        JOptionPane.showMessageDialog(null, "Ganaste");
        iniciar();
    }

    public JPanel getPanelPrincipal() {
        return pan;
    }
}




