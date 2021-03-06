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
public class Zombie extends Seres implements Serializable{
    
    private static int id_prox;
    private int num_humano_zombie;
    private  int probabilidad_tocahumano;
    
    public Zombie(int dia){
        super.setNacer(dia);
        num_humano_zombie = 0;
        super.setId(id_prox + 1);
        id_prox += 1;
        probabilidad_tocahumano = 10;
    }
    
    public boolean tocaHumano(){
        return Constante.getTocadoProbabilidad(probabilidad_tocahumano, 1);
    }
    
    public void setProbabilidadTocaHumano(int p){
        probabilidad_tocahumano = p;
    }

    public  int getProbabilidadTocaHumano(){
        return probabilidad_tocahumano;
    }
    
    public void setNumHumanoZombie(){
        num_humano_zombie ++;
    }
}
