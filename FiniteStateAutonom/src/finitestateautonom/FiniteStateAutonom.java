/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiniteStateAutonom;

/**
 *
 * @author jt024
 */
public class FiniteStateAutonom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean loop = true;
        int state=1;
        String read;
        int iterator=0;
        String[] tape = {"a","b","b","b","b","b","a","a","b","b","a","b","b","b","b"};
        
        while(loop){
            
            switch(state){
                
                case 1:
                    if(tape[iterator].equals("a")){
                        state=2;
                        iterator++;
                        break;
                    }
                    else{
                        state=3;
                        iterator++;
                        break;
                    }
                    
                case 2:
                    if(tape[iterator].equals("a")){
                        state=2;
                        iterator++;
                        break;
                    }
                    else{
                        state=3;
                        iterator++;
                        break;
                    }
                case 3:
                    if(tape[iterator].equals("a")){
                        state=2;
                        iterator++;
                        break;
                    }
                    else{
                        state=3;
                        iterator++;
                        break;
                    }                    
                case 4:
                    if(tape[iterator].equals("a")){
                        state=2;
                        iterator++;
                        break;
                    }
                    else{
                        state=3;
                        iterator++;
                        break;
                    }                    
                case 5:
                    if(tape[iterator].equals("a")){
                        state=2;
                        iterator++;
                        break;
                    }
                    else{
                        state=3;
                        iterator++;
                        break;
                    }                    
                case 6:
                    if(tape[iterator].equals("a")){
                        state=2;
                        iterator++;
                        break;
                    }
                    else{
                        state=3;
                        iterator++;
                        break;
                    }                    
                case 7:
                    
                    
                    
                    
                default: 
                    
                                        
                }
        }
        
        
    }
    
}
