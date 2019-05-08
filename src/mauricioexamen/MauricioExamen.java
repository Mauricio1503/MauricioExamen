/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauricioexamen;

import java.util.Scanner;


/**
 *
 * @author ESTUDIANTE-IS
 */
public class MauricioExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.print("Numeros pares de 1000 al 964: "+ "\n");
      
      int numero=964;
      int limite=1000;
      while(numero<=1000){
       if(numero%2==0){
         System.out.print(numero+",") ; 
        }
       numero++;
      }
         
      
       Scanner entrada = new Scanner(System.in);
        int a= 0;
        System.out.println("Ingrese su edad: ");
          a=entrada.nextInt();
      
        
         if(a<21){
           System.out.println(" Menor de Edad");
        }
        else{
            if(a<60 && a>21){
               System.out.println("Mayor de Edad");
            }
            else{
                if(a>60){
                   System.out.println("Adulto Mayor");
    
            }
            }
         }
         
         System.out.println("ingrese un numero para saber a que dia de la semana pertenece");
        int numero = 0;
       while ( numero >7 || numero<1){
         numero =dias.nextInt();
          
          
       
         switch(numero){
             case 1:
                 System.out.println("Domingo");
                 break;
             case 2:
                 System.out.println("Lunes");
                 break;
             case 3:
                 System.out.println("Martes");
                 break;
             case 4:
                 System.out.println("Miercoles");
                 break;
             case 5:
                 System.out.println("Jueves");
                 break;
             case 6:
                 System.out.println("Viernes");
                 break;
             case 7:
                 System.out.println("Sabado");
                   break;
                    default:
                     System.out.println("ingreso otro numer0");
                     break;
                
         
         }
      
        
      
       }   
    
       
       System.out.print("Numeros pares de 1000 al 964: "+ "\n");
      
      int numero=964;
      int limite=1000;
      while(numero <=1000){
       if(numero%2==0){
         System.out.print(numero+",");
        }
       numero++;
      }
         
    }

    }

    
}             

