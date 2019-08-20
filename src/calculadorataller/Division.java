/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorataller;

import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */
public class Division {
    double a,b,division;
    public void division(){
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingresar Primer Numero"));
b = Double.parseDouble(JOptionPane.showInputDialog("Ingresar Segundo Numero"));
division =a/b;
JOptionPane.showMessageDialog(null, "El resultado es :"+division);

        
    }
    
}
