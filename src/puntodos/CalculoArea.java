package puntodos;

import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        System.out.println("ingresa el valor del radio");
        Scanner ingresar = new Scanner(System.in);
        double radio = ingresar.nextInt();
        FIgura circulo = new FIgura();
        circulo.calculaAreaCirculo(radio);
        System.out.println(circulo);

    }
}
