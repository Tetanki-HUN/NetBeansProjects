/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cegesauto;

/**
 *
 * @author MSI
 */
public class Cegesauto {
    int nap, ora, perc, km;
    String rendszam, azonosito;
    boolean kibe;

    public int getPerc() {
        return perc;
    }

    public void setPerc(int perc) {
        this.perc = perc;
    }

    
    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }


    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public boolean isKibe() {
        return kibe;
    }

    public void setKibe(boolean kibe) {
        this.kibe = kibe;
    }

    public Cegesauto(int nap, int ora, int perc, int km, String rendszam, String azonosito, boolean kibe) {
        this.nap = nap;
        this.ora = ora;
        this.perc = perc;
        this.km = km;
        this.rendszam = rendszam;
        this.azonosito = azonosito;
        this.kibe = kibe;
    }

    @Override
    public String toString() {
        return "Cegesauto{" + "nap=" + nap + ", ora=" + ora + ", km=" + km + ", rendszam=" + rendszam + ", azonosito=" + azonosito + ", kibe=" + kibe + '}';
    }
    
    
}

