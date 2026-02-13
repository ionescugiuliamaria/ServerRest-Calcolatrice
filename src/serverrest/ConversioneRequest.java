/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class ConversioneRequest {
    private String unita1;
    private String unita2;
    private double valore;
    
    // Costruttore vuoto necessario per GSON
    public ConversioneRequest() {
    }
    
    // Costruttore con parametri
    public ConversioneRequest(String unita1, String unita2, double valore) {
        this.unita1 = unita1;
        this.unita2 = unita2;
        this.valore = valore;
    }
    
    // Getter
    public String getUnita1() {
        return unita1;
    }
    
    public String getUnita2() {
        return unita2;
    }
    
    public double getValore() {
        return valore;
    }
    
    // Setter
    public void setOperando1(String unita1) {
        this.unita1 = unita1;
    }
    
    public void setUnita2(String unita2) {
        this.unita2 = unita2;
    }
    
    public void setValore(double valore) {
        this.valore = valore;
    }
    
    @Override
    public String toString() {
        return "OperazioneRequest{" +
                "unita1=" + unita1 +
                ", unita2=" + unita2 +
                ", valore='" + valore + '\'' +
                '}';
    }
}