/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 *
 * @author delfo
 */
public class ConversioneResponse {
    private String unita1;
    private String unita2;
    private double valore;
    private double risultato;
    private String operazione;
    private String timestamp;
    private String versione_api;
    private String request_id;
    
    // Costruttore vuoto necessario per GSON
    public ConversioneResponse() {
    }
    
    // Costruttore con parametri
    public ConversioneResponse(String unita1, String unita2, 
                             double valore, double risultato) {
        this.unita1 = unita1;
        this.unita2 = unita2;
        this.valore = valore;
        this.risultato = risultato;
        this.operazione = String.format("%s %.2f = %s %.2f", 
            unita1, valore, unita2, risultato);
        this.timestamp = LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.versione_api = "3.0";
        this.request_id = UUID.randomUUID().toString();
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
    
    public double getRisultato() {
        return risultato;
    }
    
    public String getOperazione() {
        return operazione;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getVersione_api() {
        return versione_api;
    }

    public String getRequest_id() {
        return request_id;
    }
    
    // Setter
    public void setOperando1(String unita1) {
        this.unita1 = unita1;
    }
    
    public void setOperando2(String unita2) {
        this.unita2 = unita2;
    }
    
    public void setOperatore(double valore) {
        this.valore = valore;
    }
    
    public void setRisultato(double risultato) {
        this.risultato = risultato;
    }
    
    public void setOperazione(String operazione) {
        this.operazione = operazione;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setVersione_api(String versione_api) {
        this.versione_api = versione_api;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }
    
    
}