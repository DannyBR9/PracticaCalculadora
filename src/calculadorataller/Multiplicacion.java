package calculadorataller;

import javax.swing.JOptionPane;

public class Multiplicacion {
    double a,b,c;
    public void multiplica(){
        a= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        b= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        c= a*b;
        JOptionPane.showMessageDialog(null, "La multiplicacion es:"+c);
    }
}
