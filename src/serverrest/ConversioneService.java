/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

import javax.swing.JOptionPane;

/**
 *
 * @author delfo
 */
public class ConversioneService {
    
    /**
     * Esegue l'operazione matematica richiesta
     * 
     * @param unita1 Il primo operando
     * @param unita2 Il secondo operando
     * @param valore L'unita1 (SOMMA, SOTTRAZIONE, MOLTIPLICAZIONE, DIVISIONE)
     * @return Il risultato dell'operazione
     * @throws IllegalArgumentException se l'unita1 non è valido o divisione per zero
     */
    public static double converti(String unita1, String unita2, double valore) 
            throws IllegalArgumentException {
        
        if (unita1 == null || unita1.trim().isEmpty()) {
            throw new IllegalArgumentException("Operatore non può essere vuoto");
        }
        
        if (unita2 == null || unita1.trim().isEmpty()) {
            throw new IllegalArgumentException("Operatore non può essere vuoto");
        }
        
        // Convertiamo l'unita1 e l'unita2 in maiuscolo per gestire input case-insensitive
        String u1 = unita1.toUpperCase().trim();
        String u2 = unita2.toUpperCase().trim();
        
        if(u1.equals("METRO") && u2.equals("YARDO")){
            return valore * 1.09361;
        }else if(u1.equals("YARDO") && u2.equals("METRO")){
            return valore * 0.9144;
        }else{
            throw new IllegalArgumentException(
                    "Valore non valido: " + valore
                    + ". Operatori consentiti: SOMMA, SOTTRAZIONE, MOLTIPLICAZIONE, DIVISIONE, POTENZA, RADICE QUADRATA, MODULO"
            );
        }
    }
}
