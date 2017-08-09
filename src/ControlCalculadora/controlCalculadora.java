/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlCalculadora;

/**
 *
 * @author SENA
 */
public class controlCalculadora {

    private double num1;
    private double num2;
    private double resultado;
    private double memoria;
   

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double asignaciondeOperacion(String signo) {
        if (signo.equals("suma")) {
            resultado = this.num1 + this.num2;
        } else if (signo == "resta") {
            resultado = num1 - num2;
        } else if (signo == "multiplicacion") {
            resultado = num1 * num2;
        } else {
            resultado = num1 / num2;
        }
        if (num2 == 0) {

        }

        return resultado;

    }

        //private void suma(double memoria, double resultado){
   //         this.memoria=resultado+memoria;
//}
}

    
