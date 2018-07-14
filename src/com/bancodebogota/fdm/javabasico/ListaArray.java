/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;


/**
 *
 * @author mateo
 * @param <T>
 */
public class ListaArray<T> implements Iterable<T>{

    private int TAMANO = 4;
    private T[] values;
    private final static int INCREMENTO = 2;
    private int posicion;

    public ListaArray() {
        this.values = (T[]) new Object[this.TAMANO];
        this.posicion = 0;
    }

    public class MyIterator implements Iterator<T>{
        int actual = -1;
        
        @Override
        public boolean hasNext() {
            return actual<posicion;
        }

        @Override
        public T next() {
            if (!this.hasNext()) {
                System.out.println("No hay elemento siguiente");
                return null;
            }else{
                actual++;
                return ListaArray.this.values[actual];
            }
        }  
    }
    
    public void insertar(T objeto) {

        if ((posicion) == (this.TAMANO / INCREMENTO)) {
            this.values = Arrays.copyOf(values, this.TAMANO * INCREMENTO);
            this.TAMANO = this.TAMANO * INCREMENTO;
        }
        this.values[this.posicion] = objeto;
        System.out.println("Insertado: " + objeto.toString() + " - POSICION: " + this.posicion + " - TAMAÑO: " + this.TAMANO);
        ++this.posicion;
    }

    public void imprimir() {

        for (int i = 0; i < this.posicion; i++) {
            System.out.println(this.values[i].toString());
        }

    }

    public int getTAMANO() {
        return TAMANO;
    }
    
    

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }
    
}
