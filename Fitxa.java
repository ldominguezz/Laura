/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_nf1_memory;

/**
 *
 * @author Laura
 */
public class Fitxa {

    private int valor;
    private boolean descoberta=false;

    public Fitxa(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        if(!descoberta)
            return 42;
        else
            return valor;
    }

    public boolean isDescoberta() {
        return descoberta;
    }

    public void setDescoberta(boolean descoberta) {
        this.descoberta = descoberta;
    }
    
}
