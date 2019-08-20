/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorataller;

/**
 *
 * @author Danny
 */
public class CalculadoraTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Multiplicacion objM = new Multiplicacion();
        objM.multiplica();
        Suma objSum = new Suma();
        objSum.sumar();
        Division objDiv = new Division();
        objDiv.division();

    }
    
}
