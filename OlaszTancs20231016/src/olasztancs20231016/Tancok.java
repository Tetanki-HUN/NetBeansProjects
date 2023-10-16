/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olasztancs20231016;

/**
 *
 * @author MSI
 */
public class Tancok {
    private String tanc;
    private String lanyTanc;
    private String fiuTanc;

    public Tancok(String tanc, String lanyTanc, String fiuTanc) {
        this.tanc = tanc;
        this.lanyTanc = lanyTanc;
        this.fiuTanc = fiuTanc;
        
    }

    public String getTanc() {
        return tanc;
    }

    public String getFiuTanc() {
        return fiuTanc;
    }

    public String getLanyTancs() {
        return lanyTanc;
    }

    public void setTanc(String tanc) {
        this.tanc = tanc;
    }

    public void setFiuTanc(String fiuTanc) {
        this.fiuTanc = fiuTanc;
    }

    public void setLanyTancs(String lanyTanc) {
        this.lanyTanc = lanyTanc;
    }
    
    
}
