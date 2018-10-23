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
public abstract class Seres {
    private int id;
    private int dia_nacimiento;
    
    public Seres(int dia){
        this.dia_nacimiento = dia;
    }
    
    public abstract String toString();
    
}
