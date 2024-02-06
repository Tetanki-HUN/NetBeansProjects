/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaror;

/**
 *
 * @author MSI
 */
public class JarorClass {
    int hour, minut, sec;
    String rendszam;

    JarorClass(String[] split, int hour, int minut, int sec, String rendszam) {
        int setHour = hour;
        int setMinut = minut;
        int setSec = sec;
        String setrendszam = rendszam;
    }

    JarorClass(String[] split, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int minut) {
        this.minut = minut;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "JarorClass{" + "hour=" + hour + ", minut=" + minut + ", sec=" + sec + ", rendszam=" + rendszam + '}';
    }
    
    
}
