/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author diak
 */
public class NewClass {
    int nap, radioamator;
    String uzenet;

    NewClass(String[] split) {
        this.nap = nap;
        this.radioamator = radioamator;
        this.uzenet = uzenet;
    }
    
    
     public NewClass(int nap, int radioamator, String uzenet) {
        String[] elements = null;
        int nap = Integer.parseInt(elements[0]);
        int radioamator = Integer.parseInt(elements[1]);
        String uzenet = elements[2];
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public int getRadioamator() {
        return radioamator;
    }

    public void setRadioamator(int radioamator) {
        this.radioamator = radioamator;
    }

    public String getUzenet() {
        return uzenet;
    }

    public void setUzenet(String uzenet) {
        this.uzenet = uzenet;
    }
    
    @Override
    public String toString() {
        return "NewClass{" + "nap=" + nap + ", radioamator=" + radioamator + ", uzenet=" + uzenet + '}';
    } 
    
}
