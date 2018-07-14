/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        
        
        
        //** ArrayList **
        ArrayList<String> arrayList = new ArrayList();
        
        for (int i = 1; i <=20; i++) {
            arrayList.add(i+"");
        }        
        Comparator<String> c = (o1, o2) -> {
            return o2.compareTo(o1); //To change body of generated lambdas, choose Tools | Templates.
        };
        
        
        
        System.out.println("Imprimiento array List");
        Collections.sort(arrayList, c);
        for(String s : arrayList){
            System.out.println(s);
        } 
       
        
        
        
    }
    
}
