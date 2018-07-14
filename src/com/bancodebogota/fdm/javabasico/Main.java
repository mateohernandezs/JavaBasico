/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaSimple<String> lista=new ListaSimple("1");      
        for (int i = 2; i <= 10; i++) {
            lista.insertarNodo(i+"");
        }
        
        for(String s : lista){
            System.out.println(s);
        }        
        
        ListaArray<String> listaArray=new ListaArray();
        
        for (int i = 1; i <= 10; i++) {
            listaArray.insertar(i+"");
        }        
        
        for(String s : listaArray){
            System.out.println(s);
        }      
        
    }
    
}
