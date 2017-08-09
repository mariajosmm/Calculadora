/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicadeNegociosCalculadora;


/**
 *
 * @author SENA
 */
public class modeloCalculadora {
    
    private double num1;
    private double num2;
    private double resultado;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double resultado() {
        return this.resultado;

    }

    public void suma() {
        resultado = num1 + num2;
    }

    public void resta() {
        resultado = num1 - num2;
    }

    public void multipliacion() {
        resultado = num1 * num2;
    }

    public void division() {
        resultado = num1 / num2;

        if (resultado == 0) {
            System.out.println("Error, dividiste por 0");
        }
    }
}
