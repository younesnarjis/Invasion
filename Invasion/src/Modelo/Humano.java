/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author YUYAN
 */
public class Humano extends Seres{
    private int velocidad;
    private static int id_prox;
    protected static float temperatura;
    private final int  probabilidad_muerte;
    private int probabilidad_reproduccion;
            
    public  Humano(int dia){
        super.setNacer(dia);
        velocidad = super.getNumeroAleatorio(60, 100);
        super.setId(id_prox + 1);
        probabilidad_muerte = 300;
        probabilidad_reproduccion = 30;   
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public boolean getSobrevivir(){
        if(super.getTocadoProbabilidad(300)){
            super.setMorir();
            return false;
        }
        else
            return true;
    }
    
    
    public void setTemperatura(float temp){
        if(temperatura >= 22)
            probabilidad_reproduccion = 15;
        else
            if(temperatura <= 18)
                probabilidad_reproduccion = 50;
            else
                probabilidad_reproduccion = 30;
    }
    
    public boolean getReproducir(){
       return super.getTocadoProbabilidad(probabilidad_reproduccion);
    }
    
   
    public int getHijo(){
        int num = super.getNumeroAleatorio(1, 3);
        return num;
    }
    
    @Override
    public String toString() {
        return null;
    }
    
    
    
    
}
