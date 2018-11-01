/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static Modelo.Humano.temperatura;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author YUYAN
 */
public class Invacion {

    private ArrayList<Humano> humanos;
    private ArrayList<HumanoCazaVampiros> caza_vampiros;
    private ArrayList<Vampiro> vampiros;
    private ArrayList<Zombie> zombies;
    private int dia;
    private float temperatura;

    public Invacion() {
        humanos = new ArrayList<>();
        caza_vampiros = new ArrayList<>();
        vampiros = new ArrayList<>();
        zombies = new ArrayList<>();
        dia = 1;
        temperatura = 20;
    }

    public void setCrearHumanos(int num) {
        int i;
        Humano h;
        for (i = 0; i < num; i++) {
            h = new Humano(dia);
            humanos.add(h);
        }
    }

    public void setCrearHumanosCazaVampiro(int num) {
        int i;
        HumanoCazaVampiros h;
        for (i = 0; i < num; i++) {
            h = new HumanoCazaVampiros(dia);
            caza_vampiros.add(h);
        }
    }

    public void setCrearVampiros(int num) {
        int i;
        Vampiro h;
        for (i = 0; i < num; i++) {
            h = new Vampiro(dia);
            vampiros.add(h);
        }
    }

    public void setCrearZombies(int num) {
        int i;
        Zombie h;
        for (i = 0; i < num; i++) {
            h = new Zombie(dia);
            zombies.add(h);
        }
    }

    public int getDia() {
        return dia;
    }

    public void setPasaDia() {
        dia++;
    }

    public void setTemperatura() {

        int num = getNumeroAleatorio(1, 100);
        if (temperatura >= 22) {
            if (num <= 55) {
                temperatura -= 0.5;
            } else {
                temperatura += 0.5;
            }

        } else if (temperatura <= 18) {
            if (num <= 55) {
                temperatura += 0.5;
            } else {
                temperatura -= 0.5;
            }

        } else {
            if (num <= 65) {
                temperatura += 0.5;
            } else if (num > 65 && num <= 95) {
                temperatura -= 0.5;
            }
        }
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setGenerarMundo() {
        int num_h = getNumeroAleatorio(4000, 6000);
        int num_hcv = getNumeroAleatorio(10, 15);
        int num_v = getNumeroAleatorio(15, 20);
        int num_z = getNumeroAleatorio(20, 30);
        setCrearHumanos(num_h);
        setCrearHumanosCazaVampiro(num_hcv);
        setCrearVampiros(num_v);
        setCrearZombies(num_z);
    }

 
    public void setTranscurrirDia(){
        
    }
    
    public void setVidaHumano(){
    }

    public void setVidaHumanoCazaVampiro(){
        
    }
    
    public void setVidaVampiro(){
        
    }
    
    public void setZombie(){
        
    }
 
    
    public int getNumeroAleatorio(int min, int max) {
        Random random = new Random();
        int num;
        num = random.nextInt(max - min + 1) + min;

        return num;
    }

}
