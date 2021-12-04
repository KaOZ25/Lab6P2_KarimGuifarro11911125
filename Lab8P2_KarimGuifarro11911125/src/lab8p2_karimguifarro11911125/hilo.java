/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_karimguifarro11911125;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author karim
 */
public class hilo extends Thread {

    private JProgressBar progBar_t;
    private JLabel jl;
    private boolean avanzar;
    int vel, lim;
    private boolean vive;

    public hilo() {
    }

    public hilo(JProgressBar progBar_t, JLabel jl, int vel, int lim) {
        this.progBar_t = progBar_t;
        this.jl = jl;
        this.vel = vel;
        this.lim = lim;
        vive = true;
        avanzar = true;
    }

    public JLabel getJl() {
        return jl;
    }

    public void setJl(JLabel jl) {
        this.jl = jl;
    }

    public JProgressBar getProgBar_t() {
        return progBar_t;
    }

    public void setProgBar_t(JProgressBar progBar_t) {
        this.progBar_t = progBar_t;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public int getLim() {
        return lim;
    }

    public void setLim(int lim) {
        this.lim = lim;
    }

    /**
     *
     */
    @Override
    public void run() {
        int dist = 0;
        while (vive) {
            if (avanzar) {
                progBar_t.setValue(dist = dist + vel);
                jl.setText(String.valueOf(dist = dist + vel));
                progBar_t.setMaximum(lim);
                if (dist > lim || dist == lim) {
                    progBar_t.setValue(0);
                    jl.setText(String.valueOf(0));
                    avanzar=false;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
