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

        for (int i=0; i<3;i++){
            for (int c=0; c<3;c++){
                final int fila =i;
                final int columna=c;
                botones[i][c].addActionListener(e -> {
                    if(turn%2 !=0 && tablero[fila][columna]==null){
                        tablero[fila][columna]= "X";
                        botones[fila][columna].setText("X");
                        turn++;
                    } else if (tablero[fila][columna]==null){
                        tablero[fila][columna]="O";
                        botones[fila][columna].setText("O");
                        turn++;
                    }

                    if (GANADOR()==1){
                        JOptionPane.showMessageDialog(pan, "Jugador 1 gana");
                        reiniciar();
                    } else if (GANADOR()==2) {
                        JOptionPane.showMessageDialog(pan, "Jugador 2 gana");
                        reiniciar();
                    }
                });
            }
        }
    }

    public JPanel getPanelPrincipal() {
        return pan;
    }

    private int GANADOR() {
        int G=0;

        for (int i = 0; i < 3; i++) {
            if(tablero[i][0]!=null && tablero[i][0].equals(tablero[i][1]) && tablero[i][1].equals(tablero[i][2])){
                G = tablero[i][0].equals("X") ? 1 : 2;
            }
        }

        for (int i = 0; i < 3; i++) {
            if(tablero[0][i]!=null && tablero[0][i].equals(tablero[1][i]) && tablero[1][i].equals(tablero[2][i])){
                G = tablero[0][i].equals("X") ? 1 : 2;
            }
        }

        if (tablero[0][0]!=null && tablero[0][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][2])){
            G = tablero[0][0].equals("X") ? 1 : 2;
        }

        if (tablero[0][2]!=null && tablero[0][2].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][0])){
            G = tablero[0][2].equals("X") ? 1 : 2;
        }

        return G;
    }

    private void reiniciar() {
        tablero = new String[3][3];
        turn = 1;

        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {
                botones[i][c].setText(" ");
            }
        }
    }
}


