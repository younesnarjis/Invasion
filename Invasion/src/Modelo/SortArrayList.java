/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Comparator;

/**
 *
 * @author YUYAN Wu
 * @author Younes Narjis
 */
public class SortArrayList implements Comparator<Humano> {

    @Override
    public int compare(Humano t, Humano t1) {
        if (t.getVelocidad() > t1.getVelocidad()) {
            return -1;
        }
        if (t.getVelocidad() < t1.getVelocidad()) {
            return 1;
        }

        return 0;
    }
}
