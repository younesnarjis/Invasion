/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author YUYAN
 */
public abstract class Seres {
    private int id;
    private int dia_nacimiento;
    private boolean estado_vivo;  // si es true esta vivo, si es false esta muerto 
    
    public Seres(){
        this.dia_nacimiento = 0;
        estado_vivo = false;
    }
    

    public void setNacer(int dia){
        this.dia_nacimiento = dia;
        estado_vivo = true;
    }
    
    public void setMorir(){
        this.estado_vivo = false;
    }
    
    public boolean getEstadoVivo(){
        return estado_vivo;
    }
    
    public int getDiaNacimiento(){
        return dia_nacimiento;
    }
    
    public void setId(int id){
        this.id = id;
    }
    

    public int  getId(){
        return id;
    }
}
    

