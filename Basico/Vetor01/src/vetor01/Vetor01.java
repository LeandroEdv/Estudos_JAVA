/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author VM RockWell
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n[] = new int[6];
        //int n[] = {32, 5, 6, 7, 7};
        //for (int i = 0; i < n.length; i ++){
         //   System.out.println("elemento " + n[i] + " na posição " + i);
       // }
       double v[] = {2.1, 0.32, 4, 123.4, 7.4};
       Arrays.sort(v);
       for (double valor : v){
           System.out.println("valor" + valor);
       }
       
    }
    
}
