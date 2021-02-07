/*  Universidad del Valle de Guatemala 
    Estructura de Datos 
    Paola Contreras 
    Carne: 20213
    Fecha: 05/02/2021
    Proyecto 2 **/

    import java.util.*; 

    public class Stack_v<E> implements stack<E> {
        protected Vector<E> data;
    
        // post: constructs a new empty stack 
        public Stack_v(){
            data = new Vector<E>(0,1);
        }
        // pre: 
       // post: item is added to stack
       // will be popped next if no intervening push
        public void push(E item) {
            
            data.add(item);
        }
        
       // pre: stack is not empty
       // post: most recently pushed item is removed and returned
        public E pop() {
    
            return data.remove(size()-1);
        }    
    
       // pre: stack is not empty
       // post: top value (next to be popped) is returned
        public E peek() {
            return data.get(size()-1);
        }
        
    
       // post: returns true if and only if the stack is empty
        public boolean empty() {
            return size() == 0;
        }
    
      // post: returns the number of elements in the stack
        public int size() {
            return data.size();
        }
    
    }
    