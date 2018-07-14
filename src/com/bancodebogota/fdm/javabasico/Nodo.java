/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

/**
 *
 * @author mateo
 * @param <T>
 */
public class Nodo<T> {
  
    private T value;
    private Nodo next;

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public Nodo getNext() {
        return next;
    }

    public Nodo(T value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return this.value.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
