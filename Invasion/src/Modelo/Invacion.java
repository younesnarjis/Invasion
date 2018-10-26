/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author YUYAN
 */
public class Invacion {
    private ArrayList<Humano> humanos;
    private ArrayList<HumanoCazaVampiros> caza_vampiros;
    private ArrayList<Vampiro> vampiros;
    private ArrayList<Zombie> zombies;
    private int dia;
    private float temperatura;
    public Invacion(){
        humanos = new ArrayList<>();
        caza_vampiros = new ArrayList<>();
        vampiros = new ArrayList<>();
        zombies = new ArrayList<>();
        dia = 1;
        temperatura = 20;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setPasaDia(){
        dia ++;
    }
    
    public void setTemperatura(){
        if(temperatura >= 22){
        }
    }
    
    public float getTemperatura(){
        return temperatura;
    }
    
    public void setGenerarMundo(){
        
    }
    
    
    public void setIniciarJuego(){
        
    }
    
    
    
    
    
}
