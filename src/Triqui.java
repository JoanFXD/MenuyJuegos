import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Triqui {
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
    private JButton[][] botones;
    private String[][] tablero;
    private int turn=1;

    public Triqui() {
        tablero = new String[3][3];
        botones = new JButton[][]{{button1,button2,button3},{button4,button5,button6},{button7,button8,button9}};
        for (int i=0; i<botones.length;i++){
            for (int c=0; c< botones[i].length;c++){
                final int fila =i;
                final int columna=c;
                botones[i][c].addActionListener(e -> {
                    try {
                        if(turn%2 !=0){
                            tablero[fila][columna]= "X";
                            botones[fila][columna].setText("X");
                        } else {
                            tablero[fila][columna]="O";
                            botones[fila][columna].setText("O");
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Ingrese números válidos",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                    turn++;
                });
            }

        }
    }
    public JPanel getPanelPrincipal() {
        return pan;
    }
}
