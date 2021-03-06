/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author YUYAN
 */
public class HumanoCazaVampiros extends Humano implements Serializable{
    
    private int probabilidad_caza;
    private int num_vampiros; 
    private static int id_prox;
    
    public HumanoCazaVampiros(int dia) {
        super(dia);
        super.setId(id_prox+1);
        num_vampiros = 0;
        id_prox += 1;
        probabilidad_caza = 3;
    }
    
    public boolean getMataVampiro(){
        return Constante.getTocadoProbabilidad(probabilidad_caza,1);
    }
    
    public void setMataVampiro(){
        num_vampiros ++;
    }
    
    public int getNumVampirosMatado(){
        return num_vampiros;
    }
}
