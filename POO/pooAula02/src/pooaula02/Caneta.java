/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaula02;
    


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("uma caneta"+ this.cor);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        
        }else{
            System.out.println("Estou rabiscando");
        }
}
    void tampar(){
    this.tampada = true;
    }
    void destampar(){
    this.tampada = false;
    
    } 
}
