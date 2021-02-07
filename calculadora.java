/*  Universidad del Valle de Guatemala 
    Estructura de Datos 
    Paola Contreras 
    Carne: 20213
    Fecha: 05/02/2021
    Proyecto 2 **/

    public interface calculadora{
        /**
        * Sum method 
        * @param x fist number needed to perform the operation 
        * @param y second number needed to perform the operation 
        * @return answer of the operation 
        */
       public int suma(int x, int y);
   
         /**
        * Substract method  
        * @param x fist number needed to perform the operation 
        * @param y second number needed to perform the operation 
        * @return answer of the operation 
        */
       public int resta(int x, int y);
   
         /**
        * Multiply method  
        * @param x fist number needed to perform the operation 
        * @param y second number needed to perform the operation 
        * @return answer of the operation 
        */
       public int multiplicacion(int x, int y);
   
         /**
        * Division method 
        * @param x fist number needed to perform the operation 
        * @param y second number needed to perform the operation 
        * @return answer of the operation 
        */
       public int division(int x, int y);
   
   
          /**
        * Method that performs the operations that are in the txt file. 
        * @param x stack that store the information of the txt file  
        * @return answer 
        */
       public int operar(stack x);
       
   
         /**
        * Method that reeds and decode the txt file line by line, this allows the program to make the operations. 
        * @param a txt document 
        * @return string with the answer 
        */
       public String decode(String a);
     }