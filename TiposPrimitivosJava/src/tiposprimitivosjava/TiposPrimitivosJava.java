/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivosjava;

import java.util.Scanner;

/**
 *
 * @author VM RockWell
 */
public class TiposPrimitivosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.println("digite a nota");
        float nota = teclado.nextFloat();
        System.out.printf("a nota de %s é %.2f \n", nome, nota);
        
        //System.out.format("");
    }
    
}
