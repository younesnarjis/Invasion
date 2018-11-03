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
public class Zombie extends Seres {

    private static int id_prox;
    private int num_humano_zombie;
    public Zombie(int dia) {
        super.setNacer(dia);
        num_humano_zombie = 0;
        super.setId(id_prox + 1);
        id_prox += 1;
        probabilidad_tocahumano = 10;
    }

    public boolean tocaHumano() {
        return Constante.getTocadoProbabilidad(probabilidad_tocahumano, 1);
    }

    public void setProbabilidadTocaHumano(int p) {
        probabilidad_tocahumano = p;
    }

    public int getProbabilidad() {
        return probabilidad_tocahumano;
    }

    public void setNumHumanoZombie() {
        num_humano_zombie++;
    }
}
