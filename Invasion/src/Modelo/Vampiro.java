/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Younes
 */
public class Vampiro extends Seres{
    private int num_vamp_generados;
    private static int id_aprox;
 
    public Vampiro(int dia){
        super.setId(id_aprox + 1);
        super.setNacer(dia);
        this. num_vamp_generados = 0;
    }
    
    public boolean getMataHumano(){
        return super.getTocadoProbabilidad(2, 1);
    }

    public void setNumConvertirVampiros(){
         num_vamp_generados ++;
    }
}
