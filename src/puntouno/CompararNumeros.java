package puntouno;

import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        int numeroUno = 0;
        int numeroDos = 0;

        System.out.println("ingresa el primer valor");
        numeroUno = ingresar.nextInt();

        System.out.println("ingresa el segundo valor");
        numeroDos = ingresar.nextInt();

        if (numeroUno > numeroDos){
            System.out.println(numeroUno + " es el valor mayor");
        }else if (numeroDos == numeroUno){
            System.out.println("los numeros ingresados son inguales");
        }else{
            System.out.println(numeroDos + " es el valor mayor");
        }
    }
}
