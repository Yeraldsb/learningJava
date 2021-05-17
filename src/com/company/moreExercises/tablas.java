package com.company.moreExercises;

import javax.swing.*;
/*Tablas de multiplicar.
* Permitir al usuariuo ingresar un numero por ventana emergente y sacar sus multiplos hasta 10 */
public class tablas {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese  un numero por favor"));

        for (int i=0; i<=10; i++){
            System.out.println(numero + " * " + i + " = "+ numero * i + "\n");

        }
    }
}
