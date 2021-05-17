package com.company.moreExercises;

/*Compra repiestos.
En el sgte ejercicio pediremos por ventana emergente una identificacion a varios clientes, alguno de ellos tendran un descuento especial
dependiendo de su numero de cedula. el programa debe pedir ingresar el valor de un repuesto que comprarsar para sus coches, el valor
del repuesto tambien sera a eleccion propia.
El programa debe mostrarme el numero de identificacion del cliente, el numero de identificacion tendra que ser mayor de 5 numeros,
de lo contrario el programa nos mostrara una venmtana con un error. imprimir los valores de los respuestos comprados con descuento y sin descuento
los descuentos seran de Cliente tipo A 5%,  Cliente tipo B 10%, Cliente tipo C 15%, Cliente tipo D 20% */

import com.company.Main;

import javax.swing.*;

public class switchFirstExercise {
    int sinDescuento, contRepuestos, numCedula, valorRepuesto, tipoCliente, descuento5, valorTotal, contTotal=0;
    String continuar, seguirComprando;
    String cedula="";
    boolean entradaNumerica = true;

    public void ingresar(){
        cedula= JOptionPane.showInputDialog("Por favor ingrese el nuemero de documento de 6 dijitos");

        if(cedula.length() != 6){
            JOptionPane.showMessageDialog(null, "...Numero de identificacion incorrecto, por favor intentelo de nuevo!");
            entradaNumerica= false;
            ingresar();
        } else {
            tipoCliente=Integer.parseInt(JOptionPane.showInputDialog("Elija el tipo de cliente: \n1: A \n2: B \n3: C \n4: D"));
            calcular();
        }
    }
    public void calcular(){
        switch(tipoCliente){
            case 1:
                valorTotal=0;
                System.out.println("cliente tipo A \n El numero de identificacion del cliente es " + cedula );
                do{
                    valorRepuesto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del repuesto por favor"));
                    valorTotal+= valorRepuesto;
                    contRepuestos++;
                    continuar=JOptionPane.showInputDialog("Desea comprar oro repuesto ? YES/NO");

                }while(continuar.equalsIgnoreCase("YES"));

                System.out.println("El valor neto a pagar sin descuento es de" + valorRepuesto);
                descuento5= valorRepuesto * 5 / 100;
                System.out.println("El valor neto a pagar con el descuento del 5% es de " + descuento5);
                break;

        }

    }

    public void mostrar(){

        do{
            ingresar();
            calcular();
            seguirComprando=JOptionPane.showInputDialog("Desea seguir comprando repuestos ? YES/NO");
        }while(seguirComprando.equalsIgnoreCase("YES"));
        System.out.println("El numero total de repuestos comprados es de" + contRepuestos);
        System.out.println("La venta total de repuestos es de " );
    }



    public static void main(String[] args) {
        switchFirstExercise x = new switchFirstExercise();
        x.mostrar();

    }
}

