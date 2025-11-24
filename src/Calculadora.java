import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.*;

public class Calculadora {
    private JPanel CalcPan;
    private JButton suma;
    private JButton division;
    private JButton multiplicacion;
    private JButton resta;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;

    public Calculadora() {
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getCalcPan() {
        return CalcPan;
    }
}
