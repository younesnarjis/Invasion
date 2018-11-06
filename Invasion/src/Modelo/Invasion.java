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
public class Invasion {

    private ArrayList<Humano> humanos;
    private ArrayList<HumanoCazaVampiros> caza_vampiros;
    private ArrayList<Vampiro> vampiros;
    private ArrayList<Zombie> zombies;
    private int dia;
    private int[] estadistica;
    private float temperatura;

    public Invasion() {
        humanos = new ArrayList<>();
        caza_vampiros = new ArrayList<>();
        vampiros = new ArrayList<>();
        zombies = new ArrayList<>();
        estadistica = new int[10];

    }
    
    
    public void setVaciarEstadistica(){
        for(int i = 0; i < estadistica.length; i++)
            estadistica[i] = 0;
    }
    
    
    public String toString(){
        String s;
        s = "\n-------------\nDia: " + dia + "\nTemperatura: " + temperatura +"\n-------------\n";
        s += estadistica[0] + "\thumanos han nacido\n" + estadistica[1] + "\thumanos ha muerto por muerte natural o accidente\n"+
                estadistica[2] + "\thumanos de caza vampiros han nacido\n" + estadistica[3] + "\thumanos de caza vampiros han muerto" +
                " por muerte natura o accidente\n" + estadistica[4] + "\thumanos han sido mordeado por vampiros\n" + estadistica[5]+
                "\thumanos han convertido a vampiros\n" + (estadistica[4] - estadistica[5]) + "\thumanos han muertos por que han sido" +
                " mordeado por vampiros\n" + (estadistica[6] + estadistica[7]) + "\tvampiros han muerto\n" + estadistica[7] + 
                 "\tvampiros han muerto por humano de caza vampiros\n" + estadistica[6] + "\tvampiros han muerto por inanición\n"+
                estadistica[8] + "\tzombies han muertos por hambre\n" + estadistica[9] + "\thumanos o humanos de caza vampiros han "+
                "convertido zombies.";
        
        return s;
    }
    
    public void setCambiarProbabilidadZombies(int p){
        for(int i = 0; i < zombies.size(); i++){
            zombies.get(i).setProbabilidadTocaHumano(p);
        }
    }

    public void setCrearHumanos(int num) {
        int i;
        Humano h;
        for (i = 0; i < num; i++) {
            h = new Humano(dia);
            humanos.add(h);
        }
    }
    
    public String getNumeroHumanos(){
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
    
    public String getNumeroHumanosCazaVampiros(){
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
    
    public String getNumeroVampiros(){
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
    
    public String getNumeroZombies(){
        return Integer.toString(zombies.size());
    }

    public String getDia() {
        return Integer.toString(dia);
    }

    public void setPasarDia() {
        dia++;
    }
    
    
    public void setAumentaLaTemperatura(float t){
        temperatura += t;
    }
    
    public void setTemperatura() {

        int num = Constante.getNumeroAleatorio(1, 100);
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

    public String getTemperatura() {
        return temperatura+"";
    }

    public void setGenerarMundo() {
        vampiros.clear();
        zombies.clear();
        humanos.clear();
        caza_vampiros.clear();
        int num_h = Constante.getNumeroAleatorio(4000, 6000);
        int num_hcv = Constante.getNumeroAleatorio(10, 15);
        int num_v = Constante.getNumeroAleatorio(15, 20);
        int num_z = Constante.getNumeroAleatorio(20, 30);
        setCrearHumanos(num_h);
        setCrearHumanosCazaVampiro(num_hcv);
        setCrearVampiros(num_v);
        setCrearZombies(num_z);
                dia = 1;
        temperatura = 20;
    }

    public void setTranscurrirDia() {

        setVaciarEstadistica();
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
        //nacer de humano
        estadistica[0] = nacer.size();
        //morir de humano
        estadistica[1] = morir.size();
        
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
                    num = Constante.getNumeroAleatorio(0, vampiros.size() - 1);
                    h.setMataVampiro();
                    vam.add(vampiros.get(num));
                }
            }
        }

        estadistica[2] = nacer.size();
        estadistica[3] = morir.size();
        estadistica[7] = vam.size();
        
        for (i = 0; i < morir.size(); i++) {
            caza_vampiros.remove(morir.get(i));
        }

        for (j = 0; j < nacer.size(); j++) {
            caza_vampiros.add(nacer.get(j));
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
        int h = 0;
        for (i = 0; i < vampiros.size(); i++) {
            if (vampiros.get(i).getMataHumano()) {
                if (humanos.isEmpty()) {
                    morir.add(vampiros.get(i));
                } else {
                    num = Constante.getNumeroAleatorio(0, humanos.size() - 1);
                    h++;
                    v = humanos.get(num).getConvierteVampiro();
                    humanos.remove(num);
                    if (v != null) {
                        nacer.add(v);
                        vampiros.get(i).setNumConvertirVampiros();
                    }
                }
            }
        }

        
        estadistica[4] = h;
        estadistica[5] = nacer.size();
        estadistica[6] = morir.size();
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
            System.out.println("Zombies " + zombies.get(i).getId() + " probabilidad: " + zombies.get(i).getProbabilidadTocaHumano());
            if ((dia - zombies.get(i).getDiaNacimiento()) == 8) {
                morir.add(zombies.get(i));
            } else {
                if (zombies.get(i).tocaHumano() && (!humanos.isEmpty() || !caza_vampiros.isEmpty())) {
                    zom = getZombieHumano();
                    zom.setProbabilidadTocaHumano(zombies.get(i).getProbabilidadTocaHumano());
                    nacer.add(zom);
                }
            }

        }
        
        estadistica[8] = morir.size();
        estadistica[9] = nacer.size();
        
        
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
                zom = caza_vampiros.get(0).getConvierteZombie(dia);
            } else {
                zom = humanos.get(0).getConvierteZombie(dia);
                flag_h = true;
            }
        } else if (humanos.isEmpty()) {
            zom = caza_vampiros.get(0).getConvierteZombie(dia);
        } else {
            zom = humanos.get(0).getConvierteZombie(dia);
            flag_h = true;
        }

        if (flag_h) {
            humanos.remove(0);
        } else {
            caza_vampiros.remove(0);
        }

        return zom;

    }

  

}
