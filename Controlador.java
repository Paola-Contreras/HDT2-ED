/*  Universidad del Valle de Guatemala 
    Estructura de Datos 
    Paola Contreras 
    Carne: 20213
    Fecha: 05/02/2021
    Proyecto 2 **/

    import java.util.Scanner;
	
    public class Controlador {
        public static void main(String[] args) {
            Calcu cal= new Calcu();
            Scanner scan = new Scanner (System.in);
            int opc = 0;
            String opcS;
            
            
            // Welcome Message 
            System.out.println("\n\nBienvenido a la calculadora Posfix ");
             while (opc != 2) {
                 System.out.println("\n\nMENU PRINCIPAL:");
                 System.out.println("1. Leer archivo .txt");
                 System.out.println("2. Salir de la calculadora");
                 
                 // Ask the user the option to use
                 System.out.println("\nIngrese la opcion a la cual desea acceder: ");
                 opcS= scan.nextLine();
    
                 // Convert string to int
                 try {
                     opc = Integer.parseInt(opcS);
                 } catch (Exception e) {
                     System.out.println("Ocurrio un Error. Ingrese un número valido");
                 }
                 switch (opc) {
                 case 1:
                     System.out.println("\nLeyendo archivo.... espere \n");
                     String ms = "";
                     String msj = cal.decode(ms);
                     System.out.println("\n" + msj);
                     
                     break;
                 case 2:
                     System.out.println("\n\n\n\n Cerrando programa...\n");
                     break;
                     
                 default:
                     System.out.println("Error. Ingrese una opcion valida");
                     break;
                     
                 }
             }
        }
    }
    