package com.company;

import javax.swing.*;

import java.util.Scanner;

// Solicita un numero en una ventana emergente y has que el programa imprima todos los numeros anteriores de dicho numero.
public class Main {

   // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int number;
    String option;

    public void enterData() {

        number=Integer.parseInt(JOptionPane.showInputDialog("Please, type the number "));

    }

    public void calculate(){

        for (int i=0; i<=number; i++){
            System.out.println(i);

        }
    }

    public void show(){

        do{
            enterData();
            calculate();
            option=JOptionPane.showInputDialog("Would you like to try it again ? YES/NO");
        }while(option.equalsIgnoreCase("YES"));

        System.out.println("The program has finished, thanks for trying! ");

    }
    public static void main(String[] args) {
        Main x = new Main();
        x.show();
    }
}
