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
public class Humano extends Seres {

    private int velocidad;
    private static int id_prox;
    private final int probabilidad_muerte;
    private int probabilidad_reproduccion;

    public Humano(int dia) {
        super.setNacer(dia);
        velocidad = super.getNumeroAleatorio(60, 100);
        super.setId(id_prox + 1);
        probabilidad_muerte = 300;
        probabilidad_reproduccion = 30;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int num) {
        velocidad = num;
    }

    public Vampiro getConvierteVampiro() {
        if (super.getTocadoProbabilidad(2, 1)) {
            Vampiro v = new Vampiro(this.getDiaNacimiento());
            return v;
        }

        return null;
    }

    public Zombie getConvierteZombie(int dia) {
        Zombie v = new Zombie(dia);
        return v;
    }

    public boolean getSobrevivir() {
        if (super.getTocadoProbabilidad(300, 1)) {
            super.setMorir();
            return false;
        } else if (super.getTocadoProbabilidad(500, 1)) {
            super.setMorir();
            return false;
        } else {
            return true;
        }
    }

    public void setProbabilidadReproduccion(float temp) {
        if (temp >= 22) {
            probabilidad_reproduccion = 15;
        } else if (temp <= 18) {
            probabilidad_reproduccion = 50;
        } else {
            probabilidad_reproduccion = 30;
        }
    }

    public boolean getReproducir(float temp) {
        this.setProbabilidadReproduccion(temp);
        return super.getTocadoProbabilidad(probabilidad_reproduccion, 1);
    }

    public int getHijo() {
        int num = super.getNumeroAleatorio(1, 3);
        return num;
    }

}
