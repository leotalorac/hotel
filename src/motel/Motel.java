/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motel;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Motel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean t = true;
        boolean f  = true;
        int a,b,c;
        Hotel h;
        while(t){
            
            Scanner sc = new Scanner(System.in);
            if(f){    
                System.out.println("Configura el hotel inicial");
                System.out.println("ingresa el numero de habitaciones del piso 1:");
                 a = sc.nextInt();
                System.out.println("ingresa el numero de habitaciones del piso 2:");
                 b = sc.nextInt();
                System.out.println("ingresa el numero de habitaciones del piso 3:");
                 c = sc.nextInt();
                h = new Hotel(a,b,c);
                f = false;
            }
            System.out.println("ingresa la fecha de hoy");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Fecha hoy = new Fecha(a,b,c);

            System.out.println("Que quieres realizar:");
            System.out.println("1: Rentar habitacion ");
            System.out.println("2: Listar personas en la habitacion ");
            System.out.println("3: salir");
            int o = sc.nextInt();
            switch(o){
                case 1:
                    h.Rentar();
                    break;
                case 2: 
                    h.ListarHab();
                    break;
                case 3:
                    t = false;
                    break;

            }
        }
        
        
        
        
    }
    
}
