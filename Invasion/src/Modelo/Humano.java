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
    
    public  Humano(){
        super.setId(id_prox + 1);
    }
    
   
    public int getHijo(){
        
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
