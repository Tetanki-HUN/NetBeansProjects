/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viragok;

/**
 *
 * @author MSI
 */
public class Noveny {

    private String nev;
    private String szin;
    private int magas;
    private Boolean evelo;
    
     public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }
    
    public int getMagas() {
        return magas;
    }

    public void setMagas(int magas) {
        this.magas = magas;
    }
    
    public Boolean getEvelo() {
        return evelo;
    }

    public void setMagas(Boolean evelo) {
        this.evelo = evelo;
    }

    public Noveny(String[] adatok) {
        this.nev = adatok[0];
        this.szin = adatok[1];
        this.magas = Integer.parseInt(adatok[2]);
        this.evelo = Boolean.parseBoolean(adatok[3]);
    }
    
    public void fitt() {
        System.out.println("The Fitness grammpacer test is a multi-");
    }
    

}
