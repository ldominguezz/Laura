/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_nf1_memory;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Laura
 */


public class Tauler {
    private int files;
    private int columnes;
    private ArrayList<Fitxa> tauler;
    
    public Tauler(int columnes, int files) {
        this.columnes = columnes;
        this.files = files;
        tauler = new ArrayList<Fitxa>();
    }
    
    boolean comprovaTauler(){
        System.out.println("* Calculant el tauler...");
        return files*columnes%2==0;
    }
    
    void omplirTauler(){
        for (int i=1; i<=(columnes*files/2); i++) {
            tauler.add(new Fitxa(i));
            tauler.add(new Fitxa(i));
        }
    }
    
    void mostrarTauler(){
        System.out.println("* Mostrant el tauler...");
        
        for (int i = 0; i <this.columnes; i++) {
            System.out.print("\t"+(char)('A' + i));
        }
        int cont=0,contfiles=1;
        System.out.println();
        System.out.print((contfiles)+"\t");
        for (Fitxa next : tauler) {
            if(cont==this.columnes){
                System.out.println();
                contfiles++;
                System.out.print((contfiles)+"\t");
                cont=0;
            }
            if(next.isDescoberta())
                System.out.print(next.getValor() + "\t");
            else
                System.out.print((char)next.getValor() + "\t");
            cont++;
        }
        System.out.println();
    }

    void barrejar() {
        for (int i=tauler.size()-1;i>1;i--){ 
            int alea=(int)Math.floor(i*Math.random()); 
            int temp=tauler.get(i).getValor(); 
            tauler.get(i).setValor(tauler.get(alea).getValor());
            tauler.get(alea).setValor(temp);
        }
    }

    void moviment(String parella) { 
        int fila1U, columna1U, fila2U, columna2U;
        columna1U=parella.charAt(0)-'A';
        fila1U=Integer.parseInt(parella.substring(1,2));
        fila1U--;
        columna2U=parella.charAt(3)-'A';
        fila2U=Integer.parseInt(parella.substring(4,5));
        fila2U--;
        int posFitxa1=(fila1U*(this.files-1)+columna1U);
        System.out.println(posFitxa1);
        int posFitxa2=(fila2U*(this.files-1)+columna2U);
        System.out.println(posFitxa2);
        
        System.out.println();
        Fitxa f1 = tauler.get(posFitxa1);
        Fitxa f2 = tauler.get(posFitxa2);
        f1.setDescoberta(true);
        f2.setDescoberta(true);
        System.out.println(f1.getValor());
        System.out.println(f2.getValor());
        
    }
 
}
