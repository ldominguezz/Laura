/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_nf1_memory;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class UF5_NF1_Memory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String taula, parella;
        int files, columnes;
        boolean dimensions=false, acabat=false;
        System.out.println("###############################\n# Java Collection Memory Game #\n###############################");
        do{
            System.out.println(">> Indica la mida del tauler\nFormat: ColumnaxFila (p.ex. 3x4) (màx. 26 columnes): 3x2");
            taula=sc.nextLine();
            taula=taula.trim();
            columnes=Integer.parseInt(taula.substring(0,1));
            files = Integer.parseInt(taula.substring(2,3));

            Tauler t = new Tauler(files,columnes);
            dimensions=t.comprovaTauler();
            if(dimensions){
                t.omplirTauler();
                t.barrejar();
                t.mostrarTauler();
                do{
                    System.out.println(">> Indica dues parelles de cartes del tauler per donar la volta (p.ex. A1-B1): A1-B1");
                    parella=sc.nextLine();
                    parella=parella.toUpperCase();
                    t.moviment(parella);                
                    System.out.println("* Mostrant el tauler...");
                }while(!acabat);
            }else{
                System.out.println("Dades incorrectes");
            }
        }while(!dimensions);
    
    }
    
}
