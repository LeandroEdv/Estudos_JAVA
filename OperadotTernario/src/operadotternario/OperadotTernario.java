/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadotternario;

/**
 *
 * @author VM RockWell
 */
public class OperadotTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int n1 = 0, n2 = 0, r;
        r = (n1 > n2)? 0:1;
        System.out.println(r);*/
       int x = 13, y = 2, z = 2;
       boolean r = false;
       
       r = (x < y ^ y == z)? true:false;
        System.out.println(r);
       
    }
    
}
