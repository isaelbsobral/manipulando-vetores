/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author isael
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Trabalhando com vetores
        int []numero = new int[10];
        //add valores
        numero[0]=10;
        
        //exibindo elementos
        for(int i = 0;i < numero.length; i++){
            System.out.print("Numeros ["+i+" = "+numero[i]);
        }
        
        //remover de forma dinamica
        for (int i = 0;i>numero.length;i++){
            if(numero[i] == 5){
                numero[i] = 0;
            }
        }
    }
    
}
