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
public class ListaSimple {

    private Nodo root;
    private Nodo nodoAct;

    public ListaSimple(Object o) {
        Nodo nodo = new Nodo(o);
        this.root = nodo;
        this.nodoAct = nodo;
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

    public void insertarNodo(Object o) {
        try {
            if (o instanceof String) {
                Nodo nodo = new Nodo(o);
                this.nodoAct.setNext(nodo);
                this.nodoAct = nodo;
            } else {
                throw new Exception("Tipo no permitido");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void listar() {
        Nodo nodo = this.root;
        System.out.println(nodo);
        while (nodo.getNext() != null) {
            nodo = nodo.getNext();
            System.out.println(nodo);
        }

    }
}
