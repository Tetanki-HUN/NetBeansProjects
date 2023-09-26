/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osztalyok;

/**
 *
 * @author MSI
 */
public class Kutya {

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getTtomeg() {
        return ttomeg;
    }

    public void setTtomeg(int ttomeg) {
        this.ttomeg = ttomeg;
    }


    public Kutya(String nev, String fajta, String szin, int ttomeg) {
        this.nev = nev;
        this.fajta = fajta;
        this.szin = szin;
        this.ttomeg = ttomeg;
    }
    private String nev;
    private String fajta;
    private String szin;
    private int ttomeg;
    
    public String getNev() {
        return nev;
    }
    
    public void setNev(String nev) {
        this.nev = nev;
    }
    
    public void ugat() {
        System.out.println("Can i get an ava ava? AVA AVA");
    }
}

