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
public class Zombie extends Seres{
    private static int id_prox;
    private int tiempo_vida;
    private int num_humano_zombie;
    
    public Zombie(int dia){
        super.setNacer(dia);
        tiempo_vida = 8;
        num_humano_zombie = 0;
        super.setId(id_prox + 1);
    }
    
    public boolean tocaHumano(){
        return super.getTocadoProbabilidad(10, 1);
    }
    
    public void setMenosTiempoVida(){
        tiempo_vida ++;
    }
    
    public void setNumHumanoZombie(){
        num_humano_zombie ++;
    }
    
    
    
    
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
