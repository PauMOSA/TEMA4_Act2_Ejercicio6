/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2_ejercicio6;
import java.util.Scanner;
/**
 *
 * @GLORIA PAULINA MORENO SALDIVAR
 */
public class Act2_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asignar = new Scanner(System.in);
        
        int ale = (int) (Math.random() * 10) + 1;
        System.out.println(ale);
        int num;
        System.out.println("ADIVINA EL NUMERO ALEATORIO");
        do
        {
            System.out.println("Ingresa el posible numero:");
            num = asignar.nextInt();
            if(num != ale)
            {
             if(num < ale)
             {
                 System.out.println("Es demasiado bajo");
             }
             else
             {
                 System.out.println("Es demasiado alto");
             }
            }
        }
        while(num != ale);
        System.out.println("Felicidades has encontrado el numero aleatorio");
     
    }
    
}
