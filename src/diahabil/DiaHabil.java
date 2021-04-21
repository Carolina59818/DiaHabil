
package diahabil;

import java.util.Scanner;

public class DiaHabil {



    public static void main(String[] args) {
        // Crear un metodo que determine si es el día es habil (lunes a viernes)
        //y emitir un mensaje o en su caso emitir un mensaje que es fin de semana.
        
        Scanner entrada = new Scanner(System.in); 
       
        System.out.println("Ingrese un dia de la semana para saber si es habil");     
        
        String dia;
        dia = entrada.nextLine();
        
        switch (dia) {
            case "Lunes":
                System.out.println( dia + " es dia habil");
                break;
            case "Martes":
                System.out.println( dia + " es dia habil");
                break;   
            case "Miercoles":
                System.out.println( dia + " es dia habil");
                break;
            case "Jueves":
                System.out.println( dia + " es dia habil");
                break;
            case "Viernes":
                System.out.println( dia + " es dia habil");
                break;
            default:
               System.out.println( dia + " no es dia habil");
            
        }
        
                
                
    }
    
}
