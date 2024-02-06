/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epitmenyado;

/**
 *
 * @author diak
 */
public class Epitmenyadoclass {
    private String Utcanev, Hazszam, Adosav;
    private int Adoszam, Alapterulet;


    Epitmenyadoclass(String[] split){
        this.Utcanev = Utcanev;
        this.Hazszam = Hazszam;
        this.Adoszam = Adoszam;
        this.Adosav = Adosav;
        this.Alapterulet = Alapterulet;
    }

    public String getUtcanev() {
        return Utcanev;
    }

    public void setUtcanev(String Utcanev) {
        this.Utcanev = Utcanev;
    }

    public String getHazszam() {
        return Hazszam;
    }

    public void setHazszam(String Hazszam) {
        this.Hazszam = Hazszam;
    }
    
    public String getAdosav() {
        return Adosav;
    }

    public void setAdosav(String Adosav) {
        this.Adosav = Adosav;
    }

    public int getAdoszam() {
        return Adoszam;
    }

    public void setAdoszam(int Adoszam) {
        this.Adoszam = Adoszam;
    }

    public int getAlapterulet() {
        return Alapterulet;
    }

    public void setAlapterulet(int Alapterulet) {
        this.Alapterulet = Alapterulet;
    }

    public Epitmenyadoclass(String Utcanev, String Hazszam, String Adosav, int Adoszam, int Alapterulet) {
        String[] adatok = null;
        this.Adoszam = Integer.parseInt(adatok[0]);
        this.Utcanev = adatok[1];
        this.Hazszam = adatok[2];
        this.Adosav = adatok[3];
        this.Alapterulet = Integer.parseInt(adatok[4]);
    }
    
    
    
    @Override
    public String toString() {
        return "Epitmenyadoclass{" + "Utcanev=" + Utcanev + ", Hazszam=" + Hazszam + ", Adoszam=" + Adoszam + ", Adosav=" + Adosav + ", Alapterulet=" + Alapterulet + '}';
    }
    
    public int ado(int alapterulet, String adosav) {
        int ado = 0;
        int Aadoja = 800;
        int Badoja = 600;
        int Cadoja = 100;
        if (adosav.equals("A")) {
            ado +=alapterulet*Aadoja;
        }
        if (adosav.equals("B")) {
            ado += alapterulet*Badoja;
        }
        if (adosav.equals("C")) {
            ado += alapterulet*Cadoja;
        }
        return ado;
    }
}
