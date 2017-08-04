package Codigos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Candinho Jr
 */
public class TesteHelloWorld {
    
  public static void main(String[] args) {
      TesteHelloWorld hi = new TesteHelloWorld();
      hi.imprimeTexto("Olá Professor!!!");
      hi.impremeTexto("Teste 02!");
  }
 
  public void imprimeTexto(String texto){
      System.out.println(texto);
  }
}
