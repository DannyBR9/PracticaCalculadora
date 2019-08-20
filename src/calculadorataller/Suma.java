package calculadorataller;

import javax.swing.JOptionPane;

public class Suma {
    double a, b, suma;
    
   public void sumar (){
        

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa primer numero"));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa segundo numero"));
        suma = a + b;
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);

       
   }
     
}
