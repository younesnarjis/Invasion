/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Collections;
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

    }

    public void setCrearHumanos(int num) {
        int i;
        Humano h;
        for (i = 0; i < num; i++) {
            h = new Humano(dia);
            humanos.add(h);
        }
    }
    
    public String getHumanos(){
        return Integer.toString(humanos.size());
    }
    
    public void setCrearHumanosCazaVampiro(int num) {
        int i;
        HumanoCazaVampiros h;
        for (i = 0; i < num; i++) {
            h = new HumanoCazaVampiros(dia);
            caza_vampiros.add(h);
        }
    }
    
    public String getHumanosCazaVampiros(){
        return Integer.toString(caza_vampiros.size());
    }

    public void setCrearVampiros(int num) {
        int i;
        Vampiro h;
        for (i = 0; i < num; i++) {
            h = new Vampiro(dia);
            vampiros.add(h);
        }
    }
    
    public String getVampiros(){
        return Integer.toString(vampiros.size());
    }
    public void setCrearZombies(int num) {
        int i;
        Zombie h;
        for (i = 0; i < num; i++) {
            h = new Zombie(dia);
            zombies.add(h);
        }
    }
    
    public String getZombies(){
        return Integer.toString(zombies.size());
    }

    public int getDia() {
        return dia;
    }

    public void setPasaDia() {
        dia++;
    }
    
    public void setPasaDiezDia() {
       dia = dia + 10;
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
        vampiros.clear();
        zombies.clear();
        humanos.clear();
        caza_vampiros.clear();
        int num_h = getNumeroAleatorio(4000, 6000);
        int num_hcv = getNumeroAleatorio(10, 15);
        int num_v = getNumeroAleatorio(15, 20);
        int num_z = getNumeroAleatorio(20, 30);
        setCrearHumanos(num_h);
        setCrearHumanosCazaVampiro(num_hcv);
        setCrearVampiros(num_v);
        setCrearZombies(num_z);
                dia = 1;
        temperatura = 20;
    }

    public void setTranscurrirDia() {
        setVidaHumano();
        setVidaHumanoCazaVampiro();
        setVidaVampiro();
        setVidaZombie();    
    }

    public void setVidaHumano() {
        ArrayList<Humano> morir = new ArrayList<>();
        ArrayList<Humano> nacer = new ArrayList<>();
        Humano h, hijo;
        int v;
        int hijos;
        int i, j;
        for (i = 0; i < humanos.size(); i++) {
            h = humanos.get(i);
            if (!h.getSobrevivir()) {
                morir.add(h);
            } else {
                if (h.getReproducir(temperatura)) {
                    hijos = h.getHijo();
                    v = h.getVelocidad();
                    for (j = 0; j < hijos; j++) {
                        hijo = new Humano(dia);
                        hijo.setVelocidad(v);
                        nacer.add(hijo);
                    }
                }
            }
        }

        for (i = 0; i < morir.size(); i++) {
            humanos.remove(morir.get(i));
        }

        for (j = 0; j < nacer.size(); j++) {
            humanos.add(nacer.get(j));
        }

        morir.clear();
        nacer.clear();
    }

    public void setVidaHumanoCazaVampiro() {
        ArrayList<HumanoCazaVampiros> morir = new ArrayList<>();
        ArrayList<HumanoCazaVampiros> nacer = new ArrayList<>();
        ArrayList<Vampiro> vam = new ArrayList<>();
        HumanoCazaVampiros h, hijo;

        int v;
        int hijos;
        int i, j, num;
        for (i = 0; i < caza_vampiros.size(); i++) {
            h = caza_vampiros.get(i);
            if (!h.getSobrevivir()) {
                morir.add(h);
            } else {
                if (h.getReproducir(temperatura)) {
                    hijos = h.getHijo();
                    v = h.getVelocidad();
                    for (j = 0; j < hijos; j++) {
                        hijo = new HumanoCazaVampiros(dia);
                        hijo.setVelocidad(v);
                        nacer.add(hijo);
                    }
                }

                if (h.getMataVampiro() && vampiros.size() > 1) {
                    num = getNumeroAleatorio(0, vampiros.size() - 1);
                    h.setMataVampiro();
                    vam.add(vampiros.get(num));
                }
            }
        }

        for (i = 0; i < morir.size(); i++) {
            humanos.remove(morir.get(i));
        }

        for (j = 0; j < nacer.size(); j++) {
            humanos.add(nacer.get(j));
        }

        for (i = 0; i < vam.size(); i++) {
            vampiros.remove(vam.get(i));
        }

        morir.clear();
        nacer.clear();
        vam.clear();

    }

    public void setVidaVampiro() {
        int i, num;
        ArrayList<Vampiro> nacer = new ArrayList<>();
        ArrayList<Vampiro> morir = new ArrayList<>();
        Vampiro v;
        for (i = 0; i < vampiros.size(); i++) {
            if (vampiros.get(i).getMataHumano()) {
                if (humanos.isEmpty()) {
                    morir.add(vampiros.get(i));
                } else {
                    num = getNumeroAleatorio(0, humanos.size() - 1);
                    v = humanos.get(num).getConvierteVampiro();
                    humanos.remove(num);
                    if (v != null) {
                        nacer.add(v);
                        vampiros.get(i).setNumConvertirVampiros();
                    }
                }
            }
        }

        for (i = 0; i < morir.size(); i++) {
            vampiros.remove(morir.get(i));
        }

        for (i = 0; i < nacer.size(); i++) {
            vampiros.add(nacer.get(i));
        }

        morir.clear();
        nacer.clear();
    }

    public void setVidaZombie() {
        int i;

        ArrayList<Zombie> nacer = new ArrayList<>();
        ArrayList<Zombie> morir = new ArrayList<>();
        ArrayList<Humano> h = new ArrayList<>();
        ArrayList<Humano> hc = new ArrayList<>();
        SortArrayList s = new SortArrayList();
        Zombie zom;
        if (!humanos.isEmpty()) {
            h.addAll(humanos);
            Collections.sort(h, s);
        }

        if (!caza_vampiros.isEmpty()) {
            hc.addAll(caza_vampiros);
            Collections.sort(hc, s);
        }

        for (i = 0; i < zombies.size(); i++) {
            // no cuenta el dia de nacimiento 
            if ((dia - zombies.get(i).getDiaNacimiento()) == 1) {
                morir.add(zombies.get(i));
            } else {
                if (zombies.get(i).tocaHumano() && (!humanos.isEmpty() || !caza_vampiros.isEmpty())) {
                    zom = getZombieHumano();
                    nacer.add(zom);
                }
            }

        }
        for (i = 0; i < morir.size(); i++) {
            zombies.remove(morir.get(i));
        }

        for (i = 0; i < nacer.size(); i++) {
            zombies.add(nacer.get(i));
        }

        nacer.clear();
        morir.clear();

    }

    public Zombie getZombieHumano() {
        Zombie zom;
        boolean flag_h = false;
        if ((!humanos.isEmpty() && !caza_vampiros.isEmpty())) {
            if (humanos.get(0).getVelocidad() > caza_vampiros.get(0).getVelocidad()) {
                zom = caza_vampiros.get(0).getConvierteZombie();
            } else {
                zom = humanos.get(0).getConvierteZombie();
                flag_h = true;
            }
        } else if (humanos.isEmpty()) {
            zom = caza_vampiros.get(0).getConvierteZombie();
        } else {
            zom = humanos.get(0).getConvierteZombie();
            flag_h = true;
        }

        if (flag_h) {
            humanos.remove(0);
        } else {
            caza_vampiros.remove(0);
        }

        return zom;

    }

    public int getNumeroAleatorio(int min, int max) {
        Random random = new Random();
        int num;
        num = random.nextInt(max - min + 1) + min;

        return num;
    }

}
