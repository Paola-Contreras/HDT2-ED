/*  Universidad del Valle de Guatemala 
    Estructura de Datos 
    Paola Contreras 
    Carne: 20213
    Fecha: 05/02/2021
    Proyecto 2 **/

    import java.io.File;
    import java.io.IOException;
    import java.util.Scanner;
    
    public class Calcu implements calculadora{
    
        // atributs of the class 
        private stack<String> stack;
        private String message;
        private int total;
    
        public Calcu(){
            this.stack= new Stack_v<String>();
        }
        // Override of the methods of calculadora 
        // method that sum 
        public int suma(int x, int y) {
            return (x+y);
        }
        
        // method that rest 
        public int resta(int x, int y) {
            return (x-y);
        }
    
        // method that multiply 
        public int multiplicacion( int x, int y){
            return (x*y);
        }
    
        // method that divide
        public int division(int x, int y) {  
            return(x/y);
        }
    
        // Main method, this allows to carry out all the necessary operations 
        public int operar(stack x){
            String data= this.stack.pop().toString(); // sting that contains tha actual peek and convert it to string 
            int n1,n2; // numbers used to make operations 
    
            // condition to perform the operations if the stack is not empty
            while (! this.stack.empty()){
    
                // depending of the operation to be carry out, access the  necessary case 
                // the parseInt converts the string into a int so the operation can be perform 
                switch (data) {
                    case "+":
                        n1= Integer.parseInt(stack.pop());
                        n2= Integer.parseInt(stack.pop());
    
                        total= suma(n1,n2);
                        stack.push(Integer.toString(total));
                        message += ("Ha realizado una suma, los valors a utilizar fueron: " + n1 + n2 + "\n R//" + total); 
                        break;
    
    
                    case "-":
                        n1= Integer.parseInt(stack.pop());
                        n2= Integer.parseInt(stack.pop());
    
                        total= n1-n2;
                        stack.push(Integer.toString(total));
                        message += ("Ha realizado una resta, los valors a utilizar fueron: " + n1 + n2 + "\n R//" + total); 
                        break;
    
    
                    case "*":
                        n1= Integer.parseInt(stack.pop());
                        n2= Integer.parseInt(stack.pop());
    
                        total= n1*n2;
                        stack.push(Integer.toString(total));
                        message += ("Ha realizado una multiplicacion, los valors a utilizar fueron: " + n1 + n2 + "\n R//" + total); 
                        break;
    
    
                    case "/":
                        n1= Integer.parseInt(stack.pop());
                        n2= Integer.parseInt(stack.pop());
    
                        total= n1/n2;
                        stack.push(Integer.toString(total));
                        message += ("Ha realizado una division, los valors a utilizar fueron: " + n1 + n2 + "\n R//" + total); 
                        break;
    
    
                    default:
                        message += ("Ha ocurrido un error");
                        break;
                    }
                }
                return total;
            }
    
        // method that open the txt file
        public String decode(String a) {
    
            try{
                File document = new File("datos.txt"); // search and opend the document by itÂ´s name 
                Scanner scan= new Scanner(document); // Read the document 
               
                //Cicle that add every single line of the document to the stack 
                while (scan.hasNextLine()){
                    this.stack.push(scan.nextLine());
                }
    
            } catch (IOException e) {
                message += ("Ha ocurrido un error, intentelo nuevamente");
            }
    
            String[] spli; // list that contains the stack to split it line by line
            String spli_1; // string that save the stack1
    
            // If the stack is not empty it procedes to
            while (!stack.empty()) {
                spli_1 = this.stack.pop();
                spli = spli_1.split(" ");
    
                for (int i = spli.length; i>1; i--){
                    this.stack.push (spli[i]);
                }
                total= operar(this.stack);
                message+= (" El resultado es: " + total);
            }
            return message;
            
        }
        
    }