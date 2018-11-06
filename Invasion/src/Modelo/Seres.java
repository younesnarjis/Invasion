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
public abstract class Seres implements Serializable{
    
    private int id;
    private int dia_nacimiento;
 
    public Seres(){
        this.dia_nacimiento = 0;
    }
    
    public void setNacer(int dia){
        this.dia_nacimiento = dia;
    }
   
    public int getDiaNacimiento(){
        return dia_nacimiento;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
}
