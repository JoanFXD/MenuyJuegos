import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.*;
import java.text.*;


public class Calculadora {
    private JPanel CalcPan;
    private JButton sumaBtn;
    private JButton divisionBtn;
    private JButton multiplicacionBtn;
    private JButton restaBtn;
    private JFormattedTextField numerodos;
    private JFormattedTextField numerouno;
    private JTextField ResulTxt;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().CalcPan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Calculadora() {
        entradaNumerouno();
        sumaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opsuma();
                ResulTxt.setText(String.valueOf(opsuma()));

            }
        });
        restaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opresta();
                ResulTxt.setText(String.valueOf(opresta()));

            }
        });
        multiplicacionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opmult();
                ResulTxt.setText(String.valueOf(opmult()));

            }
        });
        divisionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opdiv();
                ResulTxt.setText(String.valueOf(opdiv()));

            }
        });
    }
    public void entradaNumerouno(){
        NumberFormat formato = NumberFormat.getIntegerInstance();
        formato.setMinimumFractionDigits(0);
        formato.setMaximumFractionDigits(3);
        NumberFormatter formatter = new NumberFormatter(formato);

        formatter.setValueClass(Double.class);
        formatter.setAllowsInvalid(false);
        formatter.setMinimum(0.0);

        DefaultFormatterFactory factory = new DefaultFormatterFactory(formatter);
        numerouno.setFormatterFactory(factory);
        numerodos.setFormatterFactory(factory);
    }
    public double opsuma(){
        Number valor = (Number) numerouno.getValue();
        double num1 = valor.intValue();
        Number valor2 = (Number) numerodos.getValue();
        double num2 = valor2.intValue();
        double sumaa = num1 + num2;
        return sumaa;
    }
    public double opresta(){
        Number valor = (Number) numerouno.getValue();
        double num1 = valor.intValue();
        Number valor2 = (Number) numerodos.getValue();
        double num2 = valor2.intValue();
        double restaa = num1 - num2;
        return restaa;
    }
    public double opmult(){
        Number valor = (Number) numerouno.getValue();
        double num1 = valor.intValue();
        Number valor2 = (Number) numerodos.getValue();
        double num2 = valor2.intValue();
        double multt = num1* num2;
        return multt;
    }
    public double opdiv(){
        Number valor = (Number) numerouno.getValue();
        int num1 = valor.intValue();
        Number valor2 = (Number) numerodos.getValue();
        int num2 = valor2.intValue();
        double divv = num1 / num2;
        return divv;
    }

    public JPanel getCalcPan() {
        return CalcPan;
    }
}
