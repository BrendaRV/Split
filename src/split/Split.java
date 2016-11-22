/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package split;

/**
 *
 * @author Brenda
 */
public class Split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase ="Anita lava la tina";
        String[] partes = frase.split("");
        for(int i=0; i<partes.length; i++){
            if(partes[i].equals(" ")){
                partes[i] = "1";
            }
            System.out.print(partes[i]);
        }
        System.out.println("");
    }
    
}
