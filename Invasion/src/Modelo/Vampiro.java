/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author younes
 */
public class Vampiro extends Seres{
    
    private int num_vamp_generados;
    private static int id_prox;
 
    public Vampiro(int dia){
        super.setId(id_prox + 1);
        super.setNacer(dia);
        id_prox += 1;
        this. num_vamp_generados = 0;
    }

    public boolean getMataHumano(){
        return Constante.getTocadoProbabilidad(2, 1);
    }

    public void setNumConvertirVampiros(){
         num_vamp_generados ++;
    }
}
