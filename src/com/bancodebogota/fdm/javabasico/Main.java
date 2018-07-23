/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
        
        System.out.println("Imprimiento array List filtrado del 20 al 11 con lamda");
        arrayList.stream()
                .filter(num -> 10<Integer.parseInt(num))
                .sorted(c)
                .forEach(s -> System.out.println(s));

        System.out.println("Imprimiento HASHMAP");
        HashMap<String, String> hm = new HashMap();        
        for (int i = 1; i <= 100; i++) {      
            hm.put(i+"", new StringBuilder(i+"").reverse().toString());            
        }        
        hm.values().stream()
                .sorted(c)
                .forEach(s -> System.out.println(s));
        
        
        //FILE
    
        File objArc = new File("C:\\Users\\admin\\Desktop\\ArchivoEjmplo.txt");
    
        System.out.println("Nombre del Archivo: "+ objArc.getName());
        System.out.println("Path relativo: "+ objArc.getPath());
        System.out.println("Path Absoluto: "+ objArc.getAbsolutePath());
        System.out.println("Directorio Padre: "+ objArc.getParent());
        System.out.println(objArc.exists() ? "existe" : "no existe");
        System.out.println("Ultima modificacion: "+ objArc.lastModified());
        System.out.println(objArc.canWrite()? "es de escritura" : "no es de escritura");
        System.out.println(objArc.canRead()? "es de lectura" : "no es de lectura");
        System.out.println(objArc.isFile()? "archivo normal" : "no normal");
        System.out.println("Tamaño: "+ objArc.length() + "Bytes");
    }
    
     
    
  
    
}
