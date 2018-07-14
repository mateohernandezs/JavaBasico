/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.Iterator;
import java.util.function.Consumer;



/**
 *
 * @author mateo
 * @param <T>
 */
public class ListaSimple<T> implements Iterable <T>{

    private Nodo root;
    private Nodo nodoAct;

    public ListaSimple(T o) {
        Nodo nodo = new Nodo(o);
        this.root = nodo;
        this.nodoAct = nodo;
    }
    
    public class MyIterator implements Iterator<T>{        
        Nodo iterador;

        public MyIterator() {
            this.iterador = root;
        }        
        
        @Override
        public boolean hasNext() {
            return iterador!=null;
        }

        @Override
        public T next() {
            T valor = (T)iterador.getValue();
            iterador = iterador.getNext();            
            return valor;
        }   
    }
    
    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public Nodo getNodoAct() {
        return nodoAct;
    }

    public void setNodoAct(Nodo nodoAct) {
        this.nodoAct = nodoAct;
    }

    public void insertarNodo(T o) {
        Nodo nodo = new Nodo(o);
        this.nodoAct.setNext(nodo);
        this.nodoAct = nodo;

    }
    /*
    public void listar() {
        Nodo nodo = this.root;
        System.out.println(nodo);
        while (nodo.getNext() != null) {
            nodo = nodo.getNext();
            System.out.println(nodo);
        }

    }    */

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

}
