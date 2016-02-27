/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

/**
 *
 * @author José Luis Rincón y Diana Marcela Molina
 * @version 1.0
 * since 02/24/2016
 */
public class Diagrama1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mayor=0;
        int a, b, c;
        java.util.Scanner lectura=new java.util.Scanner(System.in);
        System.out.print("Ingrese A: ");
        a=lectura.nextInt();
        System.out.print("Ingrese B: ");
        b=lectura.nextInt();
        System.out.print("Ingrese C: ");
        c=lectura.nextInt();
        
        if (a>b){
            if (a>c){
                System.out.println("El numero mayor es  "+a);
        
            }
            else{
                System.out.println("El numero mayor es "+c);
                
            }
        }
        else{
            if (b>c){
             System.out.println("El numero mayor es "+b);   
            }
            else{
                System.out.println("El numero mayor es "+c);
            }
            
        }
    }
    
}
