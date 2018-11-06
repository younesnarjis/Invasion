/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Constante;
import Modelo.Invasion;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Younes
 */
public class Inicio extends javax.swing.JFrame implements Serializable{

    Invasion invacion;
    int acontecimiento;
    boolean pulsado;

    /**
     * Creates new form Inicio
     */
    public Inicio(Invasion inv) {
        initComponents();
        invacion = inv;
        pulsado = false;
        acontecimiento = 0;
    }

    public void setTodoTextNoEditable() {
        jTextCazaVampInicio.setEditable(false);
        jTextVampirosInicio.setEditable(false);
        jTextZombisInicio.setEditable(false);
        jTextHumanoInicio.setEditable(false);
        jTextVampiros.setEditable(false);
        jTextZombis.setEditable(false);
        jTextHumanos.setEditable(false);
        jTextCazaVamp.setEditable(false);
        jTextInfo.setEditable(false);
        jTextDia.setEditable(false);
        jTextTem.setEditable(false);
    }

    public void setIniciar() {
        setTodoTextNoEditable();
        String h, c, v, z, d, t, s;
        invacion.setGenerarMundo();
        h = invacion.getNumeroHumanos();
        c = invacion.getNumeroHumanosCazaVampiros();
        z = invacion.getNumeroZombies();
        v = invacion.getNumeroVampiros();
        d = invacion.getDia();
        t = invacion.getTemperatura();
        setInfoInicio(h, c, v, z);
        setInfoActual(h, c, v, z, d, t);
        s = "-------------\nInicio del Mundo\n-------------\nDia: " + d + "     Temperatura: " + t;
        s += "\n\nHa nacido " + h + " humanos";
        s += "\nHa nacido " + c + " humanos de caza vampiros";
        s += "\nHa nacido " + v + " vampiros";
        s += "\nHa nacido " + z + " zombies";

        jTextInfo.setText(s);
    }

    public void setInfoInicio(String h, String c, String v, String z) {
        jTextCazaVampInicio.setText(c);
        jTextVampirosInicio.setText(v);
        jTextZombisInicio.setText(z);
        jTextHumanoInicio.setText(h);
    }

    public void setInfoActual(String h, String c, String v, String z, String dia, String t) {
        jTextCazaVamp.setText(c);
        jTextVampiros.setText(v);
        jTextZombis.setText(z);
        jTextHumanos.setText(h);
        jTextDia.setText(dia);
        jTextTem.setText(t);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAvanzarUnDia = new javax.swing.JButton();
        jButtonReiniciar = new javax.swing.JButton();
        ButtonAvanzar10Dias = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextCazaVampInicio = new javax.swing.JTextField();
        jTextVampirosInicio = new javax.swing.JTextField();
        jTextZombisInicio = new javax.swing.JTextField();
        jTextHumanoInicio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextHumanos = new javax.swing.JTextField();
        jTextVampiros = new javax.swing.JTextField();
        jTextZombis = new javax.swing.JTextField();
        jTextCazaVamp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextDia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextInfo = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jTextTem = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButtonCalentamiento = new javax.swing.JButton();
        jButtonEnfriamiento = new javax.swing.JButton();
        jButtonInvasion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAvanzarUnDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAvanzarUnDia.setText("Avanzar un dia");
        jButtonAvanzarUnDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvanzarUnDiaActionPerformed(evt);
            }
        });

        jButtonReiniciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonReiniciar.setText("Reiniciar");
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        ButtonAvanzar10Dias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonAvanzar10Dias.setText("Avanzar 10 dias");
        ButtonAvanzar10Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAvanzar10DiasActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nº Humanos:");

        jLabel2.setText("Nº CazaVamp:");

        jLabel3.setText("Nº Vampiros:");

        jLabel4.setText("Nº Zombis:");

        jTextCazaVampInicio.setColumns(5);
        jTextCazaVampInicio.setText("jTextCazaVamp");

        jTextVampirosInicio.setColumns(5);
        jTextVampirosInicio.setText("jTextVampiros");
        jTextVampirosInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVampirosInicioActionPerformed(evt);
            }
        });

        jTextZombisInicio.setColumns(5);
        jTextZombisInicio.setText("jTextZombies");

        jTextHumanoInicio.setColumns(5);
        jTextHumanoInicio.setText("jTextField1");
        jTextHumanoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHumanoInicioActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("INICIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextHumanoInicio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextCazaVampInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextVampirosInicio)
                            .addComponent(jTextZombisInicio)))
                    .addComponent(jLabel11))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextHumanoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextCazaVampInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextVampirosInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextZombisInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel5.setText("Nº Humanos:");

        jLabel6.setText("Nº CazaVamp:");

        jLabel7.setText("Nº Vampiros:");

        jLabel8.setText("Nº Zombis:");

        jTextHumanos.setColumns(5);
        jTextHumanos.setText("jTextHumanos");

        jTextVampiros.setColumns(5);
        jTextVampiros.setText("jTextVampiros");

        jTextZombis.setColumns(5);
        jTextZombis.setText("jTextVampiros");

        jTextCazaVamp.setColumns(5);
        jTextCazaVamp.setText("jTextCazaVamp");
        jTextCazaVamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCazaVampActionPerformed(evt);
            }
        });

        jLabel9.setText("Dia:");

        jTextDia.setColumns(5);
        jTextDia.setText("jTextDia");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextHumanos))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextCazaVamp))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextVampiros))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(jTextZombis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextHumanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextCazaVamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextVampiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextZombis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Información");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("SIMULADOR");

        jTextInfo.setColumns(20);
        jTextInfo.setRows(5);
        jScrollPane1.setViewportView(jTextInfo);

        jLabel13.setText("Temperatura: ");

        jTextTem.setText("jTextDia");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Acontecimientos:");

        jButtonCalentamiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCalentamiento.setText("Calentamiento Global");
        jButtonCalentamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalentamientoActionPerformed(evt);
            }
        });

        jButtonEnfriamiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonEnfriamiento.setText("Enfriamiento Global");
        jButtonEnfriamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnfriamientoActionPerformed(evt);
            }
        });

        jButtonInvasion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonInvasion.setText("Invasión de Zombies");
        jButtonInvasion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInvasionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButtonCalentamiento)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(38, 38, 38)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel13)
                                                            .addComponent(jLabel14))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTextTem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButtonEnfriamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButtonInvasion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonReiniciar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAvanzarUnDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonAvanzar10Dias)
                                .addGap(210, 210, 210)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextTem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCalentamiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEnfriamiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonInvasion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReiniciar)
                    .addComponent(jButtonAvanzarUnDia)
                    .addComponent(ButtonAvanzar10Dias)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAvanzarUnDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvanzarUnDiaActionPerformed
        // TODO add your handling code here:

        jTextInfo.setText("");
        setPasaUnDia();
        JOptionPane.showMessageDialog(this, "Un dia ha terminado");

    }//GEN-LAST:event_jButtonAvanzarUnDiaActionPerformed

    public void setPasaUnDia() {
        String h, c, v, d, t, z;
        int tem;
        invacion.setPasarDia();
        switch (acontecimiento) {
            case 1:
                tem = 10;
                jTextInfo.append("Acontecimiento : CALENTAMIENTO GLOBAL\n");
                break;
            case 2:
                tem = -10;
                jTextInfo.append("Acontecimiento : ENFRIAMIENTO GLOBAL\n");
                break;
            case 3:
                jTextInfo.append("Acontecimiento : INVACION DE ZOMBIES\n");
                invacion.setCambiarProbabilidadZombies(3);
            default:
                tem = 0;
        }

        //si is 0 no surge acontecimiento 
        if (tem == 0) {
            invacion.setTemperatura();
        } else {
            invacion.setAumentaLaTemperatura(tem);
        }
        invacion.setTranscurrirDia();

        h = invacion.getNumeroHumanos();
        c = invacion.getNumeroHumanosCazaVampiros();
        z = invacion.getNumeroZombies();
        v = invacion.getNumeroVampiros();
        d = invacion.getDia();
        t = invacion.getTemperatura();
        setInfoActual(h, c, v, z, d, t);
        jTextInfo.append(invacion.toString());
        setActivarJButtonAcontecimiento();
    }

    private void ButtonAvanzar10DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAvanzar10DiasActionPerformed
        // TODO add your handling code here:
        jTextInfo.setText("");

        for (int i = 0; i < 10; i++) {
            setPasaUnDia();
        }

        JOptionPane.showMessageDialog(this, "10 dias han terminado");
    }//GEN-LAST:event_ButtonAvanzar10DiasActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {

            FileOutputStream file;
            try {
                file = new FileOutputStream(new File(Constante.PATH));
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(invacion);
                out.close();
            } catch (IOException ex) {
                System.out.println("Excepcion : " + ex);
            }

            System.exit(0);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            invacion.setGenerarMundo();
            setIniciar();
        }
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

    private void jTextCazaVampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCazaVampActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCazaVampActionPerformed

    private void jTextHumanoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHumanoInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHumanoInicioActionPerformed

    private void jTextVampirosInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVampirosInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextVampirosInicioActionPerformed

    private void jButtonCalentamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalentamientoActionPerformed
        // TODO add your handling code here:
        if (!pulsado) {
            pulsado = true;
            acontecimiento = Constante.CALENTAMIENTO;
            jButtonEnfriamiento.setEnabled(false);
            jButtonInvasion.setEnabled(false);
        } else {
            setActivarJButtonAcontecimiento();
        }
    }//GEN-LAST:event_jButtonCalentamientoActionPerformed

    private void jButtonEnfriamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnfriamientoActionPerformed
        // TODO add your handling code here:
        if (!pulsado) {
            pulsado = true;
            acontecimiento = Constante.ENFRIAMIENTO;
            jButtonCalentamiento.setEnabled(false);
            jButtonInvasion.setEnabled(false);
        } else {
            setActivarJButtonAcontecimiento();
        }
    }//GEN-LAST:event_jButtonEnfriamientoActionPerformed

    private void jButtonInvasionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInvasionActionPerformed
        if (!pulsado) {
            pulsado = true;
            acontecimiento = Constante.INVASION;
            jButtonCalentamiento.setEnabled(false);
            jButtonEnfriamiento.setEnabled(false);
        } else {
            setActivarJButtonAcontecimiento();
        }
    }//GEN-LAST:event_jButtonInvasionActionPerformed

    public void setActivarJButtonAcontecimiento() {
        jButtonEnfriamiento.setEnabled(true);
        jButtonInvasion.setEnabled(true);
        jButtonCalentamiento.setEnabled(true);
        acontecimiento = 0;
        pulsado = false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAvanzar10Dias;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAvanzarUnDia;
    private javax.swing.JButton jButtonCalentamiento;
    private javax.swing.JButton jButtonEnfriamiento;
    private javax.swing.JButton jButtonInvasion;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCazaVamp;
    private javax.swing.JTextField jTextCazaVampInicio;
    private javax.swing.JTextField jTextDia;
    private javax.swing.JTextField jTextHumanoInicio;
    private javax.swing.JTextField jTextHumanos;
    private javax.swing.JTextArea jTextInfo;
    private javax.swing.JTextField jTextTem;
    private javax.swing.JTextField jTextVampiros;
    private javax.swing.JTextField jTextVampirosInicio;
    private javax.swing.JTextField jTextZombis;
    private javax.swing.JTextField jTextZombisInicio;
    // End of variables declaration//GEN-END:variables
}
