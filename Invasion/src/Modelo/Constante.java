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
public class Constante {
   
    public static int CALENTAMIENTO = 1;
    public static int ENFRIAMIENTO = 2;
    public static int INVASION = 3;
    public static String PATH = "src/datos.bin";
    
    public static boolean getTocadoProbabilidad(int num_total, int num_probabilidad) {
        return getNumeroAleatorio(1, num_total) <= num_probabilidad;
    }

    public static int getNumeroAleatorio(int min, int max) {
        Random random = new Random();
        int num;
        num = random.nextInt(max - min + 1) + min;

        return num;
    }
}
